package com.massglobal.salarycalculator.api;

import com.massglobal.salarycalculator.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Singleton;
import javax.ws.rs.core.Response;

@Component("apiSalaryCalculatorResource")
@Singleton
public class DefaultSalaryCalculatorResource implements SalaryCalculatorResource{

    @Autowired
    SalaryService salaryService;

    @Override
    public Response get() {

        Response resp= Response.ok().type("application/json").entity(this.salaryService.getEmployees())
      .build();
        resp.

    }

    @Override
    public Response getById(String orderId) {
        return Response.ok().type("application/json")
        .entity(this.salaryService.getEmployeeById(Integer.parseInt(orderId))).header("Access-Control-Allow-Origin", "*").build();
    }

}
