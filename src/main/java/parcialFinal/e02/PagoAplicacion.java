package parcialFinal.e02;

public class PagoAplicacion implements IMetodoPago{
    private double descuento = 0.9;

    @Override
    public void recibirPago(double precio, String concepto) {
        System.out.println("---------------------------------------------");
        System.out.println("Pago por Aplicacion");
        System.out.println("El pago por "+precio*descuento+"Bs se ha realizado correctamente");
        System.out.println("Concepto: "+ concepto);
        System.out.println("---------------------------------------------");
    }

}
