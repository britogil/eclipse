package br.com.matriz.git;

import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = 0;
		int linha = 0;
		int coluna = 0;
		double valorPositivo = 0;
		double somaPositivo = 0;
		double diagonalPrincipal = 0;
		double valorNegativo = 0;

		System.out.print("Qual a Ordem da Matriz? ");
		N = sc.nextInt();

		double matriz [][] = new double[N][N];

		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento" + "[" + i + "," + j +"]: ");
				matriz[i][j] = sc.nextDouble();
			}
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(matriz[i][j] > 0) {
					valorPositivo = matriz[i][j];
					somaPositivo += valorPositivo;			
				}
			}
		}
		
		System.out.println();
		System.out.printf("SOMA DOS POSITIVOS: %.1f \n"+" ",somaPositivo);
		
		System.out.println();
		System.out.print("Escolha uma Linha: " );
		linha = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA: ");
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				if(linha == i) {
					System.out.print(" " + matriz[i][j] );
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.print("Escolha uma Coluna: " );
		coluna = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				if(coluna == j) {
					System.out.print(" " + matriz[i][j] );
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++) {
				if(i == j) {
					diagonalPrincipal = matriz[i][j];
					System.out.print(" " + diagonalPrincipal);
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("MATRIZ ALTERADA: ");
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(matriz[i][j] < 0) {			
					matriz[i][j] = Math.pow(matriz[i][j], 2);
					System.out.println(matriz[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		sc.close();

	}

}
