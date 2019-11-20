package com.massglobal.salarycalculator.api;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api/employees")
public interface SalaryCalculatorResource {

    @javax.ws.rs.GET
    Response get();

    @Path("/{id}")
    @javax.ws.rs.GET
    @javax.ws.rs.Produces({"text/plain"})
    Response getById( @javax.validation.constraints.NotNull @javax.ws.rs.PathParam("id") final java.lang.String orderId);
}
