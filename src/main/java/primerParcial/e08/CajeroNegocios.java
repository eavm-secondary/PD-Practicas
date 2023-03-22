package primerParcial.e08;

public class CajeroNegocios {
    public void prestamo(double monto){
        System.out.println("Solicitando Prestamo por Negocios de: "+monto+"$");
        CuentaDeFondos.getInstance().pedirPrestamo(monto);
    }
}
