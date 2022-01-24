package ru.netology.sqr;

public class SQRService {
    public int sqrRange(int lowLimit, int upLimit) {
        int count = 0;
        int i;
        for (i = 10; i <= 99; i++) {
            if (i * i >= lowLimit) {
                System.out.println("Число подходит по нижней границе");
                if (i * i <= upLimit)
                    System.out.println("Число подходит по верхней границе");
                count = count++;
            }


        }
        System.out.println(count);
        return count;
    }
}


