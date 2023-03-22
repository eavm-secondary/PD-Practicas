package primerParcial.e05;

public class Director {
    private BuilderParrilla builder;

    public void setBuilder(BuilderParrilla builder) {
        this.builder = builder;
    }

    public Parrilla buildParrilla(){
        builder.createParrilla();
        builder.buildTipoCarne();
        builder.buildRefresco();
        builder.buildGuarnicion();
        return builder.getParrilla();
    }
}
