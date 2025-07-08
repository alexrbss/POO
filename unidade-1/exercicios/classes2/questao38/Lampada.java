package exercicios.classes2.questao38;

import exercicios.classes2.questao37.Contador;

public class Lampada {
    private boolean estadoDaLampada; //true = ligado
    private Contador contadorLuzAcesa;

    public Lampada() {
        estadoDaLampada = false;
        contadorLuzAcesa = new Contador();
    }

    public void acende() {
        if(!estadoDaLampada) {
            estadoDaLampada = true;
            contadorLuzAcesa.incrementar();
        }
    }

    public void apaga() {
        estadoDaLampada = false;
    }

    public void mostraEstado() {
        if (estadoDaLampada) {
            System.out.println("A lampada esta acesa!");
        } else {
            System.out.println("A lampada esta apagada");
        }
    }

    public boolean statusLampada() {
        return estadoDaLampada;
    }

    public void mostraQuantidadeAcesa() {
        System.out.print("A lampada foi acesa ");
        contadorLuzAcesa.imprimir();
        System.out.println(" vezes"); 
    }

}
