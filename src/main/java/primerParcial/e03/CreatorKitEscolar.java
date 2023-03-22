package primerParcial.e03;

public class CreatorKitEscolar implements ICreatorKit{

    @Override
    public KitEscolar create() {
        KitEscolar kit = new KitEscolar(
                new Mochila(4,"L"),
                new Deportivo("S","Rojo",2),
                new Cuaderno("Bond",100)
        );
        return kit;
    }
}
