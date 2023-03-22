package primerParcial.e10;

public class Cliente {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Toyota","1290ERT");
        Vehiculo v2 = new Vehiculo("Suzuki","2690URY");
        Vehiculo v3 = new Vehiculo("Tesla","8279ETN");
        Vehiculo v4 = new Vehiculo("Ford","2296RTP");
        Vehiculo v5 = new Vehiculo("Ferrari","1591TBN");

        CentroPeajes.getInstance().registrarVehiculo(v1);
        CentroPeajes.getInstance().registrarVehiculo(v2);
        CentroPeajes.getInstance().registrarVehiculo(v3);
        CentroPeajes.getInstance().registrarVehiculo(v4);
        CentroPeajes.getInstance().registrarVehiculo(v5);
        CentroPeajes.getInstance().cerrar();
    }
}
