package com.dgbi.Models;

import com.dgbi.criteries.StudentCriteria;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Student extends Person{

    private boolean interestfreeLoan;
    private boolean freeTransportation;

    public Student()
    {
        criteria = new StudentCriteria(this);
    }

    public Student(int _id, String _name)
    {
        id = _id;
        name = _name;
    }

    public void ApplyCriteria()
    {
        criteria.Apply();
    }

    public void fill(Object obj , ObjectMapper mapper){

        Student student = mapper.convertValue(obj, Student.class);
        this.setName(student.getName());
        this.setId(student.id);
    }

    @Override
    public String toString(){
        return String.format("Student: %d %s %b %b", this.id, this.name, this.freeTransportation, this.interestfreeLoan);
    }


    public boolean getInterestfreeLoan()
    {
        return interestfreeLoan;
    }

    public void setInterestfreeLoan(boolean _interestfreeLoan)
    {
        interestfreeLoan = _interestfreeLoan;
    }

    public boolean getFreeTransportation(){
        return freeTransportation;
    }

    public void setFreeTransportation(boolean _freeTransportation)
    {
        freeTransportation = _freeTransportation;
    }

}
