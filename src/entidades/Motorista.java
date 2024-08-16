package entidades;

public class Motorista {

    private String nome;
    private String cnh;
    private String categoriaCnh;
    private Double salario;
    private int id;
    private int idade;
    private int anosXP;
    private Viagens viagens;

    public Motorista(int id, String nome, String cnh, String categoriaCnh, Double salario, int idade, int anosXP, Viagens viagens) {
        this.id = id;
        this.nome = nome;
        this.cnh = cnh;
        this.categoriaCnh = categoriaCnh;
        this.salario = salario;
        this.idade = idade;
        this.anosXP = anosXP;
        this.viagens = new Viagens(viagens);
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

    public Viagens getViagens() {
        return viagens;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id: " + id +
                ", nome: " + nome +
                ", cnh: " + cnh +
                ", categoriaCnh: " + categoriaCnh +
                ", salario: " + salario +
                ", idade: " + idade +
                ", anos de experiência: " + anosXP +
                "Viagens: " + viagens +
                "}";
    }
}
