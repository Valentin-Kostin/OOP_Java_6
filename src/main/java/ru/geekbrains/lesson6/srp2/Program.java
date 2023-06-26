package ru.geekbrains.lesson6.srp2;


import java.io.*;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order1 = new Order("", "", 0, 0);
        Order order = new Order();
        order1.inputFromConsole();
        SaveInJson.saveInJson(order1);
        SaveInTxt.saveInTxt(order1);
        ShowFromTxt.loadFromTxt();
        Order order2 = new Order(new FromConsole("Имя:").toString(),
                                new FromConsole("Продукт:").toString(),
                Integer.parseInt((new FromConsole("Кол-во:")).toString()),
                Integer.parseInt((new FromConsole("Цена:")).toString()));
        SaveInTxt.saveInTxt(order2);
        ShowFromTxt.loadFromTxt();

    }

}
