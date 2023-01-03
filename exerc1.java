/* Solicitar ao usuário a idade de uma pessoa e determinar se a pessoa é ou não maior de idade */

Scanner input = new Scanner (System.in);
		int idade;
		System.out.println ("digite sua idade: ");
		idade = input.nextInt();
		if (idade >=18) {
			System.out.println("esta pessoa tem " + idade + "anos e é maior de idade");
		}
		else { 
			System.out.println ("esta pessoa tem " + idade + "anos e é menor de idade");
		
		}
	
	}

}
