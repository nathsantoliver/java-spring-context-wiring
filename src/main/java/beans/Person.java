package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Ella";

    // we need to remove the @autowired annotation if we make the field final to ensure
    // its value cannot be changed after initialization
    private final Parrot parrot;

    @Autowired  // the annotation need to be used over the constructor
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }

}
