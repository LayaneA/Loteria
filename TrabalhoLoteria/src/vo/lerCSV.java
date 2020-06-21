package vo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class lerCSV {
	
  public void leituraMega(int a [], ArrayList<Integer> b, ArrayList<String> c) {
	  
	  ArrayList <String> numeros = new ArrayList();
	  		
		String fileName = "mega.csv";
		File file = new File(fileName);
		
		try {
			Scanner scanner = new Scanner (file);
			while(scanner.hasNext()) {		
				String mega = scanner.next();
				String [] valores = mega.split(",");
				numeros.add(valores[2]); numeros.add(valores[3]); numeros.add(valores[4]);
				numeros.add(valores[5]); numeros.add(valores[6]); numeros.add(valores[7]);
				c.add(valores[1]);
			}
			
			scanner.close();	
		} catch(FileNotFoundException e) {
		}				
		int tamanho = numeros.size();
		int cont = 0;
		String valores [] = new String [tamanho];
		int n [] = new int [tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			n[i] = Integer.parseInt(numeros.get(i));
			b.add(n[i]);
	    }
		
		for (int i = 0; i <= 60; i++) {
	    	for(int j = 0; j < tamanho; j++) { 
	    		if(i == n[j]) {
	    			cont++;
	    			a[i] = cont;
	    		}	
	    	}
	    	cont = 0;
	    }	 
		
	}
	
public void leituraQuina(int a [], ArrayList<Integer> b, ArrayList<String> c) {
	  
	  ArrayList <String> numeros = new ArrayList();
	  		
		String fileName = "quina.csv";
		File file = new File(fileName);
		
		try {
			Scanner scanner = new Scanner (file);
			while(scanner.hasNext()) {		
				String quina = scanner.next();
				String [] valores = quina.split(",");
				numeros.add(valores[2]); numeros.add(valores[3]); numeros.add(valores[4]);
				numeros.add(valores[5]); numeros.add(valores[6]);
				c.add(valores[1]);
			}
			
			scanner.close();	
		} catch(FileNotFoundException e) {
		}				
		int tamanho = numeros.size();
		int cont = 0;
		String valores [] = new String [tamanho];
		int n [] = new int [tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			n[i] = Integer.parseInt(numeros.get(i));
			b.add(n[i]);
	    }
		
		for (int i = 0; i <= 80; i++) {
	    	for(int j = 0; j < tamanho; j++) { 
	    		if(i == n[j]) {
	    			cont++;
	    			a[i] = cont;
	    		}	
	    	}
	    	cont = 0;
	    }	 
		
	}

public void leituraLoto(int a [], ArrayList<Integer> b, ArrayList<String> c) {
	  
	  ArrayList <String> numeros = new ArrayList();
	  		
		String fileName = "lotofacil.csv";
		File file = new File(fileName);
		
		try {
			Scanner scanner = new Scanner (file);
			while(scanner.hasNext()) {		
				String lotofacil = scanner.next();
				String [] valores = lotofacil.split(",");
				numeros.add(valores[2]); numeros.add(valores[3]); numeros.add(valores[4]);
				numeros.add(valores[5]); numeros.add(valores[6]); numeros.add(valores[7]);
				numeros.add(valores[8]); numeros.add(valores[9]); numeros.add(valores[10]);
				numeros.add(valores[11]); numeros.add(valores[12]); numeros.add(valores[13]);
				numeros.add(valores[14]); numeros.add(valores[15]); numeros.add(valores[16]);
				c.add(valores[1]);
			}
			
			scanner.close();	
		} catch(FileNotFoundException e) {
		}				
		int tamanho = numeros.size();
		int cont = 0;
		String valores [] = new String [tamanho];
		int n [] = new int [tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			n[i] = Integer.parseInt(numeros.get(i));
			b.add(n[i]);
	    }
		
		for (int i = 0; i <= 25; i++) {
	    	for(int j = 0; j < tamanho; j++) { 
	    		if(i == n[j]) {
	    			cont++;
	    			a[i] = cont;
	    		}	
	    	}
	    	cont = 0;
	    }	 
		
	}
	

}
