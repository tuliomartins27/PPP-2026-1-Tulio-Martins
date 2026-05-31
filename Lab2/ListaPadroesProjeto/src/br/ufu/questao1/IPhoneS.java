package br.ufu.questao1;

public class IPhoneS implements Celular{
    @Override
    public void fazLigacao() { System.out.println("iPhone S: Fazendo ligação..."); }
    @Override
    public void tiraFoto() { System.out.println("iPhone S: Tirando foto..."); }
}
