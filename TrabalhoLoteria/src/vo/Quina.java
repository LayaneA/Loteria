package vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Quina extends Jogo{
	
	public static Scanner scanner = new Scanner(System.in);

	@Override
	public void maisAparecem(int n[]) {
 
		Quina q = new Quina();
		
		 for(int i = 0; i <= 80; i++) {
			 if(n[i] > q.getN1()) {
				 q.setN1(n[i]);
				 q.setPos1(i); 	 
			 }		
		 }
		 for(int i = 0; i <= 80; i++) {
			 if(n[i] > q.getN2() && n[i] <= q.getN1() && i != q.getPos1()) {
				 q.setN2(n[i]);
				 q.setPos2(i);		 
			 }		 
		 }
		 for(int i = 0; i <= 80; i++) {
			 if(n[i] > q.getN3() && n[i] <= q.getN2() && i != q.getPos2()) {
				 q.setN3(n[i]);
				 q.setPos3(i);	 
			 }
		 }
		 for(int i = 0; i <= 80; i++) {
			 if(n[i] > q.getN4() && n[i] <= q.getN3() && i != q.getPos3()) {
				 q.setN4(n[i]);
				 q.setPos4(i);		 
			 }
		 }
		 

		 for(int i = 0; i <= 80; i++) {
			 if(n[i] > q.getN5() && n[i] <= q.getN4() && i != q.getPos4()) {
				 q.setN5(n[i]);
				 q.setPos5(i);
			 }
		 }
		
		 
		 
		System.out.println("NÚMEROS QUE MAIS APARECERAM:\n");
		System.out.println("Número "+q.getPos1()+ " apareceu "+q.getN1()+" vezes");
		System.out.println("Número "+q.getPos2()+ " apareceu "+q.getN2()+" vezes");
		System.out.println("Número "+q.getPos3()+ " apareceu "+q.getN3()+" vezes");
		System.out.println("Número "+q.getPos4()+ " apareceu "+q.getN4()+" vezes");
		System.out.println("Número "+q.getPos5()+ " apareceu "+q.getN5()+" vezes");
	
	}

	@Override
	public void menosAparecem(int n[]) {
		Quina q = new Quina();
    	q.setN1(10000);
		 for(int i = 1; i <= 80; i++) {
			 if(n[i] < q.getN1()) {
				 q.setN1(n[i]);
				 q.setPos1(i);
			 } 
		 }
		 int auxiliar = n[80];
		 for(int i = 1; i <= 80; i++) {
			 if(n[i] < auxiliar && n[i] > q.getN1()) {
				 auxiliar = n[i];
				 q.setN2(n[i]);
				 q.setPos2(i);
			 } 
		 }
		 auxiliar = n[80];
		 for(int i = 1; i <= 80; i++) {
			 if(n[i] <= auxiliar && n[i] > q.getN2()) {
				 auxiliar = n[i];
				 q.setN3(n[i]);
				 q.setPos3(i);
			 }
		 }
		 auxiliar = n[80];
		 for(int i = 1; i <= 80; i++) {
			 if(n[i] <= auxiliar && n[i] > q.getN3()) {
				 auxiliar = n[i];
				 q.setN4(n[i]);
				 q.setPos4(i);
			 } 
		 }
		 auxiliar = n[80];
		 for(int i = 1; i <= 80; i++) {
			 if(n[i] <= auxiliar && n[i] > q.getN4()) {
				 auxiliar = n[i];
				 q.setN5(n[i]);
				 q.setPos5(i);
			 } 
		 }
        System.out.println("NÚMEROS QUE MENOS APARECERAM:\n");
		System.out.println("Número "+q.getPos1()+ " apareceu "+q.getN1()+" vezes");
		System.out.println("Número "+q.getPos2()+ " apareceu "+q.getN2()+" vezes");
		System.out.println("Número "+q.getPos3()+ " apareceu "+q.getN3()+" vezes");
		System.out.println("Número "+q.getPos4()+ " apareceu "+q.getN4()+" vezes");
		System.out.println("Número "+q.getPos5()+ " apareceu "+q.getN5()+" vezes");
		
	}

	@Override
	public void conferirAposta(ArrayList<Integer> a, ArrayList <String>b) {
		int n = b.size();
	    int [][] y = new int [n][5];
			
			int contador = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 5; j++) {
					y[i][j] = a.get(contador);
					contador++;
				}
			}
			int quantidade;
			do {
				System.out.println("Qual a quantidade de números apostados?\n"
						+ "(valores entre 5 à 15)");
				quantidade = scanner.nextInt(); 
				if(quantidade < 5 || quantidade > 15) {
					System.out.println("Inválido!");
				}
			} while(quantidade < 5 || quantidade > 15);
			
			
			int [] z = new int[quantidade];
			System.out.println("Digite os "+quantidade+" valores marcados:");
			for(int i = 0; i < quantidade; i++) {
				z[i] = scanner.nextInt();
				if(z[i] < 1 || z[i] > 80) {
					System.out.println("Número inválido!");
					i--; 	
				}
				for(int j = 0; j < i; j++) {
					if(z[j] == z[i]) {
						System.out.println("Número já apostado!");
						i--; 
						
					}
				}
				
			}
			
			int acertos = 0;
			for(int i = 0; i < n; i++) {
				acertos = 0;
				for(int j = 0; j < 5; j++) {
					for(int k = 0; k < quantidade; k++)
					if(z[k] == y[i][j]) {
					 acertos++;
					 
					 }
					 
					if(acertos == 5) {
						 System.out.println("Vitória com 5 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n");
					 }
					 
						 if(acertos == 4 && j == 4) {
							 System.out.println("Vitória com 4 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n"); 
						 } 
					 
						 if(acertos == 3 && j == 4) {
							 System.out.println("Vitória com 3 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n"); 
						 }
						 
						 if(acertos == 2 && j == 4) {
							 System.out.println("Vitória com 2 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n"); 
						 }
				}
				
			}
		
	}

	@Override
	public void gerarAposta() {
		int quantidade;
		do {
			System.out.println("Quantidade de números para gerar aposta:\n"
					+ "(valores entre 5 à 15)");
			quantidade = scanner.nextInt(); 
			if(quantidade < 5 || quantidade > 15) {
				System.out.println("Inválido!");
			}
		} while(quantidade < 5 || quantidade > 15);
		
		Random radom  = new Random();

        Set<Integer> numeros = new HashSet();

        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            int n = random.nextInt(80)+1;
            numeros.add(n);
        }

        Integer[] resultado = numeros.toArray(new Integer[numeros.size()]);
        System.out.println("Os "+quantidade+" números gerados foram:");
        System.out.println(Arrays.toString(resultado));
		
	}
	

}
