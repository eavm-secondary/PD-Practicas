package parcialFinal.e02;

public class PagoEfectivo implements IMetodoPago{
    @Override
    public void recibirPago(double precio, String concepto) {
        System.out.println("---------------------------------------------");
        System.out.println("Pago en efectivo");
        System.out.println("El pago por "+precio+"Bs se ha realizado correctamente");
        System.out.println("Concepto: "+ concepto);
        System.out.println("---------------------------------------------");
    }

}
