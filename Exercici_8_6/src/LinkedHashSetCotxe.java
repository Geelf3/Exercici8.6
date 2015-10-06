import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetCotxe {
	
	public static void main(String[] args) {
		// 1: Create a LinkedHashSet with 5 cars.
		LinkedHashSet<Cotxe> hashSetCotxes = new LinkedHashSet<Cotxe>();

		hashSetCotxes.add(new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		Cotxe dacia = (new Cotxe("Dacia", "Sandero", 1200, 4));
		hashSetCotxes.add(dacia);
		hashSetCotxes.add(new Cotxe("Ford", "Focus", 2000, 4));
		hashSetCotxes.add(new Cotxe("Opel", "Insignia", 2200, 4));
		hashSetCotxes.add(new Cotxe("Seat", "Ibiza", 1600, 4));
		
		// 2: Add 2 more cars.
		hashSetCotxes.add(new Cotxe("Hyundai", "Atos", 1500, 3));
		hashSetCotxes.add(new Cotxe("Ford", "Focus", 2000, 4));
		
		// 3: Can we add duplicates?
		if (hashSetCotxes.add(new Cotxe("Hyundai", "Atos", 1500, 3))) {
			System.out.println("Podem afegir duplicats!!");
		} else {
			System.out.println("No es poden afegir duplicats");
		}

		// 4: Get all the data from all cars.
		Iterator<Cotxe> llistaCotxes = hashSetCotxes.iterator();
		while (llistaCotxes.hasNext()) {
			System.out.println(llistaCotxes.next());
		}
		
		// 5: what order do we have? which kind or list is it?
		System.out.println("Tal com les poses surten en el mateix ordre.");
		System.out.println("Es una fifo");

	}
}

