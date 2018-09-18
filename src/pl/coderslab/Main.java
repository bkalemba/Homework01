package pl.coderslab;

import pl.coderslab.collection.GenerateRandom;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer,Integer> randoms = GenerateRandom.checkRand(500000,10);
        System.out.println(randoms);
    }
}
