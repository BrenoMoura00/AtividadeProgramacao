package servico;

import entidades.Motorista;
import repositorio.MotoristaRepositorio;

import java.util.ArrayList;
import java.util.List;

public class MotoristaServico {
    private MotoristaRepositorio motoristaRepositorio;

    public MotoristaServico(MotoristaRepositorio repositorio) {
        this.motoristaRepositorio = repositorio;
    }

    public MotoristaServico() {}

    public void salvar(Motorista motorista) {
        motoristaRepositorio.salvar(motorista);
    }

    public void deletar(int id) {
        motoristaRepositorio.deletar(id);
    }

    public void alterar(Motorista motorista) {
        boolean motoristaEncontrado = false;

        for (Motorista u : motoristaRepositorio.listar()) {
            if (u.getId() == motorista.getId()) {
                motoristaEncontrado = true;
                break;
            }
        }
        if (!motoristaEncontrado) {
            throw new IllegalArgumentException("Usuário não encontrado para alteração");
        }
        motoristaRepositorio.alterar(motorista);


    }
    public List<Motorista> listar(){
        return motoristaRepositorio.listar();

    }
}
