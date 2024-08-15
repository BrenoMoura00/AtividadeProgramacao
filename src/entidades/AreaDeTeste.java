package entidades;

import repositorio.UsuarioRepositorio;

import java.util.List;

public class AreaDeTeste {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Breno", "123213123", "A", "Rota principal", 2300.45, 23, 2, 182, 35, 1092);
        UsuarioRepositorio usuarioRep = new UsuarioRepositorio(); // Cria a instância do repositório

        usuarioRep.salvar(usuario);

        List<Usuario> usuarioList = usuarioRep.listar();
        System.out.println("------------Add------------");
        System.out.println(usuarioList);

        usuarioRep.deletar(1);
        System.out.println("------------deletado------------");
        System.out.println(usuarioList);
    }
}
