package repositorio;

import entidades.Usuario;

import java.util.List;

public interface IUserRepositorio {
    void salvar(Usuario usuario);
    void alterar(Usuario usuario);
    void deletar(int id);
    List<Usuario> listar();
    Usuario listarPorId(int id);
}
