package repositorio;

import entidades.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsuarioRepositorio implements IUserRepositorio { // Altere para IUserRepositorio
    private List<Usuario> usuarioList;

    public UsuarioRepositorio() {
        this.usuarioList = new ArrayList<>();
    }

    @Override
    public void salvar(Usuario usuario) {
        usuarioList.add(usuario);
    }

    @Override
    public void alterar(Usuario usuario) {
        for (Usuario usuario1 : usuarioList) {
            if (usuario.getId() == usuario1.getId()) {
                usuarioList.remove(usuario1);
                usuarioList.add(usuario);
                break; // Adicionado para evitar exceções
            }
        }
    }

    @Override
    public void deletar(int id) {
        Iterator<Usuario> iterator = usuarioList.iterator();
        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if (usuario.getId() == id) {
                iterator.remove(); // Remove o elemento usando o iterador seguro
                break;
            }
        }
    }

    @Override
    public List<Usuario> listar() {
        return usuarioList;
    }

    @Override
    public Usuario listarPorId(int id) {
        for (Usuario usuario : usuarioList) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}
