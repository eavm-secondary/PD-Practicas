package primerParcial.e06;

public class AnyWord extends AbstractExpression{

    private String word;
    public AnyWord(String word){
        this.word = word;
    }
    @Override
    public void interpreter(Context context) {
        context.input = context.input.substring(word.length());
        context.output+=word+" ";
    }
}
