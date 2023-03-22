package primerParcial.e05;

public class Lomito extends BuilderParrilla{
    @Override
    public void buildTipoCarne() {
        parrilla.setTipoCarne("Lomo");
    }

    @Override
    public void buildRefresco() {
        parrilla.setRefresco("Pepsi");
    }

    @Override
    public void buildGuarnicion() {
        parrilla.setGuarnicion("Arroz");
    }
}
