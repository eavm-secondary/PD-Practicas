package parcialFinal.e01;

public class Arma extends DecoratorPersonaje{
    private String tipo;
    public Arma(IPersonaje personaje, String tipo) {
        super(personaje);
        this.tipo = tipo;
    }

    @Override
    public void atacar(IPersonaje victima) {
        super.atacar(victima);
        victima.recibirAtaque(this, 30);
    }

}
