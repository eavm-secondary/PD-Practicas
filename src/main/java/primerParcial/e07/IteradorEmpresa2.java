package primerParcial.e07;

public class IteradorEmpresa2 implements IIterator{

    private Empleado[] empleados;
    private int pos=0;
    public IteradorEmpresa2(Empleado[] empleados){
        this.empleados = empleados;
    }
    @Override
    public boolean hasNext() {
        return pos < empleados.length && empleados[pos]!=null;
    }

    @Override
    public Empleado next() {
        return empleados[pos++];
    }
}
