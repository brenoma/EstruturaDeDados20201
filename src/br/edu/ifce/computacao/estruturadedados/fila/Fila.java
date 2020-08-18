package br.edu.ifce.computacao.estruturadedados.fila;

/**
 * 
 *  TAD (Tipo Abstrato de Dados) Fila
 * 
 * @author Breno Menezes (breno.menezes.alencar05@aluno.ifce.edu.br)
 *
 * @since 18/08/2020
 * 
 * @version 1.0
 *
 */

public interface Fila {
	
	/**
	 * Operações Principais
	 */
	
	public void push(Integer value);
	public Integer pop();
	
	/**
	 *  Operações Auxiliares
	 */
	
	public boolean isFull();
	public boolean isEmpty();
	public void show();
}
