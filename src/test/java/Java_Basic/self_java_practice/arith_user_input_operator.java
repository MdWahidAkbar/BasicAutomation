package Java_Basic.self_java_practice;

import java.util.Scanner;

public class arith_user_input_operator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declaring Variables
        int num1, num2, result;

        /*
        //defining the variables
        num1 = 20;
        num2 = 10;

         */

        //or if we want user to give input
        System.out.print("Please enter the first number =");
        num1 = input.nextInt();

        System.out.print(" Please enter the second number =");
        num2 = input.nextInt();

        result = num1+num2;
        System.out.println("My sum is = "+result);

        result = num1-num2;
        System.out.println("My subtracted sum is = "+result);

        result = num1*num2;
        System.out.println("My Multiplication sum is = "+result);

        //as the result is in fraction so we need to use "double" and also declare a new double int and need to put
        //(double) before any of the input from user)
        double result2 = (double)num1/num2;
        System.out.println("My devided sum is = "+result2);

        result = num1%num2;
        System.out.println("My remainder sum is = "+result);




    }//end of main method

}//end of arithmetic operator
