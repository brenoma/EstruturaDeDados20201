package br.edu.ifce.computacao.estruturadedados.fila;

public class FilaImpl implements Fila{
	
	private Integer[] queue;
	private int index;
	
	public FilaImpl(int size) {
		queue = new Integer[size];
		index = -1;
	}

	@Override
	public void push(Integer value) {
		
		if (isFull()) {
			System.out.println("Fila cheia. Elemento não inserido.");
			return;
		}
		
		queue[++index] = value;
		
	}

	@Override
	public Integer pop() {

		if (isEmpty()) {
			System.out.println("Fila vazia. Não há elementos para retirar.");
			return null;
		}
		
		int value = queue[0];
		
		for(int i=0; i <= index-1; i++) {
			queue[i] = queue[i+1];
		}
		
		queue[index--] = null;
		return value;
	}

	@Override
	public boolean isFull() {
		
		if (index == queue.length -1) return true;
		
		return false;
	}

	@Override
	public boolean isEmpty() {

		if (index == -1) return true;
		
		return false;
	}

	@Override
	public void show() {

		if (isEmpty()) {
			System.out.println("Fila vazia. Nada para mostrar.");
			return;
		}
		
		for (int i = 0; i <= index; i++) {
			System.out.print(queue[i] + "\t");
		}
		System.out.println();
	}

}
