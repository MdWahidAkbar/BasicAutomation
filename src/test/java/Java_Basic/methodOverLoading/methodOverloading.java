package Java_Basic.methodOverLoading;

public class methodOverloading {

    public static void main(String[] args) {

        //Now i am making the below "sum" method as static to call for execution.
    methodOverloading obj = new methodOverloading();

    obj.sum();
    obj.sum(10);
    obj.sum(10,20);



    }//--------------------------

    //same method with same parameter is not allowed.

    //we can't create method inside another method
    //Duplicate method: same method name with same parameters are not allowed

    //main method also overloading possible with different type and parameter also possible.
    //but make sure the parameter datatype is different
    //example
    public static void main(int p) {// 1 para

    }
    public static void main(int p, int q) { //2 para

    }

    //Method Overloading: When the method name is same with different arguments or different parameter within
    // the same class

    //zero input parameter
    public void sum(){
        System.out.println("sum method...........zero para");
    }

    //1 input parameter
    public void sum(int i){
        System.out.println("sum method..........1 input para");
        System.out.println(i);
    }
    //2 input parameter
    public void sum(int k, int i){
        System.out.println("sum method.......2 input para");
        System.out.println(k+i);
    }

}//.......................
