package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Set   >> unique  - unordered
      /*
        Set<Integer> set = new HashSet<>();
        //1 2 3 4 5 6 7 8 9
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(4);
        System.out.println(set.size());
        System.out.println(set.contains(3));
        System.out.println(set.contains(5));
        for (int i : set)
        {
            System.out.println(i);
        }
     */

        // List  >> duplicated  - ordered

    /*
       List<Integer> list = new ArrayList<>(5);
        list.add(0,3);
        list.add(1,10);
        list.add(2,5);
        list.add(3,8);
        list.add(4,15);
        list.add(1);
        System.out.println(list.size());
        System.out.println(list.contains(2));
        for (int i : list)
        {
            System.out.println(i);
        }
        */

        // Arraylist  > duplicated     -   ordered    - random access fast  - modify frequently

      /*
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(3,6);
         arrayList.remove(4);
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains(3));
        System.out.println(arrayList.contains(7));
        System.out.println(arrayList);
        */

        HashMap <String,Integer> hashMap = new HashMap<>();
        hashMap.put("ahmed",1);
        hashMap.put("helmi",2);
        System.out.println(hashMap.get("helmi"));
    }
}