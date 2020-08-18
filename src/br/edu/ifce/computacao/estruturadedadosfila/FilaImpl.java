package br.edu.ifce.computacao.estruturadedadosfila;

public class FilaImpl implements Fila{
	
	private Integer[] queue;
	private int index = 0;
	
	public FilaImpl(int size) {
		queue = new Integer[size];
		index--;
	}

	@Override
	public void addEnd(Integer value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer removeStart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
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

}
