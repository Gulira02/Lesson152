package person;
import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

import static person.Person.age;

//import static person.Person.age;

public class Main {
        public static void main(String[] args) {
            Builder builder = new Builder("Mura");
            Driver driver = new Driver("Mara");
            Programmer programmer = new Programmer("Serig");
            builder.working();
            driver.working();
            programmer.working();
            System.out.println(builder);
            System.out.println(driver);
            System.out.println(programmer);
         Person.age=25;
            System.out.println(age);
        }
    }
