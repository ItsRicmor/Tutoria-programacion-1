package app.students.models;

import java.util.ArrayList;

public class Student extends Person{
    
    private String carnet;
    private int credits;
    public static ArrayList<Student> studentStore = new ArrayList<Student>();

    public Student(String carnet, int credits, Person person) {
        super(person);
        this.carnet = carnet;
        this.credits = credits;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
}
