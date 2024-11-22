package moveis;

public class Velho extends Imoveis{
// Atributo 'desconto' declarado como protegido (protected), para que classes
	// derivadas possam acessá-lo.
	protected double desconto;

// Construtor da classe 'Velho'. Ele recebe o endereço, o preço do imóvel e o valor do desconto.
// O construtor usa 'super' para chamar o construtor da classe-pai 'Imoveis', inicializando o endereço e o preço.
	public Velho(String endereço, double preço, double desconto) {
		super(endereço, preço); // Chama o construtor da classe-pai 'Imoveis' com o endereço e o preço.
		this.desconto = desconto;// Inicializa o atributo 'desconto'.
	}

//Sobrescreve o método toString da classe Object para retornar uma string que representa os dados do imóvel.
	public String toString() {
		return this.endereço + "-" + this.preço + this.desconto; // Retorna a representação do imóvel: endereço, preço e
																	// desconto.
	}

// Método que retorna o valor de venda do imóvel, subtraindo o desconto do preço original.
	public double getValordeVenda() {
		return this.preço - this.desconto;// Calcula o valor de venda aplicando o desconto no preço.
	}
}
