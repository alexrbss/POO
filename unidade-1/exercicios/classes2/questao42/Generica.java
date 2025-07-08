package exercicios.classes2.questao42;

public class Generica<T> {
    private T a, b, c;

    public Generica(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int quantosIguais() {
        int iguais = 0;
        if (a.equals(b) && b.equals(c)) {
            iguais = 3;
        } else if (a.equals(b) || a.equals(c) || b.equals(c)) {
            iguais = 2;
        } else {
            iguais = 0;
        }
        return iguais;
    }

    public void imprime() {
        System.out.println("Atributos: " + a + ", " + b + ", " + c);
    }    
}
