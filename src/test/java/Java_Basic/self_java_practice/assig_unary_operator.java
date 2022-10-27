package Java_Basic.self_java_practice;

public class assig_unary_operator {

    public static void main(String[] args) {

        /*
        int x = 3;
        int y = 2;

        x+=y;
        System.out.println("X = "+x);
        x-=y;
        System.out.println("X = "+x);
        x*=y;
        System.out.println("X = "+x);
        x/=y;
        System.out.println("X = "+x);
        x%=y;
        System.out.println("X = "+x);

         */

        int x= 25;
        int result;

        //unary ; +,-, and increment(pre & post) ++, decrement (pre & post)--
        result = +x;
        System.out.println("X = "+result);
        result = -x;
        System.out.println("X = "+result);

        result = x++;//value of X will remain same but it get any X later then it will add 1 each time
        System.out.println("X = "+result);
        result = x;//this will be 26 as added 1
        System.out.println("X = "+result);
        result = ++x;//this will be as previous x =26 and add 1 earlier as pre increment
        System.out.println("X = "+result);
        result = x;//this will be 27 as already increased by immediate previous statement
        System.out.println("X = "+result);

        result = x--;//value is 27 as immediate previous was 27
        System.out.println("X = "+result);
        result = x;//value will be 26 as a result of post decrement
        System.out.println("X = "+result);
        result = --x;//value will be 25 as it is pre decrement
        System.out.println("X = "+result);
        result = x;//value will be 25 as immediate was pre decrement
        System.out.println("X = "+result);



    }
}
