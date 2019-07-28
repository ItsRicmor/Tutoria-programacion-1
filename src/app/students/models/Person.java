package app.students.models;

public class Person {
    
    protected String id;
    protected String name;
    protected String lasName;

    public Person() {
    }
    
    public Person(String id, String name, String lasName) {
        this.id = id;
        this.name = name;
        this.lasName = lasName;
    }
    
    public Person(Person person) {
        this.id = person.id;
        this.name = person.name;
        this.lasName = person.lasName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }
    
}
