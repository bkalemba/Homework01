package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

    public static Map<Integer, Integer> checkRand(int amount, int interval) {
        Map<Integer, Integer> toReturn = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            int number = random.nextInt(interval);
            if (toReturn.containsKey(number)) {
                toReturn.put(number, toReturn.get(number) + 1);
            } else {
                toReturn.put(number, 1);
            }
        }
        return toReturn;
    }
}
