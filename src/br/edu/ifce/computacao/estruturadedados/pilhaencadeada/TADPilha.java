package br.edu.ifce.computacao.estruturadedados.pilhaencadeada;

/*
 * 
 * TAD (Tipo Abstrato de Dados) Pilha Encadeada
 * 
 * @author Breno Menezes (breno.menezes.alencar05@aluno.ifce.edu.br)
 *
 * @since 27/08/2020
 * 
 * @version 1.0
 * 
 */

public interface TADPilha<T> {

	/*
	 * Opera��es Principais
	 */
	
	public void push(T value);
	public T pop();
	
	/*
	 * Opera��es Auxiliares
	 */
	
	public boolean isEmpty();
	public void show();
	
}
