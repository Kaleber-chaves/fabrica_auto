package org.example.domain;

public class Automovel {
    public String cor;
    public String placa;
    public String modelo;
    public int ligado;
    public int movimento;


    public void ligar(){
        ligado = 1;
        System.out.println("O carro ou a moto está ligado");
    }

    public void mover(){
        if (ligado == 1){
            movimento = 1;
            System.out.println("O automóvel está movendo");
        }else {
            System.out.println("Verifique se o carro está ligado!!!");
        }
    }

    public void parar(){
        if (movimento == 1){
            System.out.println("O veículo está parado");
        }else {
            System.out.println("Verificaque se o carro está movendo!!!");
        }
    }

}


