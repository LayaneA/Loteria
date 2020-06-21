package vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LotoFacil extends Jogo{
	
	public static Scanner scanner = new Scanner(System.in);
	
	@Override
	public void maisAparecem(int n[]) {
		
		for(int i = 0; i <25; i++) {
			System.out.println("Número "+i+" apareceu "+n[i]+" vezes");
		}
		
		LotoFacil L = new LotoFacil();
		for(int i = 0; i <= 25; i++) {
			 if(n[i] > L.getN1()) {
				 L.setN1(n[i]);
				 L.setPos1(i); 	 
			 }		
		 }
		 for(int i = 0; i <= 25; i++) {
			 if(n[i] > L.getN2() && n[i] <= L.getN1() && i != L.getPos1()) {
				 L.setN2(n[i]);
				 L.setPos2(i);		 
			 }		 
		 }
		 for(int i = 0; i <= 25; i++) {
			 if(n[i] > L.getN3() && n[i] <= L.getN2() && i != L.getPos2()) {
				 L.setN3(n[i]);
				 L.setPos3(i);	 
			 }
		 }
		 for(int i = 0; i <= 25; i++) {
			 if(n[i] > L.getN4() && n[i] <= L.getN3() && i != L.getPos3()) {
				 L.setN4(n[i]);
				 L.setPos4(i);		 
			 }
		 }
		 

		 for(int i = 0; i <= 25; i++) {
			 if(n[i] > L.getN5() && n[i] <= L.getN4() && i != L.getPos4()) {
				 L.setN5(n[i]);
				 L.setPos5(i);
			 }
		 }
		
		 
		 
		System.out.println("NÚMEROS QUE MAIS APARECERAM:\n");
		System.out.println("Número "+L.getPos1()+ " apareceu "+L.getN1()+" vezes");
		System.out.println("Número "+L.getPos2()+ " apareceu "+L.getN2()+" vezes");
		System.out.println("Número "+L.getPos3()+ " apareceu "+L.getN3()+" vezes");
		System.out.println("Número "+L.getPos4()+ " apareceu "+L.getN4()+" vezes");
		System.out.println("Número "+L.getPos5()+ " apareceu "+L.getN5()+" vezes");
		
	}
	
	@Override
	public void menosAparecem(int n[]) {
		
		LotoFacil L = new LotoFacil();
    	L.setN1(10000);
		 for(int i = 1; i <= 25; i++) {
			 if(n[i] < L.getN1()) {
				 L.setN1(n[i]);
				 L.setPos1(i);
			 } 
		 }
		 int auxiliar = n[25];
		 for(int i = 1; i <= 25; i++) {
			 if(n[i] < auxiliar && n[i] > L.getN1()) {
				 auxiliar = n[i];
				 L.setN2(n[i]);
				 L.setPos2(i);
			 } 
		 }
		 auxiliar = n[25];
		 for(int i = 1; i <= 25; i++) {
			 if(n[i] <= auxiliar && n[i] > L.getN2()) {
				 auxiliar = n[i];
				 L.setN3(n[i]);
				 L.setPos3(i);
			 }
		 }
		 auxiliar = n[25];
		 for(int i = 1; i <= 25; i++) {
			 if(n[i] <= auxiliar && n[i] > L.getN3()) {
				 auxiliar = n[i];
				 L.setN4(n[i]);
				 L.setPos4(i);
			 } 
		 }
		 auxiliar = n[25];
		 for(int i = 1; i <= 25; i++) {
			 if(n[i] <= auxiliar && n[i] > L.getN4()) {
				 auxiliar = n[i];
				 L.setN5(n[i]);
				 L.setPos5(i);
			 } 
		 }
        System.out.println("NÚMEROS QUE MENOS APARECERAM:\n");
		System.out.println("Número "+L.getPos1()+ " apareceu "+L.getN1()+" vezes");
		System.out.println("Número "+L.getPos2()+ " apareceu "+L.getN2()+" vezes");
		System.out.println("Número "+L.getPos3()+ " apareceu "+L.getN3()+" vezes");
		System.out.println("Número "+L.getPos4()+ " apareceu "+L.getN4()+" vezes");
		System.out.println("Número "+L.getPos5()+ " apareceu "+L.getN5()+" vezes");
		
	}
	
	@Override
	public void conferirAposta(ArrayList<Integer> a, ArrayList <String>b) {
		int n = b.size();
	    int [][] y = new int [n][15];
			
			int contador = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 15; j++) {
					y[i][j] = a.get(contador);
					contador++;
				}
			}
			int quantidade;
			do {
				System.out.println("Qual a quantidade de números apostados?\n"
						+ "(valores entre 15 à 18)");
				quantidade = scanner.nextInt(); 
				if(quantidade < 15 || quantidade > 18) {
					System.out.println("Inválido!");
				}
			} while(quantidade < 15 || quantidade > 18);
			
			
			int [] z = new int[quantidade];
			System.out.println("Digite os "+quantidade+" valores marcados:");
			for(int i = 0; i < quantidade; i++) {
				z[i] = scanner.nextInt();
				if(z[i] < 1 || z[i] > 25) {
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
				for(int j = 0; j < 15; j++) {
					for(int k = 0; k < quantidade; k++)
					if(z[k] == y[i][j]) {
					 acertos++;
					 
					 }
					 
					if(acertos == 15) {
						 System.out.println("Vitória com 15 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n");
					 }
					 
						 if(acertos == 14 && j == 14) {
							 System.out.println("Vitória com 14 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n"); 
						 } 
					 
						 if(acertos == 13 && j == 14) {
							 System.out.println("Vitória com 13 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n"); 
						 }
						 
						 if(acertos == 12 && j == 14) {
							 System.out.println("Vitória com 12 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n"); 
						 }
						 
						 if(acertos == 11 && j == 14) {
							 System.out.println("Vitória com 11 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n"); 
						 }
				}
				
			}
		
	}
	
	@Override
	public void gerarAposta() {
		
		int quantidade;
		do {
			System.out.println("Quantidade de números para gerar aposta:\n"
					+ "(valores entre 15 à 18)");
			quantidade = scanner.nextInt(); 
			if(quantidade < 15 || quantidade > 18) {
				System.out.println("Inválido!");
			}
		} while(quantidade < 15 || quantidade > 18);
		
        Random radom  = new Random();

        Set<Integer> numeros = new HashSet();

        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            int n = random.nextInt(25)+1;
            numeros.add(n);
        }

        Integer[] resultado = numeros.toArray(new Integer[numeros.size()]);
        System.out.println("Os "+quantidade+" números gerados foram:");
        System.out.println(Arrays.toString(resultado));
  
	}
        
	

}
