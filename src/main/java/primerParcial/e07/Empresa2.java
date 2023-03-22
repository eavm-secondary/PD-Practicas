package primerParcial.e07;

public class Empresa2 implements IEmpresa{
    private Empleado[] empleados;
    private int pos = 0;

    public Empresa2() {
        this.empleados = new Empleado[10];
    }

    @Override
    public IIterator createIterator() {
        return new IteradorEmpresa2(empleados);
    }

    @Override
    public void addEmpleado(Empleado empleado) {
        empleados[pos] = empleado;
        pos++;
    }
}
