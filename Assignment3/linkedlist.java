package Assignment3;
import java.util.*; 
class linkedlist {
	public static void main(String[] args) {
	        // Create linked list
	        LinkedList<String> colours = new LinkedList<>();
	        colours.add("Red");
	        colours.add("Blue");
	        colours.add("Yellow");
	        colours.add("Orange");

	        // (i) Display contents using Iterator
	        System.out.println("List using Iterator:");
	        Iterator<String> it = colours.iterator();
	        while(it.hasNext()) {
	            System.out.println(it.next());
	        }

	        // (ii) Display contents in reverse using ListIterator
	        System.out.println("\nList in Reverse using ListIterator:");
	        ListIterator<String> litr = colours.listIterator(colours.size()); // start at end
	        while(litr.hasPrevious()) {
	            System.out.println(litr.previous());
	        }

	        // (iii) Create another list with pink, green
	        LinkedList<String> newColours = new LinkedList<>();
	        newColours.add("Pink");
	        newColours.add("Green");

	        // Insert between Blue and Yellow
	        int pos = colours.indexOf("Yellow");
	        colours.addAll(pos, newColours);

	        // Final list display
	        System.out.println("\nFinal List after inserting Pink and Green:");
	        for(String c : colours) {
	            System.out.println(c);
	        }
	    }
	}

	
	
	
	


