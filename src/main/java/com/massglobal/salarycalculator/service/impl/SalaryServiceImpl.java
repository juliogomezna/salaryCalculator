package com.massglobal.salarycalculator.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.massglobal.salarycalculator.model.Employee;
import com.massglobal.salarycalculator.service.SalaryService;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
public class SalaryServiceImpl implements SalaryService {

    private static final String  URI_EMPLOYEES_MASSGLOBAL= "http://masglobaltestapi.azurewebsites.net/api/Employees";

    private final Client client;
    private final WebTarget webTarget;
    private final ObjectMapper mapper;

    public SalaryServiceImpl(){
        client= ClientBuilder.newClient();

       webTarget
                = client.target("http://masglobaltestapi.azurewebsites.net/api/Employees");

        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    }
    @Override
    public  List<Employee> getEmployees() {

       String responseString=client
                .target(URI_EMPLOYEES_MASSGLOBAL)
                .request(MediaType.APPLICATION_JSON)
                .get()
                .readEntity(String.class);

        List<Employee> employees=null;
        try{

            employees = mapper.readValue(responseString, new TypeReference<List<Employee>>() {
            });

            employees.forEach(em -> {em.setAnnualSalary(
                    em.getContractTypeName().equalsIgnoreCase("HourlySalaryEmployee")?
                            120*em.getHourlySalary()*12:em.getMonthlySalary()*12);});


        }catch(Exception e){
            System.out.println(e);

        }
        return employees;
    }

    @Override
    public Employee getEmployeeById(int id){

        return getEmployees().stream()
                .filter(empl -> empl.get_id() == id)
                .findAny()
                .orElse(new Employee());
    }
}
