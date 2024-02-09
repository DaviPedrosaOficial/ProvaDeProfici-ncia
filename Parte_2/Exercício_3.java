package Parte_2;

import java.util.Scanner;

public class Exercício_3 {

    public static void main (String [] args) throws Exception {

        int controlador = 0;

        /* Tabela de Preços */
        System.out.printf("%n--------------- Tabela de precos ---------------%n");
        System.out.printf("%nCodigo: 1     Cachorro Quente     Preco: R$4,00");
        System.out.printf("%nCodigo: 2     X-Salada            Preco: R$4,50");
        System.out.printf("%nCodigo: 3     X-Bacon             Preco: R$5,00");
        System.out.printf("%nCodigo: 4     Torrada Simples     Preco: R$2,00");
        System.out.printf("%nCodigo: 5     Refrigerante        Preco: R$1,50");
        System.out.printf("%n------------------------------------------------");

        while (controlador == 0) {

            int cod;
            int qtd;

            /* Entrada */
            System.out.printf("%nDigite o codigo do produto: ");
            Scanner scanner = new Scanner (System.in);
            cod = Integer.parseInt(scanner.nextLine());

            /* Controle de excessão */
            while (true) {
                try {
                    /* Se maior, ou menor que os códigos da tabela, o programa não aceitara e retornara a ultima etapa */
                    if (cod < 1 || cod > 5){
                        throw new Exception();
                    }
                    break;
                } catch (Exception valorInv) {
                    System.out.printf("%nValor inserido é invalido.");
                }
            }

            System.out.printf("%nDigite a quantidade que levara do produto: ");
            qtd = Integer.parseInt(scanner.nextLine());

            while (true) {
                try { 
                    /* Se a quantidade inserida pelo cliente for menor que zero, o programa não aceitara e retornara a ultima etapa */
                    if (qtd < 0) {
                        throw new Exception();
                    }
                 } catch (Exception valInv) {
                    System.out.printf("%nValor inserido é invalido.");
                 }
            }



        }

    }

}
