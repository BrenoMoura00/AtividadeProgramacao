package entidades;

import repositorio.MotoristaRepositorio;
import servico.MotoristaServico;

public class AreaDeTeste {
    public static void main(String[] args) {
        Viagens viagens = new Viagens(1, 35, 1000, "principal", 100.5);
        Motorista motorista = new Motorista(1, "Breno", "12345678900", "A", 2300.45, 45, 12, viagens);
        MotoristaRepositorio motoristaRepositorio = new MotoristaRepositorio();
        MotoristaServico motoristaServico = new MotoristaServico(motoristaRepositorio);

        motoristaServico.salvar(motorista);

        System.out.println("----------Lista-de-Motoristas----------");
        System.out.println(motoristaServico.listar());

        double salario = ((motorista.getAnosXP() * 0.1) + (viagens.getKmPorViagem() * 0.5) );
        System.out.println("Bônus pela viagem: " + salario);



    }
}
