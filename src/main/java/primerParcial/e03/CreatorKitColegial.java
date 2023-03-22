package primerParcial.e03;

import java.util.List;

public class CreatorKitColegial implements ICreatorKit{
    @Override
    public KitColegial create() {
        KitColegial kit = new KitColegial(
                new Mochila(6,"XL"),
                List.of(new Libro("Lenguaje","Robert Charles"), new Libro("Matematica","Baldor")),
                new Computadora("Asus","Windows 11")
        );
        return kit;
    }
}
