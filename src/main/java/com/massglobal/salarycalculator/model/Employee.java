package com.massglobal.salarycalculator.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@JsonAutoDetect(isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE,
        creatorVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.NONE)
public class Employee {

    @com.fasterxml.jackson.annotation.JsonProperty(value="id")
    private int id;

    @com.fasterxml.jackson.annotation.JsonProperty(value="name")
    private String name;

    @com.fasterxml.jackson.annotation.JsonProperty(value="roleId")
    private int roleId;

    @com.fasterxml.jackson.annotation.JsonProperty(value="contractTypeName")
    private String contractTypeName;

    @com.fasterxml.jackson.annotation.JsonProperty(value="roleName")
    private String roleName;

    @com.fasterxml.jackson.annotation.JsonProperty(value="roleDescription")
    private String roleDescription;

    @com.fasterxml.jackson.annotation.JsonProperty(value="hourlySalary")
    private double hourlySalary;

    @com.fasterxml.jackson.annotation.JsonProperty(value="monthlySalary")
    private double monthlySalary;

    @com.fasterxml.jackson.annotation.JsonProperty(value="annualSalary")
    private double annualSalary;

    public int get_id() { return id;  }

    public String getName() { return name; }

    public int getRoleId() { return roleId;}

    public String getContractTypeName() { return contractTypeName; }

    public String getRoleName() { return roleName; }

    public String getRoleDescription() { return roleDescription; }

    public double getHourlySalary() { return hourlySalary; }

    public double getMonthlySalary() { return monthlySalary;  }

    public void setId(final int id){ this. id=id; }

    public void setName(final String name){ this.name=name;}

    public void setRoldId(final int rolId) { this.roleId=roleId;}

    public void setContractTypeName(final String contractTypeName) { this.contractTypeName=contractTypeName;}

    public void setRoleName(final String roleName){ this.roleName=roleName;}

    public void setRoleDescription(final String roleDescription) { this.roleDescription=roleDescription;}

    public void setHourlySalary(final double hourlySalary){ this.hourlySalary=hourlySalary; }

    public void SetMonthlySalary(final double monthlySalary) {this.monthlySalary=monthlySalary;}

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

}
