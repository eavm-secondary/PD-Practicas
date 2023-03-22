package primerParcial.e03;

import java.util.List;

public class KitColegial implements IKitEscolar{
    private Mochila mochila;
    private List<Libro> libros;
    private Computadora computadora;

    public KitColegial(Mochila mochila, List<Libro> libros, Computadora computadora) {
        this.mochila = mochila;
        this.libros = libros;
        this.computadora = computadora;
    }

    @Override
    public void showInfo() {
        System.out.println("Mochila: "+mochila);
        System.out.println("Libros: "+libros);
        System.out.println("Computadora: "+computadora);
        System.out.println("************************");
    }
}
