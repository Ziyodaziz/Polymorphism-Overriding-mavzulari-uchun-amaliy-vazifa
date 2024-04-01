package PolymorphismOverriding;

public class Duck extends Animal{

    public void sound(){
        System.out.println("Duck sound -> quack quack");
    }

    public void getName(){
        System.out.println("Duck name -> Duck");
    }
}
