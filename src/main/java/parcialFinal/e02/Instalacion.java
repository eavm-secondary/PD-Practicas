package parcialFinal.e02;

public abstract class Instalacion {
    private String direccion;
    private double precio;
    private IMetodoPago metodoPago = new PagoEfectivo();

    public Instalacion(double precio, String direccion) {
        this.precio = precio;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public IMetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(IMetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public abstract void realizarIntalacion();
}
