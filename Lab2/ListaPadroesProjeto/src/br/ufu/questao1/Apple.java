package br.ufu.questao1;

public class Apple implements FabricanteCelular{
    private static Apple instancia;

    private Apple() {}

    public static Apple getInstancia() {
        if (instancia == null) {
            instancia = new Apple();
        }
        return instancia;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equalsIgnoreCase("IPhoneX")) {
            return new IPhoneX();
        } else if (modelo.equalsIgnoreCase("IPhoneS")) {
            return new IPhoneS();
        }
        return null;
    }
}
