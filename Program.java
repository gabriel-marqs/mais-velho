package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		
		String[] vNome = new String[n];
		int[] vIdade = new int[n];
		int idade = vIdade[0];
		int mVelho = 0;
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dª pessoa: \n", i+1);
			System.out.print("Nome: ");
			vNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vIdade[i] = sc.nextInt();

			if (vIdade[i] > idade) {
				idade = vIdade[i];
				mVelho = i;
			}
			
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vNome[mVelho]);
		sc.close();

	}

}
