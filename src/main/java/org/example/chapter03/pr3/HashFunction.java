package org.example.chapter03.pr3;

public class HashFunction {
    public static void main(String[] args) {
        int hash1 = simpleHash("Hello");
        System.out.println(hash1);
    }

    public static int simpleHash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += c;
        }


        return hash;
    }


}
