import entidades.Motorista;
import entidades.Viagens;
import repositorio.UsuarioRepositorio;
import validacao.ValidarCnh;
import java.util.List;

public class AreaDeTeste {
    public static void main(String[] args) {
        Viagens viagens = new Viagens(1, 35, 1000, "principal");
        Motorista usuario = new Motorista(1, "Breno", "2763445769", "A", 2300.45, 45, 12, viagens );
        UsuarioRepositorio usuarioRep = new UsuarioRepositorio();
        ValidarCnh validador = new ValidarCnh();

        usuario.validarCnh(validador);

        System.out.println(usuario);

        usuarioRep.salvar(usuario);

        List<Motorista> usuarioList = usuarioRep.listar();
        System.out.println("------------Add------------");
        System.out.println(usuarioList);

        usuarioRep.deletar(1);
        System.out.println("------------deletado------------");
        System.out.println(usuarioList);
    }
}
