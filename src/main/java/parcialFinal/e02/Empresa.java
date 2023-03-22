package parcialFinal.e02;

public class Empresa {
    public static void main(String[] args) {
        Instalacion ins1 = new InstalacionElectrica(200, "Viacha");
        Instalacion ins2 = new InstalacionAgua(500, "UPB");
        Instalacion ins3 = new InstalacionAlcantarillado(1000, "Prado");

        ins1.realizarIntalacion();

        ins2.setMetodoPago(new PagoAplicacion());
        ins2.realizarIntalacion();

        ins3.setMetodoPago(new PagoTigoMoney());
        ins3.realizarIntalacion();

        ins3.setMetodoPago(new PagoAplicacion());
        ins3.realizarIntalacion();

    }
}
