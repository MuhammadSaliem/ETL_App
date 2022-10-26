package com.dgbi.Models;

import com.dgbi.criteries.EmployeeCriteria;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee extends Person {
    private float salary;
    private float financialSupport;

    public Employee(){
        criteria = new EmployeeCriteria(this);
    }

    public Employee(int _id, String _name, float _salary)
    {
        id = _id;
        name = _name;
        salary = _salary;
    }

    public float getSalary()
    {
        return salary;
    }

    public void setSalary(float _salary)
    {
        salary = _salary;
    }

    public float getFinancialSupport(){
        return financialSupport;
    }

    public void setFinancialSupport(float _financialSupport)
    {
        financialSupport = _financialSupport;
    }

    public void fill(Object obj , ObjectMapper mapper){

        Employee employee = mapper.convertValue(obj, Employee.class);
        this.setName(employee.getName());
        this.setId(employee.id);
        this.setSalary(employee.salary);
    }

    public void ApplyCriteria(){
        criteria.Apply();
    }

    public String toString(){
        return String.format("Employee: %d %s %f %f", this.id, this.name,this.salary, this.financialSupport);
    }
}
