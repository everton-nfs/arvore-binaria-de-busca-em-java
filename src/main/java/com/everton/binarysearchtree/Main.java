package main.java.com.everton.binarysearchtree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinaria arv = new ArvoreBinaria();

        System.out.println("Digite 5 números para inserir na árvore binária:");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            arv.inserirNo(num);
        }

        arv.exibirNo();
    }
}