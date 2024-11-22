package moveis;

import java.util.Random;

public class AppImovel {
public static void main(String[] args) {
		// Cria um array de 3 elementos do tipo 'Imoveis'.
		Imoveis[] imo = new Imoveis[3];
		// Inicializa o primeiro elemento do array com um objeto da classe 'Imoveis'.
		// A propriedade "Portão" tem um preço de 2000.
		imo[0] = new Imoveis("Portão", 2000);
		// Inicializa o segundo elemento do array com um objeto da classe 'Novo', que
		// herda de 'Imoveis'.
		// A propriedade "alfhaville" tem um preço de 100000 e um valor adicional de
		// 500.
		imo[1] = new Novo("alfhaville", 100000, 500);
		// Inicializa o terceiro elemento do array com um objeto da classe 'Velho', que
		// também herda de 'Imoveis'.
		// A propriedade "itapuã" tem um preço de 3000 e um desconto de 20.
		imo[2] = new Velho("itapuã", 3000, 20);
		// Cria um objeto da classe Random, que pode ser usado para gerar valores
		// aleatórios.
		Random ram = new Random();
		// Loop 'for' para percorrer todos os elementos do array 'imo'.
		for (int i = 0; i < imo.length; i++) {
			// Imprime as informações do imóvel no índice atual do array.
			System.out.println(imo[i]);
			// Imprime o valor de venda do imóvel, chamando o método 'getValordeVenda()'.
			System.out.println("Valor de Venda:" + imo[i].getValordeVenda());
		}
	}
}
