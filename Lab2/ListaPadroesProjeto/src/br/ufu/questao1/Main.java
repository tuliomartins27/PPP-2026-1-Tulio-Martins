package br.ufu.questao1;

public class Main {
    public static void main(String[] args) {
        FabricanteCelular apple = Apple.getInstancia();
        Celular meuIphone = apple.constroiCelular("IPhoneX");
        System.out.println("--- Testando Apple ---");
        if (meuIphone != null) {
            meuIphone.fazLigacao();
            meuIphone.tiraFoto();
        }

        FabricanteCelular samsung = Samsung.getInstancia();
        Celular meuGalaxy = samsung.constroiCelular("Galaxy20");
        System.out.println("\n--- Testando Samsung ---");
        if (meuGalaxy != null) {
            meuGalaxy.fazLigacao();
            meuGalaxy.tiraFoto();
        }
    }
}
