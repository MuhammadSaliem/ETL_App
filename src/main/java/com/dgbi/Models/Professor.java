package com.dgbi.Models;
import com.dgbi.criteries.ProfessorCriteria;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Professor extends Person {
    private float salary;
    private float fund;

    public Professor()
    {
        criteria = new ProfessorCriteria(this);
    }

    public Professor(int _id, String _name, float _salary)
    {
        id = _id;
        name = _name;
        salary = _salary;
    }

    public void ApplyCriteria()
    {
        criteria.Apply();
    }

    public void fill(Object obj , ObjectMapper mapper){
        Professor professor = mapper.convertValue(obj, Professor.class);
        this.setId(professor.id);
        this.setName(professor.getName());
        this.setSalary(professor.salary);
    }


    public float getSalary()
    {
        return salary;
    }

    public void setSalary(float _salary)
    {
        salary = _salary;
    }

    public float getFund(){
        return fund;
    }

    public void setFund(float _fund)
    {
        fund = _fund;
    }

    @Override
    public String toString(){
        return String.format("Professor: %d %s %f %f", this.id, this.name, this.salary, this.fund);
    }

}
