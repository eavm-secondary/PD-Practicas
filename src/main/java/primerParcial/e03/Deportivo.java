package primerParcial.e03;

public class Deportivo {
    private String talla;
    private String color;
    private int numPrendas;

    public Deportivo(String talla, String color, int numPrendas) {
        this.talla = talla;
        this.color = color;
        this.numPrendas = numPrendas;
    }

    @Override
    public String toString() {
        return "Deportivo{" +
                "talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                ", numPrendas=" + numPrendas +
                '}';
    }
}
