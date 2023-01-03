/* Solicite o peso, a altura e o gênero de uma pessoa, calcule e exiba
o seu peso ideal, informando se o peso real coincide com o ideal ou se está abaixo ou acima do
mesmo. Utilize as seguintes fórmulas:
Para homens: Peso ideal = 72,7 x Altura – 58
Para mulheres: Peso ideal = 62,1 x Altura – 44,7 */

Scanner input = new Scanner (System.in);
		double altura, pesoReal, pesoIdeal;
		char genero;
		System.out.println("digite seu peso: ");
		pesoReal = input.nextDouble();
	    System.out.println("digite sua altura: ");
		altura = input.nextDouble();
		System.out.println("digite seu gênero:(m ou f) ");
		genero = input.next().charAt(0);
		
		if (genero == 'm') {
			pesoIdeal = 72.7 * altura - 58;
		}
		else {
			pesoIdeal = 62.1 * altura - 44.7;
		}
		System.out.println ("peso ideal:" + pesoIdeal);
		if (pesoReal == pesoIdeal) {
			System.out.println("a pessoa está no peso ideal");
		}
		else if (pesoReal < pesoIdeal); {
			System.out.println("a pessoa está abaixo do peso ideal");
		}
		else  {
			System.out.println("a pessoa está acima do peso ideal");
			
		}
		
		}

}
