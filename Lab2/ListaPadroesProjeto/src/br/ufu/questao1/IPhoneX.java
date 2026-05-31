package br.ufu.questao1;

public class IPhoneX implements Celular{
    @Override
    public void fazLigacao() { System.out.println("iPhone X: Fazendo ligação..."); }
    @Override
    public void tiraFoto() { System.out.println("iPhone X: Tirando foto..."); }
}
