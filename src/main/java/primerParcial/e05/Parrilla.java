package primerParcial.e05;

public class Parrilla {
    private String tipoCarne;
    private String refresco;
    private String guarnicion;

    public String getTipoCarne() {
        return tipoCarne;
    }

    public Parrilla setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }

    public String getRefresco() {
        return refresco;
    }

    public Parrilla setRefresco(String refresco) {
        this.refresco = refresco;
        return this;
    }

    public String getGuarnicion() {
        return guarnicion;
    }

    public Parrilla setGuarnicion(String guarnicion) {
        this.guarnicion = guarnicion;
        return this;
    }

    public void showInfo(){
        System.out.println("Tipo de Carne: "+tipoCarne);
        System.out.println("Refresco: "+refresco);
        System.out.println("Guarnicion: "+guarnicion);
        System.out.println("**************************");
    }
}
