package Parte_2;

/* Classe criada para dar suporte ao exercício 3 */

public class Produtos {

    private int cod;
    private int qtd;
    private double valor;
    private double valorTotal;

    public Produtos (int cod, int qtd, double valor, double valorTotal) {
        this.cod = cod;
        this.qtd = qtd;
        this.valor = valor;
        this.valorTotal = valorTotal;
    }

    public int getCod(){
        return this.cod;
    } 

    public int getQtd(){
        return this.qtd;
    }

    public double getValor(){
        return this.valor;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }
    
}
