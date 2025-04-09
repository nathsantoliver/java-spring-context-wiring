package main;

import beans.Parrot;
import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // creates an instance of the Spring context based on the configuration class
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // gets a reference to the Person bean from the Spring context
        Person person  = context.getBean(Person.class);

        // gets a reference to the Parrot bean from the Spring context
        Parrot parrot = context.getBean(Parrot.class);

        // prints the person's name to prove that the Person bean is in the context
        System.out.println("Person's name: " + person.getName());

        // prints the parrot's name to prove that the Person bean is in the context
        System.out.println("Parrot's name: " + parrot.getName());

        // prints the person's parrot to prove that there's not yet relationship between the instances
        System.out.println("Person's parrot: " + person.getParrot()); // the output is null

    }

}
