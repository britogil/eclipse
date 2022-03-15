package br.com.matriz.git;

import java.util.Scanner;

public class NegativosMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = 0;
		int N = 0;
		int valorNegativo = 0;

		System.out.print("Numeros de Linhas: ");
		M = sc.nextInt();
		System.out.print("Numeros de Colunas: ");
		N = sc.nextInt();

		int matriz[][] = new int[M][N];

		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("ELEMENTO: "+"["+ i +","+ j +"]");
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("VALORES NEGATIVOS: ");
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(matriz[i][j] < 0) {
					valorNegativo = matriz[i][j];
					System.out.println(valorNegativo);
				}
			}
		}

		sc.close();


	}

}
