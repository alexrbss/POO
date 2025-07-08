package unidade2.exercicios.reuso.exercicio62;

public class DataHora {
    private String data;
    private String hora;

    public DataHora(String data, String hora) {
        this.data = data;
        this.hora = hora;
    }

    public String toString() {
        return "Data: " + data + "\n" + "Hora: " + hora + "h\n";
    }
}
