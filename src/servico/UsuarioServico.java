package servico;

import entidades.Motorista;
import repositorio.UsuarioRepositorio;
import validacao.IValidacao;
import java.util.List;

public class UsuarioServico {
    private UsuarioRepositorio usuarioRepositorio;
    private List<IValidacao> validacao;

    public UsuarioServico(UsuarioRepositorio repositorio) {
        this.usuarioRepositorio = repositorio;
    }

    public UsuarioServico() {}

    public void salvar(Motorista motorista) {
        this.validacao.forEach(v -> v.validar(motorista));
        usuarioRepositorio.salvar(motorista);
    }

    public void deletar(int id) {
        usuarioRepositorio.deletar(id);
    }

    public void alterar(Motorista usuario) {
        boolean usuarioEncontrado = false;

        for (Motorista u : usuarioRepositorio.listar()) {
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
