package unidade2.exercicios.reuso.exercicio62;

public class EventoHeranca extends DataHora {
    private String eventoHeranca;

    public EventoHeranca(String data, String hora, String eventoHeranca) {
        super(data, hora);
        this.eventoHeranca = eventoHeranca;
    }

    @Override
    public String toString() {
        return "EVENTO HERANCA\n" + super.toString() + "Evento: " + eventoHeranca + "\n";
    }
}
