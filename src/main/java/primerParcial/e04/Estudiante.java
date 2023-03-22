package primerParcial.e04;

public class Estudiante {
    private String ci;
    private String nombre;

    private Materia materia;

    public Estudiante(String nombre, String ci, Materia materia) {
        this.ci = ci;
        this.nombre = nombre;
        this.materia = materia;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
