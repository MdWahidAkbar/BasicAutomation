package Java_Basic.inheritanceOverridingPolymorphism;

public class testCar {

    public static void main(String[] args) {

        //here 'start' method is common in both parent class(car) and child class(BMW) so the child class method will be executed.
        //Here child class can share/execute all methods of parent class but parent class can't share/execute the methods
        // from child class.

        //here the below is called 'Static Polymorphism' or 'compile-time polymorphism'
        //Polymorphism means point of many, it means method overriding. It execute the method overriding.
        // because it will run the Method Overriding(from child) and all the methods from both Child and Parent class
        BMWchild b = new BMWchild();
        b.start();
        b.stop();//it came from car
        b.refuel();//It came from car
        b.theftSafety();
        b.engine();//it came from vehicle

        System.out.println("================================================");

        carParent c = new carParent();
        c.start();
        c.stop();
        c.refuel();
        //here car can't access in BMW so "b.theftSafety()" can't be executed here

        System.out.println("================================================");


        //child class object can be referred by parent class reference variables.
        //this concept is called "Dynamic Polymorphism" or Run-time polymorphism.
        //this is also called "top casting"
        carParent cl = new BMWchild();
        cl.start();
        cl.stop();
        cl.refuel();
        //here car cant access in BMW so "b.theftSafety()" can't be executed here
        //only method overriding method and parent class methods can be executed and although we created parent class reference variables
        //that is "car cl = new BMW();"
        //this is Dynamic Polymorphism. Parent class reference variable can be created but can't access child class Methods
        // except method overriding

        //Down Casting is not allowed in java
        //It will throw exception:ClassCastException
        BMWchild b1= (BMWchild)new carParent();







    }//.............................



}//..................
