package primerParcial.e03;

public class Cuaderno {
    private String tipo;
    private int numHojas;

    public Cuaderno(String tipo, int numHojas) {
        this.tipo = tipo;
        this.numHojas = numHojas;
    }

    @Override
    public String toString() {
        return "Cuaderno{" +
                "tipo='" + tipo + '\'' +
                ", numHojas=" + numHojas +
                '}';
    }
}
