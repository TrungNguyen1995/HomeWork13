package baitap5.utils;

import java.util.Scanner;

public class Utils {
    public  int inputNumber(Scanner scanner){
        do {
            try{
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Invalid Input, Please try again");
            }
        }while (true);
    }
}
