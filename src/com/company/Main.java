package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(10);
        int height = rand.nextInt(10);
        actions[0] = new Human("Вася", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(10);
        actions[1] = new Robot("Луноходик1", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(10);
        actions[2] = new Cat("Мурзик", distance, height);

        Barriers[] barriers = new Barriers[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new runningTrack("Трасса " + i, distance);
            } else {
                barriers[i] = new Wall("Стена " + i, height);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Прошел!!");
            } else {
                System.out.println("Не прошел!!");
            }
        }
    }
}


