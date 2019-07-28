package app.students.controllers;

import app.students.models.Student;
import java.util.ArrayList;

public class StudentController {
    
    private static StudentController controller;
    
    // Singleton Pattern
    
    public static StudentController getIntance() {
        if( controller != null ) {
            return controller;
        } else {
            controller = new StudentController();
            return controller;
        }
    }
    private StudentController() {
    }
    
    public boolean add(Student student) {
        boolean isSave = Student.studentStore.add(student);
        return isSave;
    }
    
    public ArrayList<Student> get() {
        return Student.studentStore;
    }
    
    public Student get(String carnet) {
        Student student = null;
        for(Student s : Student.studentStore) {
            if(s.getCarnet().equals(carnet)){
                student = s;
                break;
            }
        }
        return student;
    }
    
    public boolean update( Student newStudent ) {
        Student student = this.get(newStudent.getCarnet()); // Busca el estudiante
        int index = Student.studentStore.indexOf(student); // Busca la posicion
        boolean isUpdated = Student.studentStore.set(index, newStudent) != null; // lo actualiza
        return isUpdated;
    }
    
    public boolean delete( String carnet ){
        Student student = this.get(carnet); // Busca el estudiante
        boolean isDeleted = Student.studentStore.remove(student);
        return isDeleted;
    }
}
