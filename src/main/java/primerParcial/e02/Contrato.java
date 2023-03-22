package primerParcial.e02;

public class Contrato implements IContrato{
    private String nombre;
    private String apellido;
    private double sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String horaEntrada;
    private String horaSalida;

    public String getNombre() {
        return nombre;
    }

    public Contrato setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Contrato setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Contrato setSueldo(double sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Contrato setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        return this;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public Contrato setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
        return this;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public Contrato setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
        return this;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public Contrato setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
        return this;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public Contrato setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
        return this;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public Contrato setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
        return this;
    }

    @Override
    public Contrato clone(){
        Contrato clone = new Contrato();
        clone.setApellido(this.getApellido());
        clone.setNombre(this.getNombre());
        clone.setSueldo(this.getSueldo());
        clone.setAccesoPlataforma(this.isAccesoPlataforma());
        clone.setCargaHoraria(this.getCargaHoraria());
        clone.setCursoEducacionSuperior(this.isCursoEducacionSuperior());
        clone.setMarcadoBiometrico(this.isMarcadoBiometrico());
        clone.setHoraEntrada(this.getHoraEntrada());
        clone.setHoraSalida(this.getHoraSalida());
        return clone;
    }

    public void showInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Acceso a Plataforma: "+accesoPlataforma);
        System.out.println("Carga Horaria: "+cargaHoraria);
        System.out.println("Curso Educacion Superior: "+cursoEducacionSuperior);
        System.out.println("Marcado Biometrico : "+marcadoBiometrico);
        System.out.println("Hora Entrada : "+horaEntrada);
        System.out.println("Hora Salida : "+horaSalida);
        System.out.println("**************************************");
    }
}
