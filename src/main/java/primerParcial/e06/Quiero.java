package primerParcial.e06;

public class Quiero extends AbstractExpression{
    @Override
    public void interpreter(Context context) {
        context.input = context.input.substring(6);
        context.output+="When ";
    }
}
