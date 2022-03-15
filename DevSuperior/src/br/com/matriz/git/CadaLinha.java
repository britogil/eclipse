package br.com.matriz.git;

import java.util.Scanner;

public class CadaLinha {

	public static void main(String[] args) {
		 Scanner sc  = new Scanner(System.in);
		 
		 int N = 0;
		 int elementoMaior = 0;
		 
		 System.out.print("Qual a Ordem da Matriz: ");
		 N = sc.nextInt();
		 
		 int matriz[][] = new int[N][N];
		 
		 for(int i = 0; i < N; i++) {
			 for(int j = 0; j < N; j++) {
				 System.out.print("Elemento" + "[" + i + "," + j +"]: ");
				 matriz[i][j] = sc.nextInt();
			 }
		 }
		 
		 for(int i = 0; i < N; i++) {
			 for(int j = 0; j < N; j++) {
				 if (matriz[i][j] > elementoMaior) {
					 elementoMaior = matriz[i][j];
				 }
			 }
			 System.out.println(elementoMaior);
			 elementoMaior = 0;
		 }
		 		 
		 sc.close();

	}

}
