package primerParcial.e01;

public class Ventanilla {
    private static Ventanilla instance;
    private Cajero cajero;
    private double montoAcumulado;

    private Ventanilla(){
        montoAcumulado = 0;
        setCajero(new Cajero("Albert Einstein","AE"));
    }

    public static Ventanilla getInstance() {
        if (instance == null) {
            instance = new Ventanilla();
        }
        return instance;
    }

    public void sumarMonto(double monto){
        montoAcumulado+=monto;
    }

    public double getMontoAcumulado() {
        return montoAcumulado;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
        System.out.println("Nuevo Cajero: "+cajero.getCodigo());
    }

    public void consultarMontoAcumulado() {
        System.out.println("Monto acumulado: "+montoAcumulado);
    }
}
