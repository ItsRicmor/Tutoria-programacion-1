package app.pilares;

public class Dog extends Animal{

    public Dog( String name ) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(this.getName() + " dice: Guau Guau Gau...");
    }
    
}
