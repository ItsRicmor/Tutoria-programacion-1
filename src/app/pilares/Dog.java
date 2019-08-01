package app.pilares;

import java.util.ArrayList;

public class Dog extends Animal implements IAnimal{

    private static ArrayList<Dog> dogs = new ArrayList<>();
    
    public Dog( String name ) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(this.getName() + " dice: Guau Guau Gau...");
    }

    public static ArrayList<Dog> getDogs() {
        return dogs;
    }

    public static void setDogs(ArrayList<Dog> dogs) {
        Dog.dogs = dogs;
    }
    
    
    
    
}
