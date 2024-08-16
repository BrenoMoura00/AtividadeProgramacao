package entidades;

public class Viagens {
    private int numViagem;
    private int mediaPassageiros;
    private int horasViagem;
    private String rotas;
    private double kmPorViagem;


    public Viagens(int numViagem, int mediaPassageiros, int horasViagem, String rotas, double kmPorViagem) {
        this.numViagem = numViagem;
        this.mediaPassageiros = mediaPassageiros;
        this.horasViagem = horasViagem;
        this.rotas = rotas;
        this.kmPorViagem = kmPorViagem;
    }

    public Viagens(Viagens viagens) {
        this.numViagem = viagens.numViagem;
        this.mediaPassageiros = viagens.mediaPassageiros;
        this.horasViagem = viagens.horasViagem;
        this.rotas = viagens.rotas;
        this.kmPorViagem = viagens.kmPorViagem;
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

    public double getKmPorViagem() {
        return kmPorViagem;
    }

    @Override
    public String toString() {
        return "Viagens |" +
                "numViagem=" + numViagem +
                ", mediaPassageiros: " + mediaPassageiros +
                ", horasViagem: " + horasViagem +
                ", rotas: '" + rotas +
                "Quilometro Por viagem: " + kmPorViagem +
                '|';
    }
}
