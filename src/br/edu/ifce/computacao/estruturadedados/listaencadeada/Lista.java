package br.edu.ifce.computacao.estruturadedados.listaencadeada;

public class Lista<T> implements TADLista<T> {
	
	private Node<T> head;
	private int size;
	
	public Lista() {
		head = null;
		size = 0;
	}

	@Override
	public void pushStart(T value) {
		Node<T> newNode = new Node<T>(value, null);
		
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		
		size++;
	}

	@Override
	public void pushPos(T value, int pos) {
		
		if (pos == 0) {
			pushStart(value);
			size++;
			return;
		} else if (pos == size) {
			pushEnd(value);
			size++;
			return;
		} else if (pos < 0 || pos > size) {
			System.out.println("Posição inválida. Elemento não inserido.");
			return;
		}
		
		Node<T> newNode = new Node<T>(value, null);
		Node<T> nodeBefore = head;
		for (int i = 0; i < pos - 1; i++) {
			nodeBefore = nodeBefore.getNext();
		}
		
		Node<T> nodeAfter = nodeBefore.getNext();
		nodeBefore.setNext(newNode);
		newNode.setNext(nodeAfter);
		
		size++;
	}

	@Override
	public void pushEnd(T value) {
		Node<T> newNode = new Node<T>(value, null);
		
		if (head == null) {
			head = newNode;
		} else {
			getTail().setNext(newNode);
		}
		
		size++;
	}

	@Override
	public T pop(int pos) {
		
		if (pos < 0 || pos >= size) {
			System.out.println("Posição Inválida. Elemento não retirado.");
			return null;
		}
		
		Node<T> beforeNode = head;
		
		for (int i = 0; i < pos - 1; i++) {
			beforeNode = beforeNode.getNext();
		}
		
		Node<T> removedNode = beforeNode.getNext();
		beforeNode.setNext(removedNode.getNext());
		removedNode.setNext(null);

		size--;
		return removedNode.getValue();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public Node<T> getTail() {
		Node<T> aux = head;
		
		// When list is empty
		if (aux == null) {
			return null;
		}
		
		while (aux.getNext() != null) {
			aux = aux.getNext();
		}
		return aux;
	}
	
	

}
