package br.ucsal.threads.pilha;

import br.ucsal.threads.pilha.Consumer2;
import br.ucsal.threads.pilha.Pilha;
import br.ucsal.threads.pilha.Producer2;

public class PrincipalPilha {
public static void main(String[] args) {
	Pilha pilha = new Pilha();
	
	Thread[] threads = {
			new Thread(new Producer2(pilha)),
			new Thread(new Consumer2(pilha))
	};
	
	for(int i = 0; i < threads.length; i++) {
		System.out.println("I" + i);
		threads[i].start();
	}
	System.out.println("Main DONE.");

}
}
