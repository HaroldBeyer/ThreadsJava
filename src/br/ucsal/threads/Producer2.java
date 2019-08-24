package br.ucsal.threads;

public class Producer2 implements Runnable{
	private Pilha pilha;
	private static final char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','x','y','w','z'};
	Producer2(Pilha pilha) {
		this.pilha = pilha;
	}
	@Override
	public void run() {
		for(char letra : letras) {
			this.pilha.push(letra);
		}
		// TODO Auto-generated method stub
		
	}

}
