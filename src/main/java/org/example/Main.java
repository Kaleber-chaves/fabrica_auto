package org.example;


import org.example.domain.Carro;
import org.example.domain.Moto;

public class Main {
    public static void main(String[] args) {

        Carro c = new Carro();
        c.cor = "Prata";
        c.modelo = "Toyota";
        c.placa = "OPS-5E29";
        c.ligado = 0;
        c.movimento = 0;
        c.tetosolar = 1;
        c.aberto = 0;

        c.ligar();
        c.mover();
        c.parar();
        c.abrirFechar();

        System.out.println("**** TESTE DA MOTO ****");
        Moto m = new Moto();
        m.cor = "Branco Perola";
        m.modelo = "Honda";
        m.placa = "XYZ-4A21";
        m.ligado = 0;
        m.movimento = 0;
        m.freioabs = 1;
        m.bau = 1;

        m.ligar();
        m.mover();
        m.parar();
        m.alarme();
    }

}