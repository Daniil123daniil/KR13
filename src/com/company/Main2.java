package com.company;

import com.company.DAOSuper2.CarEntranceDao1;
import com.company.fashiondesigner2.CarEntrance1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        menu();
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();

        while (var != 0) {
            if (var == 1) {
                CarEntrance1 carEntrance = new CarEntrance1();
                CarEntranceDao1 carEntranceDao = new CarEntranceDao1();

                System.out.println("Введите номер автомобиля - ");
                carEntrance.setNumber(scanner.next());
                System.out.println("Введите дату проезда автомобиля - ");
                carEntrance.setDate(scanner.next());

                carEntranceDao.create(carEntrance);
            }
            menu();
            var = scanner.nextInt();
        }
    }

    public static void menu(){
        System.out.println("1 - Добавить данные, 0 - Выход");
    }
}