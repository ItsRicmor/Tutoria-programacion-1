
package app.pilares;

public class Main {

    public static void main(String[] args) {
        
        Dog dog = new Dog("Tobi");
        Cat cat = new Cat("Bigotes");
        Duck duck = new Duck("Pato");
        listeningAnimal(duck);
        listeningAnimal(cat);
        listeningAnimal(dog);
    }
    
    public static void listeningAnimal(Animal animal) {
        animal.makeSound(); // El resultado es diferente dependiendo de la clase que lo implemente
    }
    
}
