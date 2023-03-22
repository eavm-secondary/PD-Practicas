package primerParcial.e03;

public class Libro {
    private String tipo;
    private String autor;

    public Libro(String tipo, String autor) {
        this.tipo = tipo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "tipo='" + tipo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
