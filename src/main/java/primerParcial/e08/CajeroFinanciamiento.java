package primerParcial.e08;

public class CajeroFinanciamiento {
    public void prestamo(double monto){
        System.out.println("Solicitando Prestamo por Financiamiento de: "+monto+"$");
        CuentaDeFondos.getInstance().pedirPrestamo(monto);
    }
}
