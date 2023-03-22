package primerParcial.e09;

public class NumberExpression extends AbstractExpression {

    private int digits;
    public NumberExpression(int digits){
        this.digits=digits;
    }
  //  5  +   4  -  2

    @Override
    public void interpreter(Context context) {
            context.output += context.getRomanSimbol(context.input.substring(0,this.digits))+" ";
            context.input=context.input.substring(this.digits);
    }
}
