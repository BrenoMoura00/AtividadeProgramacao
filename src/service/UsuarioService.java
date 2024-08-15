package service;

import entidades.Usuario;
import repositorio.UsuarioRepositorio;

public class UsuarioService {
    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioService(UsuarioRepositorio repositorio) {
        this.usuarioRepositorio = repositorio;

    }

    public UsuarioService() {

    }

    public void salvar(Usuario usuario) {
        if (usuario.getId() < 18) {
            throw new IllegalArgumentException("Usuário só pode ser cadastrado se for maior de 18 anos");
        }

        usuarioRepositorio.salvar(usuario);
    }

    public void deletar(int id) {
        usuarioRepositorio.deletar(id);
    }

    public void alterar(Usuario usuario) {
        boolean usuarioEncontrado = false;

        for (Usuario u : usuarioRepositorio.listar()) {
            if (u.getId() == usuario.getId()) {
                usuarioEncontrado = true;
                break;
            }
        }
        if (!usuarioEncontrado) {
            throw new IllegalArgumentException("Usuário não encontrado para alteração");
        }
        usuarioRepositorio.alterar(usuario);
    }
}
