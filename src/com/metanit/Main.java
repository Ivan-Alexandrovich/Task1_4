package com.metanit;
/*Написать метод, которому в качестве параметра передается целое число, метод
должен напечатать в консоль положительное ли число передали, или
отрицательное; Замечание: ноль считаем положительным числом.*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Insert your integer number: ");
    int a = scanner.nextInt();
    Ex(a);

    }

    public static void Ex(int a) {
        if (a >= 0) {
            System.out.println("Your number is greater than 0");
        }
        else {
            System.out.println("Your number is less than 0");
        }
    }

}
