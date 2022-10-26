package com.dgbi.BL;
import com.dgbi.Models.Employee;
import com.dgbi.Models.Person;
import com.dgbi.Models.Professor;
import com.dgbi.Models.Student;

public class PersonFactory {
    public static Person createInstance(String key)
    {
        Person person = null;

        switch (key){
            case "Student":
                person = new Student();
                break;

            case "Employee":
                person = new Employee();
                break;

            case "Professor":
                person = new Professor();
                break;
        }
        return person;
    }
}
// SOLID
