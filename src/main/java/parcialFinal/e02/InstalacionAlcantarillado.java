package parcialFinal.e02;

public class InstalacionAlcantarillado extends Instalacion{
    public InstalacionAlcantarillado(double precio, String direccion) {
        super(precio, direccion);
    }

    @Override
    public void realizarIntalacion() {
        System.out.println("Realizando instalacion de alcantarillado...");
        System.out.println("--> Dirección: "+getDireccion());
        System.out.println("--> Precio: "+getPrecio());
        getMetodoPago().recibirPago(getPrecio(), "Instalacion de Alcantarillado");
        System.out.println("****************************************");
    }
}
