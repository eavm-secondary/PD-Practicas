package parcialFinal.e02;

public class InstalacionAgua extends Instalacion{
    public InstalacionAgua(double precio, String direccion) {
        super(precio, direccion);
    }

    @Override
    public void realizarIntalacion() {
        System.out.println("Realizando instalacion de agua...");
        System.out.println("--> Dirección: "+getDireccion());
        System.out.println("--> Precio: "+getPrecio());
        getMetodoPago().recibirPago(getPrecio(), "Instalacion de Agua");
        System.out.println("****************************************");
    }
}
