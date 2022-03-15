/**
 * 
 */
package br.com.matriz.git;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author anavb
 *
 */
public class SomaLinhas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = 0;
		int N = 0;
		int countLinha = 0;
		int soma0 = 0;
		int soma1 = 0;

		System.out.print("Quantidade de LInhas: ");
		M = sc.nextInt();
		System.out.print("Quantidade de Colunas: ");
		N = sc.nextInt();

		double matriz [][] = new double[M][N];
		
		for(int i = 0; i < M; i++) {
			countLinha++;
			System.out.println("Digite os Elementos da " +countLinha +"º linha: ");
			for(int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextDouble();		
			}
		}
		System.out.println();
		System.out.println("VETOR GERADO:");
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == 0) {
					soma0 += matriz[i][j];
				}
				else if(i == 1) {
					soma1 += matriz[i][j];
				}
			}
		}
		
		System.out.println(soma0);
		System.out.println(soma1);
		
		sc.close();

	}

}
