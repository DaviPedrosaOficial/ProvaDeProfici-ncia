package Parte_1;

import java.util.Scanner;

public class Exercício_1{

    public static void main (String [] args) throws Exception{

        /* Parametros primeiro produto */
        int codigoProd1;
        int qtdProd1;
        float valorProd1;

        /* Parametros segundo produto */
        int codigoProd2;
        int qtdProd2;
        float valorProd2;

        /* Entradas para o primeiro produto */
        System.out.printf("Insira a seguir o codigo da 1ª peça: ");
        Scanner scanner = new Scanner (System.in);
        codigoProd1 = scanner.nextInt();

        System.out.printf("%nInsira a quantidade que sera comprada da 1ª peça: ");
        qtdProd1 = scanner.nextInt();

        System.out.printf("%nInsira o valor unitario da 1ª peça: ");
        valorProd1 = scanner.nextFloat();

        System.out.printf("%n%nAgora iremos ao segundo produto!%n%n");

        /* Entradas para o segundo produto */

        System.out.printf("Insira a segiur o codigo da 2ª peça: ");
        codigoProd2 = scanner.nextInt();

        System.out.printf("%nInsira a quantidade que sera comprada da 2ª peça: ");
        qtdProd2 = scanner.nextInt();

        System.out.printf("%nInsira o valor unitario da 2ª peça: ");
        valorProd2 = scanner.nextFloat();

        scanner.close();

        System.out.printf("%nO valor total da compra sera de %.2f !", (qtdProd1 * valorProd1) + (qtdProd2 * valorProd2));
        System.out.printf("%n%n---Resumo da Compra---%n%n--1º Produto--%n Codigo 1º Produto: %d %n Quantidade 1º produto: %d %n Valor unitario 1º produto: %.2f %n Valor total 1º produto: %.2f %n%n--2º Produto--%n Codigo do 2º produto: %d %n Quantidade do 2º produto: %d %n Valor unitario 2º produto: %.2f %n Valor total 2º produto: %.2f ",codigoProd1,qtdProd1,valorProd1,(qtdProd1 * valorProd1),codigoProd2,qtdProd2,valorProd2,(qtdProd2 * valorProd2));






    }
}