package primerParcial.e07;

import java.util.ArrayList;
import java.util.List;

public class Empresa1 implements IEmpresa{
    private List<Empleado> empleados;

    public Empresa1() {
        this.empleados = new ArrayList<>();
    }

    @Override
    public IIterator createIterator() {
        return new IteradorEmpresa1(empleados);
    }

    @Override
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
}
