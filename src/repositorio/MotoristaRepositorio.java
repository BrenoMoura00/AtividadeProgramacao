package repositorio;

import entidades.Motorista;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MotoristaRepositorio implements IUserRepositorio { // Altere para IUserRepositorio
    private List<Motorista> motoristaLista;

    public MotoristaRepositorio() {
        this.motoristaLista = new ArrayList<>();
    }

    @Override
    public void salvar(Motorista usuario) {
        motoristaLista.add(usuario);
    }

    @Override
    public void alterar(Motorista usuario) {
        for (Motorista usuario1 : motoristaLista) {
            if (usuario.getId() == usuario1.getId()) {
                motoristaLista.remove(usuario1);
                motoristaLista.add(usuario);
                break; // Adicionado para evitar exceções
            }
        }
    }

    @Override
    public void deletar(int id) {
        Iterator<Motorista> iterator = motoristaLista.iterator();
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
        return motoristaLista;
    }

    @Override
    public Motorista listarPorId(int id) {
        for (Motorista usuario : motoristaLista) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}
