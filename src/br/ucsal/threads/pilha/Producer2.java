package br.ucsal.threads.pilha;

public class Producer2 implements Runnable{
	private Pilha pilha;
	private static final char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','x','y','w','z'};
	Producer2(Pilha pilha) {
		this.pilha = pilha;
	}
	@Override
	public void run() {
		for (int i = 0; i < letras.length; i++) {
			pilha.push(letras[i]);
		}
		System.out.println("PRODUCER DONE!");
		
	}

}
