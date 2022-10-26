package com.dgbi.criteries;

import com.dgbi.Models.Person;
import com.dgbi.Models.Professor;

import java.util.Random;

public class ProfessorCriteria extends Criteria {

    public ProfessorCriteria(Person _person){
        person = _person;
    }
    @Override
    public void Apply()
    {
        Random rand = new Random();
        int fund = rand.nextInt(5000) + 5000;
        ((Professor)person).setFund(fund);
    }
}
