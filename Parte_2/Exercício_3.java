package Parte_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercício_3 {

    public static void main (String [] args) throws Exception {

        List<Produtos>carrinho = new ArrayList<>();
        int controlador = 0;

        /* Tabela de Preços */
        System.out.printf("%n--------------- Tabela de precos ---------------%n");
        System.out.printf("%nCodigo: 1     Cachorro Quente     Preco: R$4,00");
        System.out.printf("%nCodigo: 2     X-Salada            Preco: R$4,50");
        System.out.printf("%nCodigo: 3     X-Bacon             Preco: R$5,00");
        System.out.printf("%nCodigo: 4     Torrada Simples     Preco: R$2,00");
        System.out.printf("%nCodigo: 5     Refrigerante        Preco: R$1,50");
        System.out.printf("%n------------------------------------------------");

        Scanner scanner = new Scanner (System.in);

        while (controlador == 0) {

            int cod;
            int qtd;

            /* Entrada */
            System.out.printf("%nDigite o codigo do produto: ");
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
                    break;
                 } catch (Exception valInv) {
                    System.out.printf("%nValor inserido é invalido.");
                 }
            }

            /* Método para adicionar produtos ao carrinho */
            if(cod == 1){
                carrinho.add(new Produtos(cod,qtd,4,qtd*4));
            }
            else if (cod == 2){
                carrinho.add(new Produtos(cod,qtd,4.5,qtd*4.5));
            }
            else if (cod == 3){
                carrinho.add(new Produtos(cod,qtd,5,qtd*5));
            }
            else if (cod == 4){
                carrinho.add(new Produtos(cod,qtd,2,qtd*2));
            }
            else if (cod == 5){
                carrinho.add(new Produtos(cod,qtd,1.5,qtd*1.5));
            }

            /* Verificando necessidade do cliente (Ira compra mais ou não) */
            System.out.printf("%nDeseja adicionar mais algum produto?%nSe sim, digite 1, caso deseja encerrar a compra digite 0:%n");
            int check;
            check = Integer.parseInt(scanner.nextLine());

            /* Criando o método que demonstrará a compra como um todo */
            if (check == 0){

                /* Variável que calculará o valor total da compra */
                double valCompra = 0;

                
                System.out.printf("%n------------- Comanda -------------");

                /* Percorrendo carrinho para repassar tudo aquilo que o cliente desejou comprar */
                for (Produtos prod : carrinho){
                    System.out.printf("%n%nCódigo: %d %nQuantidade: %d %nValor unitario: R$%.2f %nValor cumulativo: R$%.2f",prod.getCod(),prod.getQtd(),prod.getValor(),prod.getValorTotal());
                    valCompra += prod.getValorTotal();
                }

                /* Saída final do programa */
                System.out.printf("%n%nO valor total da compra: R$ %.2f",valCompra);
                System.out.printf("%n%n------------- Comanda -------------");
                System.out.printf("%n%nFavor seguir ao caixa para efetuar o pagamento!");

                controlador += 1;
            }
        }
    
        scanner.close();

    }
}

