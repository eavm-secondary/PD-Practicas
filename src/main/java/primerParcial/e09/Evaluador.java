package primerParcial.e09;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {
    private Context context;
    private List<AbstractExpression> grammar = new ArrayList<>();

    public Evaluador(String input){
        context = new Context(input.replace(" ",""));
        for(String word: input.split(" ")){
            grammar.add(new NumberExpression(word.length()));
        }
    }

    public String evaluate(){
        for(AbstractExpression ae: grammar){
            ae.interpreter(context);
        }
        return context.output;
    }
}
