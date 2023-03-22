package parcialFinal.e04;

public class Cluster implements IAppWeb {
    private boolean par = true;
    private final IAppWeb server1 = new Server1();
    private final IAppWeb server2 = new Server2();

    @Override
    public void atenderUsuario(Usuario usuario, String password) {
        if (password.equals(usuario.getPassword())) {
            if (par) {
                server1.atenderUsuario(usuario, password);
            } else {
                server2.atenderUsuario(usuario, password);
            }
            par=!par;
        } else {
            System.out.println("--> "+usuario.getUsername()+": La contraseña ingresada no es correcta");
        }
    }
}
