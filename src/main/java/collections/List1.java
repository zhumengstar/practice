package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:zhumeng
 * @desc:
 **/
public class List1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");//2
        list.add("3");
        list.add(1,"9");
        System.out.println(list);
//        list.size();
//        String  a=list.set(0,"9");
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(a);
//        System.out.println(list.indexOf("1"));
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());
//        System.out.println(list.contains("2"));
    }
}
