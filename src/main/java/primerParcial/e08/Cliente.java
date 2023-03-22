package primerParcial.e08;

public class Cliente {
    public static void main(String[] args) {
        CuentaDeFondos.getInstance().depositarFondos(5000);

        Thread t1 = new Thread(() -> {
            CajeroVivienda c1 = new CajeroVivienda();
            c1.prestamo(200);
        });

        Thread t2 = new Thread(() -> {
            CajeroNegocios c2 = new CajeroNegocios();
            c2.prestamo(1000);
        });

        Thread t3 = new Thread(() -> {
            CajeroCreditos c3 = new CajeroCreditos();
            c3.prestamo(3000);
        });

        Thread t4 = new Thread(() -> {
            CajeroFinanciamiento c4 = new CajeroFinanciamiento();
            c4.prestamo(2000);
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
