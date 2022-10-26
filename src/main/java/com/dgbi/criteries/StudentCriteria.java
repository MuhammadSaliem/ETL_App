package com.dgbi.criteries;

import com.dgbi.Models.Person;
import com.dgbi.Models.Student;

public class StudentCriteria extends Criteria {

    public StudentCriteria(Person _person){
        person = _person;
    }
    @Override
    public void Apply()
    {
        Student student = ((Student)person);
        student.setFreeTransportation(true);
        student.setInterestfreeLoan(true);
    }
}
