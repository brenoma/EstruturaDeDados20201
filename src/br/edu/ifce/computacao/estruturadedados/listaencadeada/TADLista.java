package br.edu.ifce.computacao.estruturadedados.listaencadeada;

/*
 * 
 * TAD (Tipo Abstrato de Dados) Lista Encadeada
 * 
 * @author Breno Menezes (breno.menezes.alencar05@aluno.ifce.edu.br)
 *
 * @since 27/08/2020
 * 
 * @version 1.0
 * 
 */

public interface TADLista<T> {

	/*
	 * Opera��es Principais
	 */
	
	public void pushStart(T value);
	public void pushPos(T value, int pos);
	public void pushEnd(T value);
	
	public T pop(int pos);
	
	/*
	 * Opera��es Auxiliares
	 */
	
	public boolean isEmpty();
	public void show();
	
}
