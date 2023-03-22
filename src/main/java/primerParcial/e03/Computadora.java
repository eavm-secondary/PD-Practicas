package primerParcial.e03;

public class Computadora {
    private String marca;
    private String os;

    public Computadora(String marca, String os) {
        this.marca = marca;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
