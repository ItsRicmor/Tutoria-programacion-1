package app.class_object;
/**
 *
 * @author Ricardo Morataya
 */
public class Main {

    public static void main(String[] args) {
        // Instancia de la clase también conocido como objeto
        Person person = new Person("Ricardo", "Morataya");
        System.out.println(person.getName() + " " + person.getLastName());
        
        /**
         * OUTPUT: Ricardo Morataya
         */
    }
    
}
