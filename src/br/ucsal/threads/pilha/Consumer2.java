package br.ucsal.threads.pilha;

public class Consumer2 implements Runnable {
	private Pilha pilha;
	private static final int TENTATIVAS = 3;
	
	Consumer2 (Pilha pilha) {
		this.pilha = pilha;
	}
	@Override
	public void run() {
		for (int i = 0; i < TENTATIVAS; i++) {
			System.out.println("CONSUMIDOR" + pilha.pop());
		}
		System.out.println("Consumidor DONE!");
//		System.out.println();
		
	}
}
