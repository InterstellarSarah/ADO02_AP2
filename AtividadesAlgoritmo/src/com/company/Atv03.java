package com.company;

import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantidade de coelhos: ");
        int qtd = input.nextInt();

        int r = result(qtd);

        System.out.println("Serão: " + r + " Orelhas");
    }
    public static int result(int n){
        if(n == 0) {
            return 0;
        }else if (n == 1){
           return 2;
        }else
            return  2 + result(n - 1);
    }
}
