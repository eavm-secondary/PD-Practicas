package parcialFinal.e03;

public class Archivo implements IComponent{
    private int numPalabras;
    private String texto;
    public Archivo(String texto) {
        this.texto = texto;
        numPalabras = texto.split(" ").length;
    }

    @Override
    public int getNumPalabras() {
        return numPalabras;
    }
}
