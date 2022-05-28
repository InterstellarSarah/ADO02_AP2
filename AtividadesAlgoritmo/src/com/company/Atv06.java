package com.company;

import java.util.Scanner;

public class Atv06 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("valor a: ");
        int a = input.nextInt();
        System.out.print("valor b: ");
        int b = input.nextInt();

        int r = result(a);
        System.out.println("Resultado: " + r);
}
    public static int result(int a){
        if(a == 1) {
            return 1;
        }else
            return result(result(a / 2));
    }
}
