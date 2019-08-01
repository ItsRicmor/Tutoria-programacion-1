/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pilares;

/**
 *
 * @author Ricardo Morataya
 */
public class Duck extends Animal{

    public Duck(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(this.getName() + ": cuack");
    }
    
}
