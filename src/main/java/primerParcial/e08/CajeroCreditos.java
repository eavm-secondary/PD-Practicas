package primerParcial.e08;

public class CajeroCreditos {
    public void prestamo(double monto){
        System.out.println("Solicitando Prestamo por Credito de: "+monto+"$");
        CuentaDeFondos.getInstance().pedirPrestamo(monto);
    }
}
