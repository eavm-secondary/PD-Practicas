package primerParcial.e06;

public class Para extends AbstractExpression{
    @Override
    public void interpreter(Context context) {
        context.input = context.input.substring(4);
        context.output+="Then ";
    }
}
