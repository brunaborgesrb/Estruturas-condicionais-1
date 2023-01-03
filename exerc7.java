/* Em uma dada empresa, os funcionários recebem por hora trabalhada. O valor da hora trabalhada
pago pela empresa equivale a 1,5% do salário mínimo. Caso o salário do funcionário em um dado
mês seja superior a R$ 2500,00, será descontado o imposto de renda. O percentual do imposto de
renda a ser descontado é de 7,5% do valor do salário. Solicite o valor do salário mínimo e a quantidade de horas trabalhadas e calcule e exiba: o salário total do
funcionário, o desconto do imposto de renda e o salário a receber após o desconto do imposto. */

Scanner input = new Scanner (System.in);
		double minimo, sTotal, ir, sFinal, vHoras;
		int qdtHoras;
		System.out.println ("informe o valor do salário minímo: ");
		minimo = input.nextDouble();
		System.out.println("infome a quantidade de horas trabalhadas: ");
		qdtHoras = input.nextInt();
		vHoras = minimo * 0.0015;
		sTotal = qdtHoras * vHoras;
		if (sTotal > 2500.0) {
			ir = sTotal * 0.0075;
		}
		else {
			ir = 0;
		}
		sFinal = sTotal - ir;
		System.out.println("salário bruto: " + sTotal);
		System.out.println("desconto do importo de renda: " + ir);
		System.out.println("salário líquido: " + sFinal);
		}

}
