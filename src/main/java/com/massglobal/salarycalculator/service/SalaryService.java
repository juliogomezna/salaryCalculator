package com.massglobal.salarycalculator.service;

import com.massglobal.salarycalculator.model.Employee;

import javax.ws.rs.core.Response;
import java.util.List;

public interface SalaryService {

    List<Employee> getEmployees();

    Employee getEmployeeById(int id);
}

