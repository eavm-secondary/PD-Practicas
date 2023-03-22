package primerParcial.e04;

import java.util.Map;

public class FactoryMateria {
    private static Map<String,Materia> materiasMap = Map.of(
            "matematicas",new Matematicas(),
            "lenguaje",new Lenguaje(),
            "historia",new Historia(),
            "ingles",new Ingles()
    );
    public Materia make(String type){
        return materiasMap.getOrDefault(type.toLowerCase(),new Matematicas());
    }
}
