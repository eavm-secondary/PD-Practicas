package parcialFinal.e02;

public class PagoTigoMoney implements IMetodoPago{
    private double descuento = 0.98;
    @Override
    public void recibirPago(double precio, String concepto) {
        System.out.println("---------------------------------------------");
        System.out.println("Pago por Tigo Money");
        System.out.println("El pago por "+precio*descuento+"Bs se ha realizado correctamente");
        System.out.println("Concepto: "+ concepto);
        System.out.println("---------------------------------------------");
    }

}
