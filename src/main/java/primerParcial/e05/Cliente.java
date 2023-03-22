package primerParcial.e05;

public class Cliente {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new Bife());
        Parrilla p1 = director.buildParrilla();

        director.setBuilder(new Lomito());
        Parrilla p2 = director.buildParrilla();

        director.setBuilder(new Tira());
        Parrilla p3 = director.buildParrilla();

        p1.showInfo();
        p2.showInfo();
        p3.showInfo();
    }
}
