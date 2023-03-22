package primerParcial.e10;

public class Vehiculo {
    private String modelo;
    private String placa;

    public Vehiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
