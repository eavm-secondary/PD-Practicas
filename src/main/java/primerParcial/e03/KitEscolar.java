package primerParcial.e03;

public class KitEscolar implements IKitEscolar {
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno cuaderno;

    public KitEscolar(Mochila mochila, Deportivo deportivo, Cuaderno cuaderno) {
        this.mochila = mochila;
        this.deportivo = deportivo;
        this.cuaderno = cuaderno;
    }

    @Override
    public void showInfo() {
        System.out.println("Mochila: "+mochila);
        System.out.println("Deportivo: "+deportivo);
        System.out.println("Cuaderno: "+cuaderno);
        System.out.println("************************");
    }
}
