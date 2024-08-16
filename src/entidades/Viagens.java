package entidades;

public class Viagens {
    private int numViagem;
    private int mediaPassageiros;
    private int horasViagem;
    private String rotas;

    public Viagens(int numViagem, int mediaPassageiros, int horasViagem, String rotas) {
        this.numViagem = numViagem;
        this.mediaPassageiros = mediaPassageiros;
        this.horasViagem = horasViagem;
        this.rotas = rotas;
    }

    public Viagens(Viagens viagens) {
        this.numViagem = viagens.numViagem;
        this.mediaPassageiros = viagens.mediaPassageiros;
        this.horasViagem = viagens.horasViagem;
        this.rotas = viagens.rotas;
    }


    public int getNumViagem() {
        return numViagem;
    }

    public int getMediaPassageiros() {
        return mediaPassageiros;
    }

    public int getHorasViagem() {
        return horasViagem;
    }

    public String getRotas() {
        return rotas;
    }

    @Override
    public String toString() {
        return "Viagens{" +
                "numViagem=" + numViagem +
                ", mediaPassageiros=" + mediaPassageiros +
                ", horasViagem=" + horasViagem +
                ", rotas='" + rotas + '\'' +
                '}';
    }
}
