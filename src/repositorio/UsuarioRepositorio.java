package repositorio;

import entidades.Motorista;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsuarioRepositorio implements IUserRepositorio { // Altere para IUserRepositorio
    private List<Motorista> usuarioList;

    public UsuarioRepositorio() {
        this.usuarioList = new ArrayList<>();
    }

    @Override
    public void salvar(Motorista usuario) {
        usuarioList.add(usuario);
    }

    @Override
    public void alterar(Motorista usuario) {
        for (Motorista usuario1 : usuarioList) {
            if (usuario.getId() == usuario1.getId()) {
                usuarioList.remove(usuario1);
                usuarioList.add(usuario);
                break; // Adicionado para evitar exceções
            }
        }
    }

    @Override
    public void deletar(int id) {
        Iterator<Motorista> iterator = usuarioList.iterator();
        while (iterator.hasNext()) {
            Motorista usuario = iterator.next();
            if (usuario.getId() == id) {
                iterator.remove(); // Remove o elemento usando o iterador seguro
                break;
            }
        }
    }

    @Override
    public List<Motorista> listar() {
        return usuarioList;
    }

    @Override
    public Motorista listarPorId(int id) {
        for (Motorista usuario : usuarioList) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}
