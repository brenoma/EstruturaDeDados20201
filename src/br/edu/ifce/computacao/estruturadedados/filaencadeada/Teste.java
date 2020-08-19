package br.edu.ifce.computacao.estruturadedados.filaencadeada;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TADFila<Integer> queue = new Fila<Integer>();
		queue.show();
		
		queue.push(10);
		queue.push(12);
		queue.push(14);
		queue.show();
		
		queue.pop();
		queue.show();
		
		queue.pop();
		queue.pop();
		queue.pop();
		queue.show();

	}

}
