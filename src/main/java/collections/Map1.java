package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:zhumeng
 * @desc:
 **/
public class Map1 {
//    public static void main(String[] args) {
//        Map1<String, String> map = new HashMap<>();
//        map.put("a", "A");
//        map.put("b", "B");
//        String val = map.compute("b", (k, v) -> "v"); // 输出 v
//        System.out.println(val);
//        String v1 = map.compute("c", (k, v) -> "v"); // 输出 v
//        System.out.println(v1);


//        Map<String, String> map = new HashMap<>();
//        map.put("a", "A");
//        map.put("b", null);
//
//
//        String v1 = map.compute("a",(k,v)-> "A1");  // 输出 B
//        System.out.println(v1);
//        System.out.println(map.get("a"));
//
//        String v2 = map.compute("b", (k,v)->"aaa");  // 输出 B
//        System.out.println(v2);
//        System.out.println(map.get("b"));


//        List<String> list=new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("a");
//        Map<String, List<Integer>> p=getElementPositions(list);
//        System.out.println(p);
//        p.forEach((k,v) -> {System.out.println("Key = "+k+", Value = "+v);});


//
//        String v1 = map.putIfAbsent("c", "v");  // 输出 NULL
//        System.out.println(v1);
//        System.out.println(map.get("c"));

//    }

    //    public static Map<String, List<Integer>> getElementPositions(List<String> list) {
//        Map<String, List<Integer>> positionsMap = new HashMap<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            positionsMap.computeIfAbsent(list.get(i), k -> new ArrayList<>(1))
//                    .add(i);
//        }
//
//        return positionsMap;
//    }
    public static void main(String[] args) {

        //学生的集合
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", "男", 18));
        students.add(new Student("李四", "男", 20));
        students.add(new Student("韩梅梅", "女", 18));
        students.add(new Student("小红", "女", 45));

        //声明接收结果的 map
        Map<String, Integer> resultMap = new HashMap<>();
        for (Student student : students) {
            resultMap.merge(student.getSex(), student.getAge(), (a, b) -> b + a);
        }
        printResult(resultMap);

    }


    private static void printResult(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("key:" + e.getKey() + "   " + "value:" + e.getValue());
        }
    }


}
