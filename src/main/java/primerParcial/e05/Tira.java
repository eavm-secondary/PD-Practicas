package primerParcial.e05;

public class Tira extends BuilderParrilla{
    @Override
    public void buildTipoCarne() {
        parrilla.setTipoCarne("Tira de Carne");
    }

    @Override
    public void buildRefresco() {
        parrilla.setRefresco("CocaCola");
    }

    @Override
    public void buildGuarnicion() {
        parrilla.setGuarnicion("Fideo");
    }
}
