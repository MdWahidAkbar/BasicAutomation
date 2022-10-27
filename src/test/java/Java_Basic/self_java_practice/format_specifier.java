package Java_Basic.self_java_practice;

public class format_specifier {

    public static void main(String[] args) {

        //declaring and defining the variables; this is called dynamic initialization
        boolean b = true;
        char c = 'a';
        short s = 3566;
        int i = 23256456;
        float f = 20.2f;
        double d = 10.2;
         /*
        System.out.println("B = "+b);
        System.out.println("c = "+c);
        System.out.println("s = "+s);
        System.out.println("i = "+f);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
          */

        //use of 'format specifier'
        //We have to use 'printf' method for format specifier
        //as all lines come in one line so we need to use escape sequence "new line"
        //as float and double showing too much after. so we need to define how many to print by using '.2"after
        // format specifier
        // even there is many in variables still it will show the defined amount.
        System.out.printf("Boolean B = %b\n",b);
        System.out.printf("Char c = %c\n",c);
        System.out.printf("Short s = %d\n",s);
        System.out.printf("Integer i = %d\n",i);
        System.out.printf("Float f = %.2f\n",f);
        System.out.printf("Double d = %.3f\n",d);



    }//end of main method

}//end of self 2
