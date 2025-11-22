package org.example.domain;

public class Carro extends Automovel {

    public int aberto;
    public int tetosolar;

    public void abrirFechar(){
        if (aberto == 0){
            System.out.println("Carro aberto.");
            aberto = 1;
        }else {
            System.out.println("Carro fechado!!!");
            aberto = 0;
        }
    }
}
