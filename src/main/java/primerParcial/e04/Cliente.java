package primerParcial.e04;

public class Cliente {
    public static void main(String[] args) {
        FactoryMateria fabrica = new FactoryMateria();
        Estudiante e1 = new Estudiante("Arturito","8769876", fabrica.make("matematicas"));
        Estudiante e2 = new Estudiante("Leonardo","7698176", fabrica.make("ingles"));
        Estudiante e3 = new Estudiante("Martin","9878761", fabrica.make("mate"));
        Estudiante e4 = new Estudiante("Cristian","5987698", fabrica.make("historia"));
        Estudiante e5 = new Estudiante("Tommy","1790876", fabrica.make("lenguaje"));

        e1.getMateria().cursar();
        e2.getMateria().cursar();
        e3.getMateria().cursar();
        e4.getMateria().cursar();
        e5.getMateria().cursar();
    }
}
