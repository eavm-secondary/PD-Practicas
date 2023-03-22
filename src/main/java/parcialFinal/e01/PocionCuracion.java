package parcialFinal.e01;

public class PocionCuracion extends DecoratorPersonaje{
    public PocionCuracion(IPersonaje personaje) {
        super(personaje);
    }

    @Override
    public void curar(int puntos){
        super.curar(puntos+80);
    }
}
