package t1.stiva;


/**
 * 
 * Stiva = structura de date ale carei elemente sunt considerate a fi puse unul
 * peste celalalt a.i. orice element adaugat se pune in varful stivei si orice
 * element eliminat se extrage din varful ei, invers ordinii introducerii lor.
 * Se presupune cunoasterea apriorii a dimensiunii maxime a stivei.
 * 
 * @author arianagm
 * 
 */

public class Stiva {

	private Element[] elements;
	private int index = -1;
	private int maxCapacity;

	public Stiva(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		elements = new Element[maxCapacity];
	};

	public void insert(Element e) {
		if (isFull()) {
			System.out.println("Stiva e plina. Sterge elemente pentru a adauga altele.");
		} else {
			elements[++index] = e;
		}
	}

	public void remove() {
		if(isEmpty()) {
			System.out.println("Stiva e goala deja.");
		} else {
			System.out.println("Sterge element cu data=" + elements[index].getData());
			elements[index] = null;
			index--;
		}
	}

	public boolean isEmpty() {
		if (index == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		return index == (maxCapacity - 1);
	}
	
	public void print() {
		int top = index;
		while (top > -1) {
			System.out.println("element[" + top + "]=" + elements[top].getData());
			top--;
		}
	}

}
