package parcialFinal.e03;

import java.util.ArrayList;
import java.util.List;

public class UnidadDisco implements IComponent {
    private List<Folder> folders = new ArrayList<>();

    public UnidadDisco addFolder(Folder folder) {
        folders.add(folder);
        return this;
    }

    public UnidadDisco removeArchivo(Folder folder) {
        folders.remove(folder);
        return this;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    @Override
    public int getNumPalabras() {
        return folders.stream()
                .map(IComponent::getNumPalabras)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
