package primerParcial.e09;

import java.util.Map;

public class Context {
    protected String input;
    protected String output = "";

    private static Map<String,String> grammar = Map.of(
            "1","I",
            "2","II",
            "3","III",
            "4", "IV",
            "5","V",
            "6","VI",
            "7","VII",
            "8","VIII",
            "9","IX",
            "10","X"
    );

    public Context(String input) {
        this.input = input;
    }

    public String getRomanSimbol(String number) {
        return grammar.getOrDefault(number," ");
    }
}
