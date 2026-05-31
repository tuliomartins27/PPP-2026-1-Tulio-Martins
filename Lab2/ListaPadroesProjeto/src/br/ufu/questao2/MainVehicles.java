package br.ufu.questao2;

public class MainVehicles {
    public static void main(String[] args) {

        System.out.println("--- Fábrica da Toyota ---");
        IVehicleMaker toyota = Toyota.getInstance();
        IVehicle meuCorolla = toyota.makeVehicle("Corolla");
        if (meuCorolla != null) {
            meuCorolla.start();
            meuCorolla.drive();
            meuCorolla.stop();
        }

        System.out.println("\n--- Fábrica da Honda ---");
        IVehicleMaker honda = Honda.getInstance();
        IVehicle meuCivic = honda.makeVehicle("Civic");
        if (meuCivic != null) {
            meuCivic.start();
            meuCivic.drive();
            meuCivic.stop();
        }
    }
}
