package t1.stiva;

/**
 * Implementati tipul abstract stiva
 * 
 * @author arianagm
 *
 */

public class Main {

	public static void main(String[] args) {
		
		// creeaza stiva de maxim 4 elemente
		Stiva stiva = new Stiva(4);

		// insereaza 4 obiecte
		stiva.insert(new Element("Obj 1"));
		stiva.insert(new Element(Integer.valueOf(2)));
		stiva.insert(new Element(Boolean.FALSE));
		stiva.insert(new Element("Nightmare"));

		// printeaza
		stiva.print();
		
		// adauga element in stiva plina
		stiva.insert(new Element(Long.valueOf(1234567)));
		
		// sterge ultimul nod
		stiva.remove();

		// printeaza
		stiva.print();
		
	}

}
