package br.ufu.questao2;

import java.io.Serializable;

public class City implements IVehicle {
    public void start() { System.out.println("City ligando..."); }
    public void drive() { System.out.println("City rodando..."); }
    public void stop() { System.out.println("City parando..."); }
}
