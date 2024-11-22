package moveis;

public class Imoveis {
    protected String endereço;
	protected double preço;

//Construtor que inicializa o endereço e o preço do imóvel.
	public Imoveis(String endereço, double preço) {
		this.endereço = endereço;
		this.preço = preço;
	}

//Este método é chamado automaticamente quando o objeto precisa ser convertido em uma String, ao imprimir o objeto com System.out.println
	public String toString() {
		return this.endereço + "-" + this.preço;
	}

// Retorna o preço do imóvel.
	public double getValordeVenda() {
		return this.preço;
	}
}
