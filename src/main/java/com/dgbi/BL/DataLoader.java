package com.dgbi.BL;

import com.dgbi.DAL.DAL;
import com.dgbi.Models.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

import java.nio.file.Paths;
import java.util.*;

public class DataLoader {

    public void ReadJsonFile()
    {
        try{
            //Instantiate an objectMapper to read Objects from Json file
            ObjectMapper mapper = new ObjectMapper();

            //By using MultiMap
            //Every "Key" has "ArrayList of Objects" .. key => [Objects]
            MultiMap<String, Object> map = new MultiValueMap<>();

            Person person;
            DAL dal = new DAL();

            map = mapper.readValue(Paths.get("/Users/Saleem/Desktop/test.json").toFile(), MultiValueMap.class );

            for (String key : map.keySet()) {
                ArrayList arr = ((ArrayList)map.get(key));
                for(int i = 0; i < arr.size(); i++)
                {
                    person = PersonFactory.createInstance(key); //factory pattern

                    Object obj = ((ArrayList)map.get(key)).get(i);

                    person.fill(obj, mapper); //Fill person data from Json object
                    person.ApplyCriteria();

                    System.out.println(person.toString()); //log person to the console

                    dal.InsertPerson(person); //Insert person into Database
                }
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
