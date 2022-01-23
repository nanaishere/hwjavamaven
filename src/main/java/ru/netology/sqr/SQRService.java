package ru.netology.sqr;

public class SQRService {
    public int sqrRange(int LowLimit, int UpLimit) {
        int count = 0;
        int i;
        for (i = 10; i <= 99; i++) {
            if (i * i >= LowLimit) {
                System.out.println("Число подходит по нижней границе");
                if (i * i <= UpLimit) {
                    System.out.println("Число подходит по верхней границе");
                    count = count++;
                }
            }


        }
        System.out.println(count);
        return count;
    }
}


