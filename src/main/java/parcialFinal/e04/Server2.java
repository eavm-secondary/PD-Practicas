package parcialFinal.e04;

public class Server2 implements IAppWeb{
    @Override
    public void atenderUsuario(Usuario usuario, String password) {
        System.out.println("--> Servidor 2 está atendiendo al usuario '"+usuario.getUsername()+"'");
    }
}
