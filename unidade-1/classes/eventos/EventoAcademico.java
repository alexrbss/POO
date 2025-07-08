package classes.eventos;

public class EventoAcademico {
    private String nomeDoEvento;
    private String localDoEvento;
    private int numeroParticipantes;

    // Construtor padrão (antes usavamos o inicializador)
    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroParticipantes) {
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = (localDoEvento.isEmpty() ? "Local não definido" : localDoEvento); 
        this.numeroParticipantes = (numeroParticipantes > 0 ? numeroParticipantes : 1);  // Se o número de participantes for negativo, atribui 1
    }

    public void mostraEvento() {
        System.out.println("Nome do evento: " + nomeDoEvento);
        System.out.println("Local do evento: " + localDoEvento);
        System.out.println("Número de participantes: " + numeroParticipantes);
    }
}
