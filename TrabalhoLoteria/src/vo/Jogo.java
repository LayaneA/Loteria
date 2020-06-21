package vo;

import java.util.ArrayList;

public abstract class Jogo implements Opcoes{
    
	protected int n1; //quantidade de vezes que o número aparece
	protected int n2;
	protected int n3;
	protected int n4;
	protected int n5;
	protected int pos1; //índice do número no array
	protected int pos2;
	protected int pos3;
	protected int pos4;
	protected int pos5;
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	public int getN4() {
		return n4;
	}
	public void setN4(int n4) {
		this.n4 = n4;
	}
	public int getN5() {
		return n5;
	}
	public void setN5(int n5) {
		this.n5 = n5;
	}
	public int getPos1() {
		return pos1;
	}
	public void setPos1(int pos1) {
		this.pos1 = pos1;
	}
	public int getPos2() {
		return pos2;
	}
	public void setPos2(int pos2) {
		this.pos2 = pos2;
	}
	public int getPos3() {
		return pos3;
	}
	public void setPos3(int pos3) {
		this.pos3 = pos3;
	}
	public int getPos4() {
		return pos4;
	}
	public void setPos4(int pos4) {
		this.pos4 = pos4;
	}
	public int getPos5() {
		return pos5;
	}
	public void setPos5(int pos5) {
		this.pos5 = pos5;
	}

	@Override
	public void maisAparecem(int[] n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menosAparecem(int[] n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void conferirAposta(ArrayList<Integer> a, ArrayList<String> b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gerarAposta() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
