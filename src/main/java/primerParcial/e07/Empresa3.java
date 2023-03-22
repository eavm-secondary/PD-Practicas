package primerParcial.e07;

import java.util.Vector;

public class Empresa3 implements IEmpresa{
    private Vector<Empleado> empleados = new Vector<>();

    @Override
    public IIterator createIterator() {
        return new IteradorEmpresa3(empleados);
    }

    @Override
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
}
