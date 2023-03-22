package primerParcial.e06;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {
    private List<AbstractExpression> grammar = new ArrayList<>();
    private Context context;

    public Evaluador(String userStory){
        context = new Context(userStory.replace(" ",""));
        for (String word : userStory.split(" ")){
            word = word.toLowerCase();
            switch (word){
                case "como":
                    grammar.add(new Como());
                    break;
                case "quiero":
                    grammar.add(new Quiero());
                    break;
                case "para":
                    grammar.add(new Para());
                    break;
                default:
                    grammar.add(new AnyWord(word));
                    break;
            }
        }
    }

    public String evaluate(){
        for(AbstractExpression ae : grammar){
            ae.interpreter(context);
        }
        return context.output;
    }
}
