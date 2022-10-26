package com.dgbi.DAL;

import com.dgbi.Models.Employee;
import com.dgbi.Models.Person;
import com.dgbi.Models.Professor;
import com.dgbi.Models.Student;
import com.dgbi.criteries.StudentCriteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DAL {

    String ConnectionString = "jdbc:sqlserver://192.168.1.195;databaseName=test";
    String user = "sa";
    String password = "P@ssw0rd";

    public void ExecuteQurey(String query){

        try {
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(ConnectionString, user, password);
                 Statement stmt = connection.createStatement();
            )  {
                stmt.execute(query);
                System.out.println("Done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
    }

    public void InsertPerson(Person person)
    {
        if(person instanceof Student)
        {
            InsertStudent((Student)person);
            return;
        }

        if(person instanceof Employee)
        {
            InsertEmployee((Employee)person);
            return;
        }

        if(person instanceof Professor)
        {
            InsertProfessor((Professor)person);
            return;
        }
    }

    private void InsertStudent(Student student)
    {
        String query = "Insert INTO Student VALUES(" + student.getId() + ",'" + student.getName() + "'," + ConvertBooleanToBit(student.getInterestfreeLoan()) + "," + ConvertBooleanToBit(student.getFreeTransportation()) + ")";
        ExecuteQurey(query);
    }

    private void InsertEmployee(Employee employee)
    {
        String query = "Insert INTO Employee VALUES(" + employee.getId() + ",'" + employee.getName() + "'," + employee.getSalary() + "," + employee.getFinancialSupport() + ")";
        ExecuteQurey(query);
    }

    private void InsertProfessor(Professor professor)
    {
        String query = "Insert INTO Professor VALUES(" + professor.getId() + ",'" + professor.getName() + "'," + professor.getSalary() + "," + professor.getFund() + ")";
        ExecuteQurey(query);
    }

    private int ConvertBooleanToBit(boolean x)
    {
        if(x)
            return 1;
        else
            return 0;
    }
}
