package parcialFinal.e03;

public class Client {
    public static void main(String[] args) {
        Archivo a1 = new Archivo("hola mundo");
        Archivo a2 = new Archivo("mi nombre es Enrique");
        Archivo a3 = new Archivo("Este es un archivo de prueba");
        Archivo a4 = new Archivo("Este es un segundo archivo de prueba");
        Archivo a5 = new Archivo("Este es un archivo con muchas mas palabras");

        Folder f1 = new Folder();
        f1.addArchivo(a1).addArchivo(a2).addArchivo(a3);

        Folder f2 = new Folder();
        f2.addArchivo(a4).addArchivo(a5);

        UnidadDisco ud = new UnidadDisco();
        ud.addFolder(f1).addFolder(f2);

        System.out.println("Palabras en Archivo 3: "+a3.getNumPalabras());
        System.out.println("Palabras en Folder 2: "+f2.getNumPalabras());
        System.out.println("Palabras en la unidad de disco: "+ud.getNumPalabras());
    }
}
