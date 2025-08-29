package school.sptech;

public class Time {
    String nome;
    Integer vitorias, derrotas, empates;

    public Time(){
        vitorias = 0;
        derrotas = 0;
        empates = 0;
    }

    public void registrarVitoria() {
        vitorias++;
    }

    public void registrarEmpate() {
        empates++;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public Integer getPontos() {
        return (vitorias * 3) + empates;
    }

    public Integer getTotalPartidas() {
        return vitorias + empates + derrotas;
    }

    public Integer getAproveitamento() {
        return ((vitorias * 100) / getTotalPartidas());
    }

    public void compararAproveitamento(Time adversario) {
        if (getAproveitamento() > adversario.getAproveitamento()){
            System.out.println("O time 1 tem maior aproveitamento");
        } else {
            System.out.println("O time 2 tem maior aproveitamento");
        }
    }
}
