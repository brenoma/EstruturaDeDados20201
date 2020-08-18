package br.edu.ifce.computacao.estruturadedados.lista;

/**
 * 
 *  TAD (Tipo Abstrato de Dados) Lista
 * 
 * @author Breno Menezes (breno.menezes.alencar05@aluno.ifce.edu.br)
 *
 * @since 18/08/2020
 * 
 * @version 1.0
 *
 */

public interface Lista {

	/**
	 * Operações Principais
	 */
	
	public void add(int index, Integer value);
	public Integer remove(int index);
	
	
	/**
	 * Operações Auxiliares
	 */
	
	public boolean isEmpty();
	public boolean isFull();
	public void show();
	
}
