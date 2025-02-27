package org.example.chapter03.pr4;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        CustomKey key1 = new CustomKey("키1", 3, 5.0);
        CustomKey key2 = new CustomKey("키1", 3, 5.0);
        CustomKey key3 = new CustomKey("키1", 3, 5.5);

        HashSet<CustomKey> set = new HashSet<>();
        set.add(key1);
        set.add(key2);
        set.add(key3);

        HashMap<CustomKey, String> map = new HashMap<>();
        map.put(key1, "value1");

        String found = map.get(key1);
        System.out.println(found);
        System.out.println(key1.hashCode());

        key1.setIntValue1(4);
        String found2 = map.get(key1); // hashCode값이 바껴서 못 가져올 것 - 조회할 때 key -> hashCode -> 해당하는 값을 가져옴
        System.out.println(found2);
        System.out.println(key1.hashCode());

    }


}
