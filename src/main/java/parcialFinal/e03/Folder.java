package parcialFinal.e03;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IComponent {
    private List<Archivo> archivos = new ArrayList<>();

    public Folder addArchivo(Archivo archivo) {
        archivos.add(archivo);
        return this;
    }

    public Folder removeArchivo(Archivo archivo) {
        archivos.remove(archivo);
        return this;
    }

    public List<Archivo> getArchivos() {
        return archivos;
    }

    @Override
    public int getNumPalabras() {
        return archivos.stream()
                .map(IComponent::getNumPalabras)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
