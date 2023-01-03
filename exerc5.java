/*Dados os valores dos coeficientes A e B, calcular e exibir o valor
da raiz de uma equação do 1o grau da forma AX+B=0. Lembre-se que o valor de A não pode ser zero. */

Scanner input = new Scanner (System.in);
		double A, B, x;
		System.out.println ("digite um número:(A) ");
		A = input.nextDouble();
		System.out.println ("digite outro número:(B) ");
		B = input.nextDouble();
		    
			if (A!=0) {
				x = -B/A;
				System.out.println ("O valor da equação é: " + x);
			}
			
			else {
				System.out.println("não é possível calcular o valor de x");
			}
	}

}

