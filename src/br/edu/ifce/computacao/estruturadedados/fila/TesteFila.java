package br.edu.ifce.computacao.estruturadedados.fila;

public class TesteFila {

	public static void main(String[] args) {

		Fila queue = new FilaImpl(5);
		
		queue.show();
		
		queue.pop();
		
		queue.push(30);
		queue.show();
		
		queue.push(40);
		queue.show();
		
		queue.push(70);
		queue.show();
		
		queue.pop();
		queue.show();
		
		queue.push(1);
		queue.push(1);
		queue.push(1);
		queue.push(1);
		queue.show();
		

	}

}
