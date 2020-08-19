package br.edu.ifce.computacao.estruturadedados.filaencadeada;

/*
 * 
 */

public interface TADFila<T> {

	/*
	 *  Operações Principais
	 */
	
	public void push(T value);
	public T pop();
	
	/*
	 * Operações Auxiliares
	 */
	
	public boolean isEmpty();
	public void show();
	
}
