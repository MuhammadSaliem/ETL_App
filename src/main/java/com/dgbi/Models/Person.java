package com.dgbi.Models;

import com.dgbi.criteries.Criteria;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Person {
    protected int id;
    protected String name;
    protected Criteria criteria;

    public Person(){
        criteria = new Criteria(this);
    }

    public void ApplyCriteria()
    {
        criteria.Apply();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int _id)
    {
        id = _id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String _name)
    {
        name = _name;
    }

    public Criteria getCriteria(){
        return criteria;
    }

    public void setCriteria(Criteria _criteria)
    {
        criteria = _criteria;
    }

    public void fill(Object obj, ObjectMapper mapper){

    }

    @Override
    public String toString(){
        return "";
    }
}
