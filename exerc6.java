/*Num determinado estado, para transferências de um veículo do antigo para o novo dono, o
DETRAN cobra uma taxa de 1% para carros fabricados antes de 2000 e uma taxa de 1,5% para os
fabricados de 2000 em diante, taxa essa incidindo sobre o valor de tabela do carro. Calcule e exiba o valor do imposto a ser pago no momento da transferência, dado o
ano de fabricação e o valor de tabela do carro.*/

Scanner input = new Scanner (System.in);
		double anoFabri, imposto, valorCarro;
		System.out.println ("ano de fabricação do carro");
		anoFabri = input.nextDouble();
		System.out.println ("valor do imposto a ser pago");
		imposto = input.nextDouble();
		System.out.println("valor de tabela do carro");
		valorCarro = input.nextDouble();
		if (valorCarro < 2000) {
			anoFabri = valorCarro * 0.0001;
			System.out.println("O valor final do carro é" + anoFabri);
		}
		else {
			anoFabri = valorCarro * 0.0015;
			System.out.println("O valor final do carro é" + anoFabri);
		}
		
	}

}
