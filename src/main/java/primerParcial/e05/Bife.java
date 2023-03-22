package primerParcial.e05;

public class Bife extends BuilderParrilla{
    @Override
    public void buildTipoCarne() {
        parrilla.setTipoCarne("Bife");
    }

    @Override
    public void buildRefresco() {
        parrilla.setRefresco("CocaCola");
    }

    @Override
    public void buildGuarnicion() {
        parrilla.setGuarnicion("Papas Fritas");
    }
}
