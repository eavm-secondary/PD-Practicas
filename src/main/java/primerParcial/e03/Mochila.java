package primerParcial.e03;

public class Mochila {
    private int numBolsillos;
    private String tamanio;

    public Mochila(int numBolsillos, String tamanio) {
        this.numBolsillos = numBolsillos;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Mochila{" +
                "numBolsillos=" + numBolsillos +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}
