package br.edu.ifce.computacao.estruturadedadosfila;

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
	 * Opera��es Principais
	 */
	
	public void addEnd(Integer value);
	public Integer removeStart();
	
	/**
	 *  Opera��es Auxiliares
	 */
	
	public boolean isFull();
	public boolean isEmpty();
	public void show();
}
