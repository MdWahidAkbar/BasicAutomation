package Java_Basic.self_java_practice;

public class loop_for_while_do {

    public static void main(String[] args) {

        /*
        //for loop------------------------------------------
        //starting will be from i= and and end with i<=. i++ is the increment
        //for(int i = 1; i <= 10; i++) { //we can also use i=i+1
            System.out.println("Bangladesh");
            //if we use it then there will be the value of 'i' before the printed statement.
            //System.out.println(i+" Bangladesh");
            //if we want to print just value of i then we should give the statement like below
            //System.out.println(i);
        //}

        //If we want to print the even number between 1 to 10 then
        //we need to define the for loop like below
        //each time value of i is increasing by 2

            for (int i = 2; i <= 20; i = i+2) {
                System.out.println(i);
                //if I want to print the odd number between 5 to 20 then the syntax will ne like below
                //for (int i = 5; i <= 20; i = i+2){
                //System.out.println(i);
            //}
    }//end of for loop
         */

        /*
        //while loop-------------------------------------------------------
        int i = 0;
        while ( i <=20 ){
            System.out.println(i+" Bangladesh");//I can apply just like above for loop syntax to practice
            i=i+1;
        }//end of while loop
         */

       //do while loop-----------------------------------------
        int i = 3;
        do{
            System.out.println(i+" Bangladesh");
            i=i+2;
        }while (i <= 15);


    }//end of main method

}//end of loop for and while
