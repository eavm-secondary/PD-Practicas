package parcialFinal.e04;

public class Server1 implements IAppWeb{
    @Override
    public void atenderUsuario(Usuario usuario, String password) {
        System.out.println("--> Servidor 1 está atendiendo al usuario '"+usuario.getUsername()+"'");
    }
}
