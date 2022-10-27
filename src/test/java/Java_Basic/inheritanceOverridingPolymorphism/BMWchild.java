package Java_Basic.inheritanceOverridingPolymorphism;


//here i used 'extends' it means 'car' is parent and 'BMW' is child.By this way child class(BMW)
//can access/execute all methods from parent class but parent(car) class can't access/execute the methods from child(BMW )class.
//BMW can access car and vehicle class. car can access vehicle but not BMW class methods but vehicle class can access either car or BMW
// This is inheritance concept.
public class BMWchild extends carParent {


    //when same method is common in parent class and Child class with same arguments, is called "Method Overriding"
    public void start(){ //this is Overridden Method.
    System.out.println("BMW .............start");

    }//end of start method

    public void theftSafety(){
        System.out.println("BMW ...........theftSafety");

    }//end of theftSafety method










}//end of BMW class
