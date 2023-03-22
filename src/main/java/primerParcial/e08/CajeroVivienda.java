package primerParcial.e08;

public class CajeroVivienda {
    public void prestamo(double monto){
        System.out.println("Solicitando Prestamo por Vivienda de: "+monto+"$");
        CuentaDeFondos.getInstance().pedirPrestamo(monto);
    }
}
