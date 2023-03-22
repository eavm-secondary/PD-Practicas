package primerParcial.e08;

public class CuentaDeFondos {
    private static CuentaDeFondos instance;
    private double fondos = 0;
    private CuentaDeFondos(){}

    private synchronized static void instantiate() {
        if (instance == null) {
            instance = new CuentaDeFondos();
        }
    }

    public static CuentaDeFondos getInstance() {
        if (instance == null) {
            instantiate();
        }
        return instance;
    }

    public void depositarFondos(double fondos) {
        this.fondos += fondos;
    }

    public void pedirPrestamo(double monto){
        if (fondos<monto){
            System.out.println("Fondos insuficientes: "+fondos+"$");
        } else {
            this.fondos -= monto;
            System.out.println("Préstamo exitoso, fondos Actuales: "+fondos+"$");
        }
    }

    public double getFondos() {
        return fondos;
    }
}
