package Parte_3;

import java.util.Scanner;

public class Exercício_5 {
    
    public static void main (String [] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        int senha = 2002;
        int controlador = 0;
        int numCliente;

        while (controlador == 0){

            System.out.printf("%nInsira a seguir a senha: ");
            numCliente = scanner.nextInt();
            
            while (true){
                try {
                    if (numCliente != senha){
                        throw new Exception();
                    }
                    break;
                } catch (Exception senhaInv) {
                    System.out.printf("%nSenha invalida!");
                    System.out.println();
                    break;
                }
            }

            if(numCliente == senha){
                System.out.printf("%nAcesso Permitido!");
                controlador += 1;
            }
        }

        scanner.close();
    }
}
