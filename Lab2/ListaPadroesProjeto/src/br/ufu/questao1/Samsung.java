package br.ufu.questao1;

public class Samsung implements FabricanteCelular{
    private static Samsung instancia;

    private Samsung() {}

    public static Samsung getInstancia() {
        if (instancia == null) {
            instancia = new Samsung();
        }
        return instancia;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equalsIgnoreCase("Galaxy8")) {
            return new Galaxy8();
        } else if (modelo.equalsIgnoreCase("Galaxy20")) {
            return new Galaxy20();
        }
        return null;
    }
}
