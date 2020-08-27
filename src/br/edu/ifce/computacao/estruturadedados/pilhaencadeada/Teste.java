package br.edu.ifce.computacao.estruturadedados.pilhaencadeada;

public class Teste {

	public static void main(String[] args) {
		TADPilha<Integer> stack = new Pilha<Integer>();
		TADPilha chamada = new Pilha();
		
		stack.show();
		stack.push(3);
		stack.show();
		stack.push(15);
		stack.push(150);
		stack.show();
		stack.pop();
		stack.show();
		
		chamada.push("Breno");
		chamada.push("João");
		chamada.push("Patricia");
		chamada.show();
		chamada.pop();
		chamada.show();

	}

}
