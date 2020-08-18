package br.edu.ifce.computacao.estruturadedados.pilha;

/**
 * 
 *  TAD (Tipo Abstrato de Dados) Pilha
 * 
 * @author Breno Menezes (breno.menezes.alencar05@aluno.ifce.edu.br)
 *
 * @since 18/08/2020
 * 
 * @version 1.0
 *
 */

public interface Pilha {

	/**
	 * Opera��es Principais
	 */
	
	public void push(Integer value);
	public Integer pop();
	
	
	/**
	 * Opera��es Auxiliares
	 */
	
	public boolean isFull();
	public boolean isEmpty();
	public void show();
	
}
