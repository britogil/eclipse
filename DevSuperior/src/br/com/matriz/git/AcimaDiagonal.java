package br.com.matriz.git;

import java.util.Scanner;

public class AcimaDiagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 0;
		int somaPosi = 0 ;
		
		System.out.print("Qual a Ordem da Matriz? ");
		N = sc.nextInt();
		
		int matriz[][] = new int [N][N];
		
//		int matriz[][] = {
//				{1, 2, 3, 4},
//				{5, 6, 7, 8},
//				{9, 10, 11, 12},
//				{13, 14, 15, 16}
//		};
		
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento" + "[" + i + "," + j +"]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j || i > j) {
					continue;											
				}
				somaPosi += matriz[i][j];				
			}		
		}
		
		System.out.print("Soma dos elementos acima da Diagonal: " + somaPosi);
		
		sc.close();

	}

}
