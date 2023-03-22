package primerParcial.e07;

import java.util.Stack;

public class IteradorEmpresa4 implements IIterator{

    private Stack<Empleado> empleados;
    public IteradorEmpresa4(Stack<Empleado> empleados){
        this.empleados = empleados;
    }
    @Override
    public boolean hasNext() {
        return !empleados.isEmpty();
    }

    @Override
    public Empleado next() {
        return empleados.pop();
    }
}
