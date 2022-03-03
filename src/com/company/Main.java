package com.company;

public class Main {

    public static void main(String[] args) {
//1
        byte varByte = 1;
        short varShort = 300;
        int varInt = 10000000;
        long varLong = 1L;
        float varFloat = 100.3f;
        double varDouble = 100.3d;

//2
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float summaryWeight = firstBoxerWeight + secondBoxerWeight;
        float deltaWeigth = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница в весе между первый бойцом и вторым: " + deltaWeigth + "кг");

//3
        int bananaCount = 5;
        int milkSize = 2;
        int icecreamCount = 2;
        int eggsCount = 4;

        int bananaWeight = 80;
        int milkWeight = 105;
        int icecreamWeight = 100;
        int eggsWeight = 70;

        int breakfastWeight = bananaCount*bananaWeight + milkSize*milkWeight + icecreamCount*icecreamWeight + eggsCount*eggsWeight;
        float breakfastWeightKg = breakfastWeight / 1000f;

        System.out.println("Вес завтрака в граммах: "+breakfastWeight);
        System.out.println("Вес завтрака в кг: "+breakfastWeightKg);

//4
        int fullWeight = 7000;
        int deltaWeightPerDay1 = 250;
        int deltaWeightPerDay2 = 500;

        float summDays1 = fullWeight / (float)deltaWeightPerDay1;
        float summDays2 = fullWeight / (float)deltaWeightPerDay2;

        float avgDays = (summDays1 + summDays2)/2f;

        System.out.println("Если терять по 250грамм понадобится: " + summDays1 + " дней");
        System.out.println("Если терять по 500грамм понадобится: " + summDays2 + " дней");
        System.out.println("Среднее количество дней: " + avgDays);

//5
        int salaryMasha =  67_760;
        int salaryDenis =  83_690;
        int salaryKristi =  76_230;

        float changeSalary = 1.1f;

        float salaryMashaNew =  salaryMasha * changeSalary;
        float salaryDenisNew =  salaryDenis * changeSalary;
        float salaryKristiNew =  salaryKristi * changeSalary;

        float deltaSalaryMasha = salaryMashaNew - salaryMasha;
        float deltaSalaryDenis = salaryDenisNew - salaryDenis;
        float deltaSalaryKristi = salaryKristiNew - salaryKristi;

        System.out.println("Маша теперь получает " + salaryMashaNew + " рублей. Годовой доход вырос на " + 12*deltaSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisNew + " рублей. Годовой доход вырос на " + 12*deltaSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristiNew + " рублей. Годовой доход вырос на " + 12*deltaSalaryKristi + " рублей");
    }
}
