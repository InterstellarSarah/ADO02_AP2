package com.company;

import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Linha do Triangulo: ");
        int qtd = input.nextInt();

        int r = result(qtd);

        System.out.println("Serão: " + r + " blocos");
    }
    public static int result(int n){
        if (n == 0){
            return 0;
        }else if (n == 1) {
            return 1;
        }else
            return n + result(n - 1);
        }
}
