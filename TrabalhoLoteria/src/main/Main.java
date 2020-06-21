package main;

import java.util.ArrayList;
import java.util.Scanner;

import Factory.FactoryJogo;
import vo.Jogo;
import vo.Mega;
import vo.lerCSV;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main (String [] args) {
		    
	ArrayList <Integer> a = new ArrayList(); ArrayList <String> b = new ArrayList();
	ArrayList <Integer> c = new ArrayList(); ArrayList <String> d = new ArrayList();
	ArrayList <Integer> e = new ArrayList(); ArrayList <String> f = new ArrayList();
	
	int [] mega = new int [61];
	int [] quina = new int [81];
	int [] loto = new int [26];
	lerCSV x = new lerCSV();
	x.leituraMega(mega, a, b);
	x.leituraQuina(quina, c, d);
	x.leituraLoto(loto, e, f);
	

    int opcao;
    
    do {
		menu();
		opcao = scanner.nextInt();
		scanner.nextLine();
		System.out.println("-----------------------------------------------");
		if(opcao == 1) {
		Jogo jogo = FactoryJogo.criarJogo(opcao);
		subMenu(jogo, mega, a, b);
		}
		else if(opcao == 2) {
		Jogo jogo = FactoryJogo.criarJogo(opcao);
		subMenu(jogo, quina, c, d);
		}
		
		else if(opcao == 3) {
			Jogo jogo = FactoryJogo.criarJogo(opcao);
			subMenu(jogo, loto, e, f);
		}
		
		else if(opcao != 9) {
			System.out.println("Opção Inválida!");
		}
		
	} while(opcao != 9);	
		
	}
	
	public static void menu() {
		System.out.println("\n-----------------------------------------------\n"
				+ "Opções:\n1.Mega Sena\n2.Quina\n3.Lotofácil\n9. "
				+ "Sair");
		
	}
	
	public static void subMenu(Jogo jogo, int [] n, ArrayList<Integer> a, ArrayList <String>b) {
		int opcao2;
		System.out.println("1. 5 números que mais saíram\n" + 
				"2. 5 números que menos saíram\n" + 
				"3. Gerar números randômicos\n" + 
				"4. Verificar meu jogo\n"+
				"9. Retornar\n-----------------------------------------------");
		        opcao2 = scanner.nextInt();
		        if(opcao2 == 1) {
		        	jogo.maisAparecem(n);
		        }
		        
		        else if(opcao2 == 2) {
		        	jogo.menosAparecem(n);
		        }
		        
		        else if(opcao2 == 3) {
		        	jogo.gerarAposta();
		        }
		        
		        else if(opcao2 == 4) {
		        	jogo.conferirAposta(a, b);
		        }
		        else if(opcao2 == 9) {
		        	menu();
		        }
		        else{
		        	System.out.println("Opção Inválida!");
		        }
	}
}
