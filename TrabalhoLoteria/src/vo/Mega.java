package vo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

  public class Mega extends Jogo{
	  
	public static Scanner scanner = new Scanner(System.in);
	

	@Override
	public void maisAparecem(int n[]) {
		Mega m = new Mega();
		 m.setN1(n[0]);
		 for(int i = 0; i <= 60; i++) {
			 if(n[i] > m.getN1()) {
				 m.setN1(n[i]);
				 m.setPos1(i); 	 
			 }		
		 }
		 for(int i = 0; i <= 60; i++) {
			 if(n[i] > m.getN2() && n[i] <= m.getN1() && i != m.getPos1()) {
				 m.setN2(n[i]);
				 m.setPos2(i);		 
			 }		 
		 }
		 for(int i = 0; i <= 60; i++) {
			 if(n[i] >= m.getN3() && n[i] <= m.getN2() && i != m.getPos2()) {
				 m.setN3(n[i]);
				 m.setPos3(i);	 
			 }
		 }
		 for(int i = 0; i <= 60; i++) {
			 if(n[i] >= m.getN4() && n[i] <= m.getN3() && i != m.getPos3()) {
				 m.setN4(n[i]);
				 m.setPos4(i);		 
			 }
		 }		 
		 for(int i = 0; i <= 60; i++) {
			 if(n[i] >= m.getN5() && n[i] <= m.getN4() && i != m.getPos4()) {
				 m.setN5(n[i]);
				 m.setPos5(i);
			 }
		 }
		System.out.println("NÚMEROS QUE MAIS APARECERAM:\n");
		System.out.println("Número "+m.getPos1()+ " apareceu "+m.getN1()+" vezes");
		System.out.println("Número "+m.getPos2()+ " apareceu "+m.getN2()+" vezes");
		System.out.println("Número "+m.getPos3()+ " apareceu "+m.getN3()+" vezes");
		System.out.println("Número "+m.getPos4()+ " apareceu "+m.getN4()+" vezes");
		System.out.println("Número "+m.getPos5()+ " apareceu "+m.getN5()+" vezes");
		
	}

	@Override
	public void menosAparecem(int n[]) {
		Mega m = new Mega();
    	m.setN1(1000);
		 for(int i = 1; i <= 60; i++) {
			 if(n[i] < m.getN1()) {
				 m.setN1(n[i]);
				 m.setPos1(i);
			 } 
		 }
		 int auxiliar = n[60];
		 for(int i = 1; i <= 60; i++) {
			 if(n[i] < auxiliar && n[i] > m.getN1()) {
				 auxiliar = n[i];
				 m.setN2(n[i]);
				 m.setPos2(i);
			 } 
		 }
		 auxiliar = n[60];
		 for(int i = 1; i <= 60; i++) {
			 if(n[i] <= auxiliar && n[i] > m.getN2()) {
				 auxiliar = n[i];
				 m.setN3(n[i]);
				 m.setPos3(i);
			 }
		 }
		 auxiliar = n[60];
		 for(int i = 1; i <= 60; i++) {
			 if(n[i] <= auxiliar && n[i] > m.getN3()) {
				 auxiliar = n[i];
				 m.setN4(n[i]);
				 m.setPos4(i);
			 } 
		 }
		 auxiliar = n[60];
		 for(int i = 1; i <= 60; i++) {
			 if(n[i] <= auxiliar && n[i] > m.getN4()) {
				 auxiliar = n[i];
				 m.setN5(n[i]);
				 m.setPos5(i); 
			 } 
		 }
        System.out.println("NÚMEROS QUE MENOS APARECERAM:\n");
		System.out.println("Número "+m.getPos1()+ " apareceu "+m.getN1()+" vezes");
		System.out.println("Número "+m.getPos2()+ " apareceu "+m.getN2()+" vezes");
		System.out.println("Número "+m.getPos3()+ " apareceu "+m.getN3()+" vezes");
		System.out.println("Número "+m.getPos4()+ " apareceu "+m.getN4()+" vezes");
		System.out.println("Número "+m.getPos5()+ " apareceu "+m.getN5()+" vezes");
		
	}

	@Override
	public void conferirAposta(ArrayList<Integer> a, ArrayList <String>b) {
	int n = b.size();
    int [][] y = new int [n][6];
		
		int contador = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 6; j++) {
				y[i][j] = a.get(contador);
				contador++;
			}
		}
		int quantidade;
		do {
			System.out.println("Quantidade de números apostados?\n"
					+ "(valores entre 6 à 15)");
			quantidade = scanner.nextInt(); 
			if(quantidade < 6 || quantidade > 15) {
				System.out.println("Inválido!");
			}
		} while(quantidade < 6 || quantidade > 15);
		
		
		int [] z = new int[quantidade];
		System.out.println("Digite os "+quantidade+" valores marcados:");
		for(int i = 0; i < quantidade; i++) {
			z[i] = scanner.nextInt();
			if(z[i] < 1 || z[i] > 60) {
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
			for(int j = 0; j < 6; j++) {
				for(int k = 0; k < quantidade; k++)
				if(z[k] == y[i][j]) {
				 acertos++;
				 
				 }
				 
				if(acertos == 6) {
					 System.out.println("Vitória com 6 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n");
				 }
				 
					 if(acertos == 5 && j == 5) {
						 System.out.println("Vitória com 5 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n"); 
					 } 
				 
					 if(acertos == 4 && j == 5) {
						 System.out.println("Vitória com 4 acertos no jogo "+(i+1)+"\nData: "+b.get(i)+"\n"); 
					 }
			}
			
		}
		
	}

	@Override
	public void gerarAposta() {
		int quantidade;
		do {
			System.out.println("Quantidade de números para gerar aposta:\n"
					+ "(valores entre 6 à 15)");
			quantidade = scanner.nextInt(); 
			if(quantidade < 6 || quantidade > 15) {
				System.out.println("Inválido!");
			}
		} while(quantidade < 6 || quantidade > 15);
		
		Random radom  = new Random();

        Set<Integer> numeros = new HashSet();

        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            int n = random.nextInt(60)+1;
            numeros.add(n);
        }

        Integer[] resultado = numeros.toArray(new Integer[numeros.size()]);
        System.out.println("Os "+quantidade+" números gerados foram:");
        System.out.println(Arrays.toString(resultado));
		
	}
	  
   
}