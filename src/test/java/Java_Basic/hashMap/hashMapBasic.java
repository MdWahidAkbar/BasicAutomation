package Java_Basic.hashMap;

import javax.swing.*;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapBasic {
    public static void main(String[] args) {


        //no order - no indexing
        //stores value -- key <k,v>
        //key can't be duplicated
        //can store n number of null value but only one null key
        //hashmap is not thread-safe means it is unsynchronized.




        HashMap<String, String> capitalMap = new HashMap<String, String>();

        capitalMap.put("Bangladesh","Dhaka");
        capitalMap.put("USA","Washington DC");
        capitalMap.put("India","New Delhi");
        capitalMap.put("India","Mumbai");//it is duplicate so it will show latest value "Mumbai".
        capitalMap.put("Pakistan","Lahore");
        capitalMap.put(null,"Berlin");
        capitalMap.put(null,"London");
        capitalMap.put("Russia",null);
        capitalMap.put("France",null);


        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("Germany"));//i didn't define this
        System.out.println(capitalMap.get("India"));
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("France"));


        //iterator
        //there is no iterator in hashmap so we need to import library. We have to use ketSet
        Iterator<String> it = capitalMap.keySet().iterator();

        while (it.hasNext()){
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("key = "+key+" & value = "+value);
        }




    }//..............................



}//...........................
