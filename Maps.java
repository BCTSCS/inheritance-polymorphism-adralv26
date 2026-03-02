import java.util.*;
public class Maps{
    public static void main(String[] args) {
        
        // long start = System.nanoTime();
        // Map<String,Integer> map1 = new HashMap<>();
        // map1.put("8",1);
        // map1.put("5",4);
        // map1.put("2",6);
        // map1.put("6",5);
        // long end = System.nanoTime();

        // long time = end - start;
        // System.out.println("Hashmap : " + time + " ns");
        // System.out.println(map1);

        // start = System.nanoTime();
        // Map<String,Integer> map2 = new TreeMap<>();
        // map2.put("8",1);
        // map2.put("5",4);
        // map2.put("2",6);
        // map2.put("6",5);
        // end = System.nanoTime();
        // long time2 = end - start;
        // System.out.println("Treemap : " + time2 + " ns");
        // System.out.println(map2);

        long start = System.nanoTime();
        Map<String,Integer> map10 = new HashMap<>();
        map10.put("7",1);
        map10.put("4",3);
        map10.put("2",26);
        map10.put("3",8);
        map10.put("98",5);
        map10.put("22",41);
        map10.put("14",12);
        map10.put("100",10);
        map10.put("8",9);
        map10.put("6",2);
        long end = System.nanoTime();

        long time = end - start;
        System.out.println("Hashmap : " + time + " ns");
        System.out.println(map10);
    }

}