package primerParcial.e05;

public abstract class BuilderParrilla {
    protected Parrilla parrilla;

    public Parrilla getParrilla() {
        return parrilla;
    }

    public void createParrilla(){
        parrilla = new Parrilla();
    }

    public abstract void buildTipoCarne();
    public abstract void buildRefresco();
    public abstract void buildGuarnicion();
}
