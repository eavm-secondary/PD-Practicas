package parcialFinal.e02;

public class InstalacionElectrica extends Instalacion{
    public InstalacionElectrica(double precio, String direccion) {
        super(precio, direccion);
    }

    @Override
    public void realizarIntalacion() {
        System.out.println("Realizando instalacion electrica...");
        System.out.println("--> Dirección: "+getDireccion());
        System.out.println("--> Precio: "+getPrecio());
        getMetodoPago().recibirPago(getPrecio(), "Instalacion Electrica");
        System.out.println("****************************************");
    }
}
