package moveis;

public class Novo extends Imoveis {
//Atributo adicional é declarado como protegido (protected) para ser acessível a classes derivadas.
protected double adicional;

//Construtor da classe 'Novo'. Ele recebe o endereço, o preço do imóvel e o valor adicional.
// O construtor usa a palavra-chave 'super' para chamar o construtor da classe-pai 'Imoveis', passando os parâmetros de endereço e preço.
	public Novo(String endereço, double preço, double adicional) {
		super(endereço, preço);// Chama o construtor da superclasse 'Imoveis'.
		this.adicional = adicional;// Define o valor adicional.
	}

// Sobrescreve o método toString da classe Object para retornar uma string representando os dados do imóvel.
	public String toString() {
		return this.endereço + "-" + this.preço + "-" + this.adicional;
	}

//Método que retorna o valor de venda do imóvel, somando o preço original ao valor adicional.
	public double getValordeVenda() {
		return this.preço + this.adicional;
	}
}
