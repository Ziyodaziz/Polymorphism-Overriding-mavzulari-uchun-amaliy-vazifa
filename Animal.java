package PolymorphismOverriding;

public class Animal {


    public void sound(){
        System.out.println("sound");
    }

    public void getName(){
        System.out.println("getName");
    }

    public static void main(String[] args) {
        Animal dog =  new Dog();
        Animal cat = new Cat();
        Animal duck = new Duck();

        dog.getName();
        dog.sound();
        cat.getName();
        cat.sound();
        duck.getName();
        duck.sound();
    }


}
