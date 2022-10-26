package com.dgbi.criteries;

import com.dgbi.Models.Employee;
import com.dgbi.Models.Person;

public class EmployeeCriteria extends Criteria{

    public EmployeeCriteria(Employee _person){
        person = _person;
    }

    public void Apply()
    {
        //Financial support criteria
        //Give 500EGP financial support if salary < 5000
        Employee employee = ((Employee)person);
        if(employee.getSalary() < 5000)
            employee.setFinancialSupport(500);
    }
}
