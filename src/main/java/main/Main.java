package main;

import beans.Parrot;
import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // creates an instance of the Spring context based on the configuration class
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person  = context.getBean(Person.class);

        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot: " + person.getParrot());

    }

}
