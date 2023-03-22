package primerParcial.e07;

import java.util.HashMap;

public class Cliente {
    public static void main(String[] args) {
        Empresa1 e1 = new Empresa1();
        e1.addEmpleado(new Empleado("Ronaldo"));
        e1.addEmpleado(new Empleado("Antonio"));
        e1.addEmpleado(new Empleado("Daniela"));

        Empresa2 e2 = new Empresa2();
        e2.addEmpleado(new Empleado("Ariana"));
        e2.addEmpleado(new Empleado("Alejandra"));
        e2.addEmpleado(new Empleado("Pedro"));

        Empresa3 e3 = new Empresa3();
        e3.addEmpleado(new Empleado("Ramiro"));
        e3.addEmpleado(new Empleado("Brenda"));
        e3.addEmpleado(new Empleado("Ernesto"));

        Empresa4 e4 = new Empresa4();
        e4.addEmpleado(new Empleado("America"));
        e4.addEmpleado(new Empleado("Horacio"));
        e4.addEmpleado(new Empleado("Juan"));

        HashMap<String,Empleado> nuevosEmpleados = new HashMap<>();

        IIterator iterador;
        iterador = e1.createIterator();
        while (iterador.hasNext()){
            Empleado empleado = iterador.next();
            nuevosEmpleados.put(empleado.getNombre(),empleado);
        }

        iterador = e2.createIterator();
        while (iterador.hasNext()){
            Empleado empleado = iterador.next();
            nuevosEmpleados.put(empleado.getNombre(), empleado);
        }

        iterador = e3.createIterator();
        while (iterador.hasNext()){
            Empleado empleado = iterador.next();
            nuevosEmpleados.put(empleado.getNombre(), empleado);
        }

        iterador = e4.createIterator();
        while (iterador.hasNext()){
            Empleado empleado = iterador.next();
            nuevosEmpleados.put(empleado.getNombre(), empleado);
        }

        System.out.println("Nuevos empleados:");
        for (String key: nuevosEmpleados.keySet()){
            System.out.println(nuevosEmpleados.get(key));
        }
    }
}
