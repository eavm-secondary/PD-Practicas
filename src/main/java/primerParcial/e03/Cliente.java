package primerParcial.e03;

public class Cliente {
    public static void main(String[] args) {
        CreatorKitColegial creador1 = new CreatorKitColegial();
        KitColegial kit1 = creador1.create();

        CreatorKitEscolar creador2 = new CreatorKitEscolar();
        KitEscolar kit2 = creador2.create();

        kit1.showInfo();
        kit2.showInfo();
    }
}
