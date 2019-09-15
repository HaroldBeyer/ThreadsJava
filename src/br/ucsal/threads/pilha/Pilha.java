package br.ucsal.threads.pilha;

public class Pilha {

	public volatile char[] buffer = new char[6];
	public volatile int cursor = -1;
	public char letter;
	
	public boolean isFull() {
		return cursor > 5;
	}
	public boolean isEmpty() {
		return cursor < 0;
	}
	public synchronized char pop () {
		try {
			while ( isEmpty() ) wait();
			letter = buffer[cursor];
			cursor --;
			notifyAll();
			return letter;
		} catch (InterruptedException e ) {
			throw new Error(e);
		}
		
	}
	
	public synchronized void push (char value) {
		try {
			while (isFull()) wait();
			System.out.println("CURSOR " + cursor);
			System.out.println("VALUE " + value);
			cursor ++;
			buffer[cursor] = value;
			notifyAll();
		} catch (InterruptedException e) {
			throw new Error(e);
		}
	}
}
