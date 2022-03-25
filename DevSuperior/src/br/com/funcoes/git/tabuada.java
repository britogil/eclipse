package br.com.funcoes.git;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Você quer a tabuada de qual numero: ");
		int N = sc.nextInt();
		
//		for(int i = 1; i <= 10; i++) {
//			int result = N * i;
//			System.out.println(N + " x " + i + " = " + result);
//		}
		
		int rTabuada = tabuada(N);
		int i = 0;
		//showResult(rTabuada, N, i);

        sc.close();
    }

    public static int tabuada(int N) {
        int resultTabuada = 0;
         for(int i = 1; i <= 10; i++) {
            resultTabuada = N * i;
            System.out.println(N + " x " + i + " = "+ resultTabuada);
        }
        return  resultTabuada;
    }
}