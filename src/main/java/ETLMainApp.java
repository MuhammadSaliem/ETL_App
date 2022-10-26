import com.dgbi.BL.DataLoader;


public class ETLMainApp {

    public static void main(String[] args){

        DataLoader dataLoader = new DataLoader();
        dataLoader.ReadJsonFile();


/*        Person person;
        person = new Student();
        person.fill();
        System.out.println(person.getClass());*/

/*        try{
            ObjectMapper mapper = new ObjectMapper();
            MultiMap<String, Object> map = new MultiValueMap<>();

            map = mapper.readValue(Paths.get("/Users/Saleem/Desktop/test.json").toFile(), MultiValueMap.class );

            System.out.println(map);

            for (String key : map.keySet()) {
                System.out.println(key);
                ArrayList arr = ((ArrayList)map.get(key));
                for(int i = 0; i < arr.size(); i++)
                {
                    System.out.println(arr.get(i));
                }
            }

            //Student s = mapper.convertValue(map.get("Student")).get(1), new TypeReference<Student>() {});
            Student student = mapper.convertValue(((ArrayList)map.get("Student")).get(1), Student.class);
            List<Student> lst = mapper.convertValue((ArrayList) map.get("Student"), new TypeReference<List<Student>>() {});
            System.out.println(((ArrayList)map.get("Student")).get(1).getClass());
            System.out.println(lst);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }*/


        /*
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("/Users/Saleem/Desktop/course.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String name = (String)jsonObject.get("Name");
            String course = (String)jsonObject.get("Course");
            JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
            System.out.println("Name: " + name);
            System.out.println("Course: " + course);
            System.out.println("Subjects:");
            Iterator iterator = subjects.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            //Create object mapper instance
            /*
            ObjectMapper mapper = new ObjectMapper();


            //Convert a json string to book object
            Book[] books = mapper.readValue(Paths.get("/Users/Saleem/Desktop/Book.json").toFile(), Book[].class);
            //print book

            System.out.println(books[0]);

            for(int i =0; i< books.length; i++)
            {
                System.out.println(books[i].title);
            }


        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

             */

            /*




        DAL dal = new DAL();

        Student student = new Student(1, "Mohamed");

        Professor professor = new Professor(1, "Khaled", 14000);

        Employee employee1 = new Employee(1, "Karim", 4000);
        Employee employee2 = new Employee(2, "Moustafa", 6000);

        dal.InsertStudent(student);
        dal.InsertEmployee(employee1);
        dal.InsertEmployee(employee2);
        dal.InsertProfessor(professor);

    */

    }
}
