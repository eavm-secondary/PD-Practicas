package primerParcial.e09;

public class Cliente {
    public static void main(String[] args) {
        String nums = "1 2 1 7 5 9 10 3 8 10 6 4";
        Evaluador evaluador = new Evaluador(nums);
        System.out.println(evaluador.evaluate());
    }
}
