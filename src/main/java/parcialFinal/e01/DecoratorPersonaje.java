package parcialFinal.e01;

public abstract class DecoratorPersonaje implements IPersonaje{
    private IPersonaje personaje;
    public DecoratorPersonaje(IPersonaje personaje) {
        this.personaje = personaje;
    }

    public IPersonaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(IPersonaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void atacar(IPersonaje victima) {
        personaje.atacar(victima);
    }

    @Override
    public void recibirAtaque(IPersonaje atacante, int damage) {
        personaje.recibirAtaque(atacante,damage);
    }

    @Override
    public void curar(int puntos) {
        personaje.curar(puntos);
    }
}
