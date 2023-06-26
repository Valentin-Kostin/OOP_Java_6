package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class FromConsole {

    protected Scanner scanner2 = new Scanner(System.in);

    public String strin;

    public FromConsole(String mass) {
        this.strin = inputFromConsole(mass);
    }

    public  String inputFromConsole(String massege){
            strin = prompt(massege);
            return strin;
        }

        private  String prompt(String message){
            System.out.println(message);
            return scanner2.nextLine();
        }




}
