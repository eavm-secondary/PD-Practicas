package primerParcial.e01;

public class Cliente {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Pedro","123");
        Estudiante e2 = new Estudiante("Rodrigo","332");
        Estudiante e3 = new Estudiante("Sandra","321");
        Estudiante e4 = new Estudiante("Pablo","456");
        Estudiante e5 = new Estudiante("Ana","098");

        e1.pagarMatricula();
        e2.pagarMatricula();
        Ventanilla.getInstance().setCajero(new Cajero("Isaac Newton","IN"));
        e3.pagarMatricula();
        Ventanilla.getInstance().consultarMontoAcumulado();
        e4.pagarMatricula();
        e5.pagarMatricula();
        Ventanilla.getInstance().consultarMontoAcumulado();
    }
}
