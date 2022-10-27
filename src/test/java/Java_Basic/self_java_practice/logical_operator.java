package Java_Basic.self_java_practice;

import java.util.Scanner;

public class logical_operator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //logical "&&" and "||" operator
        char ch;
        System.out.print("Print any letter : ");
        ch = input.next().charAt(0);

        /*
        //use of 'or' '||' operator
        //here at least one condition have to be true then the statement will be printed.
        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }//end of if else condition
         */

        //use of 'and' '&&' operator
        //here all the condition have to be true then it will print otherwise only else statement will be printed.
        if (ch>='a' && ch<='z'){
            System.out.println("It is Small letter");
        }
        else if (ch>='A' && ch<= 'Z'){
            System.out.println("It is Capital letter");
        }
        //if we do not use else condition then no statement will be printed if any one condition is false
        else {
            System.out.println("It is not a letter");
        }//end of if else if condition


    }//end of main method

}//end of logical operator
