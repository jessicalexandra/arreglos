package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner InputData = new Scanner(System.in);

        double[] numbers = {4, 10, 20, 8.2, 3};
        System.out.println("ingrese el tamaño del vector");
        int size = InputData.nextInt();

        String[] names = new String[size];
//        System.out.println(numbers[3]);
//        numbers[2] = 5;
//        System.out.println(numbers[2]);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("ingrese el valor del vector" + (i + 1));
//            numbers[i] = InputData.nextDouble();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(numbers[i] + "-");
//
//        }
        for (int i = 0; i < size; i++) {
            System.out.println("ingrese los nombres" + (i + 1));
            names[i] = InputData.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(names[i] + "-");


        }
    }
}
