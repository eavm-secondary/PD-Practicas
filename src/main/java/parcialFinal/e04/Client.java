package parcialFinal.e04;

public class Client {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("eavm", "1234");
        Usuario u2 = new Usuario("amysan", "5678");
        Usuario u3 = new Usuario("andersaurio", "abcd");
        Usuario u4 = new Usuario("vivs", "abc123");
        Usuario u5 = new Usuario("bussy", "aeiou");

        Cluster servidorProxy = new Cluster();

        u1.login(servidorProxy, "1234");
        u2.login(servidorProxy, "6789");
        u3.login(servidorProxy, "abcd");
        u4.login(servidorProxy, "abc123");
        u5.login(servidorProxy, "aeiou");
    }
}
