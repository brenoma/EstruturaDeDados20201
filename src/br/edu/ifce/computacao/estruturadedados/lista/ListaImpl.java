package br.edu.ifce.computacao.estruturadedados.lista;

public class ListaImpl implements Lista {
	
	public Integer[] list;
	public int index;
	
	public ListaImpl(int size) {
		list = new Integer[size];
		index = -1;
	}

	@Override
	public void add(int index, Integer value) {

		if (isFull()) {
			System.out.println("Lista Cheia. Elemento não inserido.");
			return;
		}else if (index > this.index+1) {
			System.out.println("Insira o elemento em uma posição válida.");
			return;
		}
		
		for (int i = this.index ; i >= index ; i--) {
			list[i+1] = list[i];
		}
		
		list[index] = value;
		this.index++;
		
	}

	@Override
	public Integer remove(int index) {

		if (isEmpty()) {
			System.out.println("Lista Vazia. Nada para retirar.");
			return null;
		}else if (index > this.index) {
			System.out.println("Posição inválida. Retire um elemento de dentro da Lista");
			return null;
		}
		
		int value = list[index];
		
		for (int i = index ; i <= this.index ; i++) {
			list[i] = list[i+1];
		}
		
		list[this.index--] = null;
		return value;
	}

	@Override
	public boolean isFull() {
		
		if (index == list.length -1) return true;
		
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
			System.out.println("Lista vazia. Nada para mostrar.");
			return;
		}
		
		for (int i = 0; i <= index; i++) {
			System.out.print(list[i] + "\t");
		}
		System.out.println();
	}
}