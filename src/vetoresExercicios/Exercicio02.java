package vetoresExercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		int vetorInteiros[] = new int[10];
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetorInteiros[i] = leia.nextInt();

		}

		System.out.print("Elementos nos indices impares: ");
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (i % 2 != 0) {
				System.out.print(vetorInteiros[i]);
				System.out.print(" ");
			}
		}

		System.out.print("\nElementos nos indices pares: ");
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (i % 2 == 0) {
				System.out.print(vetorInteiros[i]);
				System.out.print(" ");
			}
		}

		System.out.print("\nSoma dos elementos do vetor: ");
		int soma = 0;
		for (int i = 0; i < vetorInteiros.length; i++) {
			soma += vetorInteiros[i];
		}
		System.out.println(soma);

		System.out.println("Média dos elementos do vetor: ");
		float media = 0f;
		for (int i = 0; i < vetorInteiros.length; i++) {
			media = (float) soma / vetorInteiros.length;
		}
		System.out.printf("%.2f", media);

		leia.close();
	}

}
