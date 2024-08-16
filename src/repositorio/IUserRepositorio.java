package repositorio;

import entidades.Motorista;

import java.util.List;

public interface IUserRepositorio {
    void salvar(Motorista usuario);
    void alterar(Motorista usuario);
    void deletar(int id);
    List<Motorista> listar();
    Motorista listarPorId(int id);
}
