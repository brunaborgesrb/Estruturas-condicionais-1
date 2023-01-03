/*Solicitar ao usuário que digite dois números inteiros M e N e determinar se M é divisível por N. */

Scanner input = new Scanner (System.in);
		int M, N;
		System.out.println ("digite um número: (M)");
		M = input.nextInt();
		System.out.println ("digite um número: (N)");
		N = input.nextInt();
		if (M/N == 0); {
		System.out.println("M é divisível por N");
		}
		else {
			System.out.println("M não é divisível por N");
			}
	}

}
