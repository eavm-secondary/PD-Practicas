package primerParcial.e06;

public class Cliente {
    public static void main(String[] args) {
        String userStory = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Evaluador evaluador = new Evaluador(userStory);
        System.out.println(evaluador.evaluate());

    }
}
