package exercicios.classes1.questao30;

public class Time {
    private String nome; 
    private String tecnico;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsPro;
    private int golsContra;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.golsPro = 0;
        this.golsContra = 0;
    }

    public void registrarJogo(int golsPro, int golsContra) {
        this.golsPro += golsPro;
        this.golsContra += golsContra;
        if (golsPro > golsContra) {
            vitorias++;
        } else if (golsPro == golsContra) {
            empates++;
        } else {
            derrotas++;
        }
    }

    public int getPontos() {
        return vitorias * 3 + empates;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public String toString() {
        return String.format(
            "Time: %s\nTécnico: %s\nVitórias: %d\nEmpates: %d\nDerrotas: %d\nGols Pró: %d\nGols Contra: %d\nPontos: %d",
            nome, tecnico, vitorias, empates, derrotas, golsPro, golsContra, getPontos()
        );
    }
}

