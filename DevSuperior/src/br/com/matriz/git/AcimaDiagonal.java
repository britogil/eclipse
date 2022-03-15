package br.com.matriz.git;

import java.util.Scanner;

public class AcimaDiagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 0;
		
		int matriz[][] = new int [N][N];
		
		System.out.print("Qual a Ordem da Matriz? ");
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento" + "[" + i + "," + j +"]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		sc.close();

	}

}
