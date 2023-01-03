/*Solicitar ao usuário que digite dois números inteiros quaisquer e decidir qual dos números digitados é o maior. */

Scanner in = new Scanner(System.in);
    int numero1, numero2;
      System.out.println("digite um número");
    numero1 = in.nextInt();
      System.out.println("digite outro número");
    numero2 = in.nextInt();
    if (numero1 > numero2) {
       System.out.println("o" + numero1 + "é maior");
    }
    else if (numero1 < numero2) {
      System.out.println("o" + numero2 + "é maior");
    }
    else {
      System.out.println("os números são iguais");
    }
  }
}
