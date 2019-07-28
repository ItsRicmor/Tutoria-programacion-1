package app.pilares;

public abstract class Animal {
    
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    // Metodo abtracto
    public abstract void makeSound();

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
