package Java_Basic.Day3_04182020;

import Day3_04182020.Custom_Method;

public class Method_Execution_Classs {

    public static void main(String[] args) {

        //call the method to be executed
        Day3_04182020.Custom_Method.voidAdd(100, 200);


        //Call the return add method
        int abcd = Custom_Method.returnAdd(100, 200);
        System.out.println("new result is "+ (abcd+50));


    }//end of the main method


}//end of the java class
