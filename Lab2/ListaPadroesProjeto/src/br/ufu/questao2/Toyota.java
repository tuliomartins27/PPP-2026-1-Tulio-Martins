package br.ufu.questao2;

public class Toyota implements IVehicleMaker{
    private static Toyota instance;

    private Toyota() {}

    public static Toyota getInstance() {
        if (instance == null) {
            instance = new Toyota();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equalsIgnoreCase("Corolla")) return new Corolla();
        if (modelo.equalsIgnoreCase("Hilux")) return new Hilux();
        if (modelo.equalsIgnoreCase("Etios")) return new Etios();
        return null;
    }
}
