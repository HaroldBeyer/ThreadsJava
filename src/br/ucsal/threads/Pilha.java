package br.ucsal.threads;

public class Pilha {
public char [] c;
public int cursor=0;
	public synchronized char pop() {
		if(this.c.length>0) {
			int aux = this.cursor;
			this.cursor--;
			notifyAll();
			return this.c[aux]; 			
		}else {
			System.out.println("Sem elementos na pilha");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	return (Character) null;	
	}
	
	public synchronized void push(char car) {
		if(this.c.length <6) {
			this.c[this.cursor] = car;
			this.cursor++;
			notifyAll();
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
