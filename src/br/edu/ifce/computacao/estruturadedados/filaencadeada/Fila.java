package br.edu.ifce.computacao.estruturadedados.filaencadeada;

public class Fila<T> implements TADFila<T> {

	private Node<T> header;
	private int size;
	
	@Override
	public void push(T value) {

		Node<T> newNode = new Node<T>(value, null);
		
		if(isEmpty()) {
			header = newNode;
		} else {
			Node<T> aux = header;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(newNode);
		}
		size++;
	}

	@Override
	public T pop() {
		
		if (isEmpty()) {
			System.out.println("Fila vazia. Não há elementos para retirar.");
			return null;
		}
		
		Node<T> removedNode = header;
		header = header.getNext();
		removedNode.setNext(null);
		
		size--;
		return removedNode.getValue();
	}

	@Override
	public boolean isEmpty() {
		if(size == 0) return true;
		return false;
	}

	@Override
	public void show() {

		if (isEmpty()) {
			System.out.println("Fila vazia. Não há elementos para impressão.");
			return;
		}
		
		Node<T> aux = header;
		
		System.out.print("[ ");
		while(aux != null) {
			System.out.print(aux.getValue() + " ");
			aux = aux.getNext();
		}
		System.out.println("]");
	}

}
