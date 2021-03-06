package br.edu.ifce.computacao.estruturadedados.filaencadeada;

/*
 * 
 * TAD (Tipo Abstrato de Dados) Fila Encadeada
 * 
 * @author Breno Menezes (breno.menezes.alencar05@aluno.ifce.edu.br)
 *
 * @since 23/08/2020
 * 
 * @version 1.0
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
