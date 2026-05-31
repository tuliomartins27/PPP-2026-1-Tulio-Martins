package br.ufu.questao2;

public class Honda implements IVehicleMaker{
    private static Honda instance;

    private Honda() {}

    public static Honda getInstance() {
        if (instance == null) {
            instance = new Honda();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equalsIgnoreCase("City")) return new City();
        if (modelo.equalsIgnoreCase("Civic")) return new Civic();
        if (modelo.equalsIgnoreCase("Fit")) return new Fit();
        return null;
    }
}
