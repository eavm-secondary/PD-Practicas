package primerParcial.e07;

import java.util.List;

public class IteradorEmpresa1 implements IIterator{

    private List<Empleado> empleados;
    private int pos=0;
    public IteradorEmpresa1(List<Empleado> empleados){
        this.empleados = empleados;
    }
    @Override
    public boolean hasNext() {
        return pos < empleados.size();
    }

    @Override
    public Empleado next() {
        return empleados.get(pos++);
    }
}
