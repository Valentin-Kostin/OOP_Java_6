package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public interface SaveInTxt {
    static void saveInTxt(Order order){
        String fileName = "order.txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("Имя клиента: " + order.getClientName() + "\n");
            writer.write("Продукт: " + order.getProduct() + "\n");
            writer.write("Кол-во: " + order.getQnt() + "\n");
            writer.write("Цена: " + order.getPrice() + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
