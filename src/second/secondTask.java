package second;

import java.util.Scanner;

public class secondTask {

    public static void main(String[] args) {
        System.out.println("1 Ruble" + "\n2 Dollar" + "\n3 Euro" + "\n4 Yuan" + "\n5 Lyra");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите валюту:");
        int choice = 0;

        if (sc.hasNextInt()) {
            choice = sc.nextInt();
            if(choice < 1 || choice > 5){
                System.out.println("К сожалению, такой позиции нет.");
                return;
            }
        } 
        else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            return;
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Введите сумму:");
        double amount = 0.0;
        if (s.hasNextDouble()) {
            amount = s.nextDouble();
            System.out.println("Спасибо! Вы ввели сумму " + amount);
        } 
        else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            return;
        }
        
        switch (choice) {
            case 1:
                System.out.println("Производим конвертацию...");
                System.out.println(amount + " Ruble = " + (amount * 0.010282) + " Dollar");
                System.out.println(amount + " Ruble = " + (amount * 0.009426) + " Euro");
                System.out.println(amount + " Ruble = " + (amount * 0.073574) + " Yuan");
                System.out.println(amount + " Ruble = " + (amount * 0.351981) + " Lyra");
                break;
            case 2:
                System.out.println("Производим конвертацию валюты...");
                System.out.println(amount + " Dollar = " + (amount * 97.26) + " Ruble");
                System.out.println(amount + " Dollar = " + (amount * 0.91745) + " Euro");
                System.out.println(amount + " Dollar = " + (amount * 7.11) + " Yuan");
                System.out.println(amount + " Dollar = " + (amount * 34.21) + " Lyra");
                break;
            case 3:
                System.out.println("Производим конвертацию валюты...");
                System.out.println(amount + " Euro = " + (amount * 106.08) + " Ruble");
                System.out.println(amount + " Euro = " + (amount * 1.09) + " Dollar");
                System.out.println(amount + " Euro = " + (amount * 7.75) + " Yuan");
                System.out.println(amount + " Euro = " + (amount * 37.28) + " Lyra");
                break;
            case 4:
                System.out.println("Производим конвертацию валюты...");
                System.out.println(amount + " Yuan = " + (amount * 13.59) + " Ruble");
                System.out.println(amount + " Yuan = " + (amount * 0.140607) + " Dollar");
                System.out.println(amount + " Yuan = " + (amount * 0.129) + " Euro");
                System.out.println(amount + " Yuan = " + (amount * 4.81) + " Lyra");
                break;
            case 5:
                System.out.println("Производим конвертацию валюты...");
                System.out.println(amount + " Lyra = " + (amount * 2.84) + " Ruble");
                System.out.println(amount + " Lyra = " + (amount * 0.029234) + " Dollar");
                System.out.println(amount + " Lyra = " + (amount * 0.026821) + " Euro");
                System.out.println(amount + " Lyra = " + (amount * 0.207911) + " Yuan");
                break;
            default:
                System.out.println("Некорректное значение");
        }   
    }

}
