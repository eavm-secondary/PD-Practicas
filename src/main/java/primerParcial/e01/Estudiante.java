package primerParcial.e01;

public class Estudiante {
    private String nombre;
    private String codigo;

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void pagarMatricula(){
        Ventanilla.getInstance().sumarMonto(500);
        System.out.println(nombre+" pagó la matrícula");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
