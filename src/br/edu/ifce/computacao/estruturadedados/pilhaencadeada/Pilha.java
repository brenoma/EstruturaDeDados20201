package br.edu.ifce.computacao.estruturadedados.pilhaencadeada;

import br.edu.ifce.computacao.estruturadedados.filaencadeada.Node;

public class Pilha<T> implements TADPilha<T> {
	
	private Node<T> header;
	private int size;
	
	public Pilha() {
		header = null;
		size = 0;
	}

	@Override
	public void push(T value) {
		
		Node<T> newNode = new Node<T>(value, null);
		
		if (size == 0) {
			header = newNode;
		}else {
			newNode.setNext(header);
			header = newNode;
		}
		size++;
		
	}

	@Override
	public T pop() {
		
		if (isEmpty()) {
			System.out.println("Pilha vazia. Não há elementos para remoção");
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
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void show() {
		
		if (isEmpty()) {
			System.out.println("Pilha vazia. Não há elementos para exibição");
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
