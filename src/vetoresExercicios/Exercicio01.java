package vetoresExercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;
		int vetorInteiros[] = { 1, 4, 75, 5, 23, 8, 34, 2, 3, 6 };

		Arrays.sort(vetorInteiros);

		System.out.println("\nVetor Ordenado");

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println(vetorInteiros[i]);
		}

		System.out.println("Digite um número para saber se a posição dele no vetor: ");
		numero = leia.nextInt();

		int posicao = Arrays.binarySearch(vetorInteiros, numero);

		if (posicao >= 0) {
			System.out.println("O número: " + numero + " foi encontrado e está na posição: " + posicao);
		} else {
			System.out.println("O número não foi encontrado!");
		}
		leia.close();

	}

}
