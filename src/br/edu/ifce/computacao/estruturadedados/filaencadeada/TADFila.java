package br.edu.ifce.computacao.estruturadedados.filaencadeada;

/*
 * 
 */

public interface TADFila<T> {

	/*
	 *  Opera��es Principais
	 */
	
	public void push(T value);
	public T pop();
	
	/*
	 * Opera��es Auxiliares
	 */
	
	public boolean isEmpty();
	public void show();
	
}
