package br.edu.ifce.computacao.estruturadedados.pilha;

public class PilhaImpl implements Pilha {
	
	public Integer[] stack;
	public int top;
	
	public PilhaImpl(int size) {
		stack = new Integer[size];
		top = -1;
	}

	@Override
	public void push(Integer value) {
		
		if (isFull()) {
			System.out.println("Pilha cheia. Elemento não inserido.");
			return;
		}
		
		stack[++top] = value;
		
	}

	@Override
	public Integer pop() {
		
		if (isEmpty()) {
			System.out.println("Pilha vazia. Não há elementos para retirar.");
			return null;
		}
		
		int value = stack[0];
		
//		for (int i = 0; i <= top; i++) {
//			stack[i] = stack[i+1];
//		}
		
		stack[top--] = null;
		return value;
	}

	@Override
	public boolean isFull() {
		
		if (top == stack.length -1) return true;
		
		return false;
	}

	@Override
	public boolean isEmpty() {

		if (top == -1) return true;
		
		return false;
	}

	@Override
	public void show() {

		if (isEmpty()) {
			System.out.println("Pilha vazia. Nada para mostrar.");
			return;
		}
		
		for (int i = 0; i <= top; i++) {
			System.out.print(stack[i] + "\t");
		}
		System.out.println();
	}

}