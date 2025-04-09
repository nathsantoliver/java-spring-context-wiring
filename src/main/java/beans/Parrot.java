package beans;

public class Parrot {

    private String name = "Koko";

    public Parrot() {
        System.out.println("Parrot created");
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }

}
