package org.example;

import org.example.Interfaces.SetPrizes;
import org.example.Interfaces.StartLottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lottery implements SetPrizes, StartLottery {
    public List<Toy> setLotteryPrizes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько игрушек будет участвовать в лотереи? ");
        int number = sc.nextInt();
        List<Toy> toys = new ArrayList<Toy>();
        for (int i = 0; i < number; i++) {
            System.out.println("Введите id игрушки ");
            int id  = sc.nextInt();
            System.out.println("Введите название игрушки ");
            String n  = sc.nextLine();
            String name  = sc.nextLine();
            System.out.println("Введите вес игрушки ");
            double weight  = sc.nextDouble();
            Toy toy = new Toy(id, name, weight);
            toys.add(toy);
        }
        return toys;
    }

    public void startLottery(){
        ToyStore toyStore = new ToyStore(setLotteryPrizes());
        toyStore.saveToyForLottery();
        System.out.println("Лотерия проведена. Результаты Вы можете посмотреть в файле Toys.txt");
    }
}
