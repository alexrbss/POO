package unidade2.exercicios.reuso.exercicio62;

public class EventoDelegacao {
    private DataHora dataHora;
    private String eventoDelegacao;

    public EventoDelegacao(String data, String hora, String eventoDelegacao) {
        dataHora = new DataHora(data, hora);
        this.eventoDelegacao = eventoDelegacao;
    }

    public String toString() {
        return "EVENTO DELEGACAO\n" + dataHora.toString() + "Evento: " + eventoDelegacao + "\n";
    }
}
