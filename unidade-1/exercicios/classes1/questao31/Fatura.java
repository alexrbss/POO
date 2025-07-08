/*
    31) Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a
    quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. Forneça também um método chamado calculaTotal que calcula e retorna o valor de
    fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste que demonstre as capacidades da classe criada.
*/
package exercicios.classes1.questao31;

public class Fatura {
    private int id;
    private String descricao;
    private int quantidadeComprada;
    private double precoUnitario;

    // Construtor
    public Fatura(int id, String descricao, int quantidadeComprada, double precoUnitario) {
        this.id = id;
        this.descricao = descricao;
        
        if (quantidadeComprada < 0) {
            this.quantidadeComprada = 0;
        } else {
            this.quantidadeComprada = quantidadeComprada;
        }
        
        if (precoUnitario < 0) {
            this.precoUnitario = 0.0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }

    public double calculaTotal() {
        return quantidadeComprada * precoUnitario;
    }

    public String toString() {
        return String.format("ID: %d\nDescricao: %s\nValor da Fatura: R$ %.2f", id, descricao, calculaTotal());
    }

}
