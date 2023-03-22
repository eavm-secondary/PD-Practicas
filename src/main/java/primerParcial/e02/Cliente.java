package primerParcial.e02;

public class Cliente {
    public static void main(String[] args) {
        Contrato c1 = new Contrato();
        c1.setNombre("Juan").setApellido("Perez")
                .setSueldo(5000)
                .setCargaHoraria(80)
                .setCursoEducacionSuperior(true)
                .setAccesoPlataforma(true)
                .setMarcadoBiometrico(false)
                .setHoraEntrada("08:00")
                .setHoraSalida("18:00");

        Contrato c2 = c1.clone().setNombre("Pablo").setApellido("Romanov");
        Contrato c3 = c1.clone().setNombre("Alan").setApellido("Turing");
        Contrato c4 = c1.clone().setNombre("Alfonso").setApellido("Pardo");
        Contrato c5 = c1.clone().setNombre("Victor").setApellido("Ixeda");
        Contrato c6 = c1.clone().setNombre("Samanta").setApellido("Alvarez");
        Contrato c7 = c1.clone().setNombre("Julia").setApellido("Apaza");
        Contrato c8 = c1.clone().setNombre("Patricio").setApellido("Estrella");
        Contrato c9 = c1.clone().setNombre("Bob").setApellido("Esponha");
        Contrato c10 = c1.clone().setNombre("Bob").setApellido("El Constructor");
        Contrato c11 = c1.clone().setNombre("Amber").setApellido("Heard");
        Contrato c12 = c1.clone().setNombre("Harry").setApellido("Potter");
        Contrato c13 = c1.clone().setNombre("Ariana").setApellido("Marin");
        Contrato c14 = c1.clone().setNombre("Viviana").setApellido("Rodriguez");
        Contrato c15 = c1.clone().setNombre("George").setApellido("Rodriguez");

        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
        c4.showInfo();
        c5.showInfo();
        c6.showInfo();
        c7.showInfo();
        c8.showInfo();
        c9.showInfo();
        c10.showInfo();
        c11.showInfo();
        c12.showInfo();
        c13.showInfo();
        c14.showInfo();
        c15.showInfo();
    }
}
