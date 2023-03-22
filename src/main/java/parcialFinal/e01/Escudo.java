package parcialFinal.e01;

public class Escudo extends DecoratorPersonaje{
    public Escudo(IPersonaje personaje) {
        super(personaje);
    }

    @Override
    public void recibirAtaque(IPersonaje atacante, int damage) {
        super.recibirAtaque(atacante,damage-10);
    }
}
