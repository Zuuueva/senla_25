package fird;

import java.security.SecureRandom;
import java.util.Scanner;

public class firdTask {

    public static void main(String[] args) {
        System.out.println("Введите длину пароля от 8 до 12 символов:");
        Scanner s = new Scanner(System.in);
        int choice = 0;
        
        if (s.hasNextInt()) {
            choice = s.nextInt();
            System.out.println("Спасибо! Вы ввели число " + choice);
            if(choice < 8 || choice > 12){
                System.out.println("Необходимо ввести число от 8 до 12. Попробуйте еще раз.");
                return;
            }
            else{
                String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%()*+,-./";
                SecureRandom rand = new SecureRandom();
                StringBuilder stringbuild = new StringBuilder();
                
                boolean smletter = false;
                boolean bigletter = false;
                boolean num = false;
                boolean sign = false;

                while ((smletter && bigletter && num && sign) != true){
                    stringbuild.setLength(0);
                    smletter = false; bigletter = false; num = false; sign = false;
                    for (int i = 0; i < choice; i++)
                    {
                        int randomIndex = rand.nextInt(characters.length());
                        stringbuild.append(characters.charAt(randomIndex));
                    }
                    
                    for(int ch = 0; ch < stringbuild.length(); ch++){
                        if ((int)stringbuild.charAt(ch) > 47 && (int)stringbuild.charAt(ch) < 58) num = true;
                        if ((int)stringbuild.charAt(ch) > 32 && (int)stringbuild.charAt(ch) < 48) sign = true;
                        if ((int)stringbuild.charAt(ch) > 64 && (int)stringbuild.charAt(ch) < 67) bigletter = true;
                        if ((int)stringbuild.charAt(ch) > 72 && (int)stringbuild.charAt(ch) < 99) smletter = true;
                    }
                }
                System.out.println("Ваш пароль: " + stringbuild.toString());
            }
        } 
        else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            return;
        }
    }

}
