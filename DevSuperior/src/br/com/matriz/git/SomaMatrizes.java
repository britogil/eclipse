package br.com.matriz.git;

import java.util.Scanner;

public class SomaMatrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = 0;
		int N = 0;
		int somaMatrizAB = 0;

		System.out.print("Quants Linhas vai ter cada Matriz? ");
		M = sc.nextInt();
		System.out.print("Quants Colunas vai ter cada Matriz? ");
		N = sc.nextInt();

		int matrizA[][] = new int [M][N];
		int matrizB[][] = new int [M][N];
		int matrizC[][] = new int [M][N];

		System.out.println("Digite os Valores da Matriz A: ");
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento" + "[" + i + "," + j +"]: ");
				matrizA[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite os Valores da Matriz B: ");
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento" + "[" + i + "," + j +"]: ");
				matrizB[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("MATRIZ SOMA:");
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				somaMatrizAB = matrizA[i][j] + matrizB[i][j];
				matrizC[i][j] = somaMatrizAB;
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}


		sc.close();

	}

}
