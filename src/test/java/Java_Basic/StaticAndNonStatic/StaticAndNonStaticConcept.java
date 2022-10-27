package Java_Basic.StaticAndNonStatic;

public class StaticAndNonStaticConcept {


    //Global variables: Scope of global variables is available across the function
    String name = "Tom"; //non static global variable
    static int age = 25; //static global variable

    public static void main(String[] args) {
    //how to call static method
        //1. direct calling
        sum();
        //2.calling by class name
        StaticAndNonStaticConcept.sum();

        //calling Static variable
        System.out.println(age);
        System.out.println(StaticAndNonStaticConcept.age);


        //How to call Non-Static method
        //we have to create object of the class for non static
        StaticAndNonStaticConcept object = new StaticAndNonStaticConcept();
        object.sendMail();

        //calling Non-Static variable
        System.out.println(object.name);

        //Can i access static method/variable by using object reference ? yes but it is not a good practice
        object.sum();

    }//end of main method




    //creating static and non static method


    //non-static method
    public void sendMail(){

        System.out.println("Send Mail method");

    }//end of non static method

    //static method
    public static void sum(){
        System.out.println("sum method");
    }//end of static method






}
