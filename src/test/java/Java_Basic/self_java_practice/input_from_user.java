package Java_Basic.self_java_practice;

import java.util.Scanner;

public class input_from_user {
    public static void main(String[] args) {


        //--------------------------------------------------
        /*
        //Escape sequence: "\n = new line; /t= tab(4 space)
        // the total statement must be in quotation
        System.out.println("My name is Md. Wahid Akbar \nand  My cell number is 3475748469");
        System.out.println("3 \t 4");
         */
        //---------------------------------------------------


        //Scanner: Taking input from user
        Scanner input = new Scanner(System.in);
        /*
        // declaring empty int variables
        int number;
        System.out.print("Enter anything =");
        // defining the value for empty int variables
        number = input.nextInt();
        System.out.println("You entered = "+number);
         */
        /*
        //for String
        String Name;
        System.out.print("Enter your name ");
        Name = input.nextLine();
        System.out.println("Welcome Mr "+Name);

         */

        int num1, num2, result;


        System.out.print("Please enter the first number = ");
        num1 = input.nextInt();

        System.out.print("Please enter the second number = ");
        num2 = input.nextInt();

        result = num1+num2;

        if(result >= 5){
            System.out.println("It is a positive result = "+result);
        }
        else if (result <=0 ){
            System.out.println("It is negative = "+result);
        }
        else{
            System.out.println("It is Neutral result = "+result);
        }





    }//end of main method


}//end of self 1