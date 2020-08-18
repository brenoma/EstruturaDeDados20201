package br.edu.ifce.computacao.estruturadedados.pilha;

public class TestePilha {

	public static void main(String[] args) {

		Pilha stack = new PilhaImpl(5);
		
		stack.show();
		
		stack.pop();
		
		stack.push(30);
		stack.show();
		
		stack.push(40);
		stack.show();
		
		stack.push(70);
		stack.show();
		
		stack.pop();
		stack.show();
		
		stack.push(1);
		stack.push(1);
		stack.push(1);
		stack.push(1);
		stack.show();
		

	}
}
