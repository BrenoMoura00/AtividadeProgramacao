package entidades;

import java.util.Scanner;

public class Usuario {

   private String nome;
   private String cnh;
   private String categoriaCnh;
   private String rotas;
   private Double salario;
   private int id;
   private int idade;
   private int anosXP;
   private int nViagem;
   private int passageiros;
   private int horas;

    public Usuario(int id, String nome, String cnh, String categoriaCnh, String rotas, Double salario, int idade, int anosXP, int nViagem, int passageiros, int horas) {
        this.id = id;
        this.nome = nome;
        this.cnh = cnh;
        this.categoriaCnh = categoriaCnh;
        this.rotas = rotas;
        this.salario = salario;
        this.idade = idade;
        this.anosXP = anosXP;
        this.nViagem = nViagem;
        this.passageiros = passageiros;
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public String getCnh() {
        return cnh;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public String getRotas() {
        return rotas;
    }

    public Double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public int getAnosXP() {
        return anosXP;
    }

    public int getnViagem() {
        return nViagem;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public int getHoras() {
        return horas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id: " + id
                + ", nome: " + nome
                + ", cnh: " + cnh
                + ", categoriaCnh: " + categoriaCnh
                + ", rotas: " + rotas
                + ", salario: " + salario
                + ", idade: " + idade
                + ", anos de experiência: " + anosXP
                + ", números de Viagens: " + nViagem
                + ", média de passageiros: " + passageiros
                + ", horas: " + horas + "}"; //tlgd aqui é só pra aparecer no prompt

    }
}