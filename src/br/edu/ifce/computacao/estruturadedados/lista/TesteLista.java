package br.edu.ifce.computacao.estruturadedados.lista;

public class TesteLista {

	public static void main(String[] args) {

		Lista list = new ListaImpl(5);
		
		list.remove(0);
		list.add(0, 1);
		list.remove(0);
		list.add(0, 2);
		list.add(1, 3);
		list.add(0, 999);
		list.add(3, 662);
		list.show();
		

	}

}
