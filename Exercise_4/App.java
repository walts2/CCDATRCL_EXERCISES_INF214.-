import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> MyClassmate = new LinkedList<>();

        // Adds elements to the queue
        MyClassmate.add("Cinco, Brandon");
        MyClassmate.add("Bolanos, Jap");
        MyClassmate.add("Victoria, Elaine Grace");
        MyClassmate.add("Masangcay, Jenina Velle");
        MyClassmate.add("Bantegui, Moses Christian");

        // Display all elements of the queue.
        System.out.println(MyClassmate);

        // Returns the number of elements in the queue.
        System.out.println(MyClassmate.size());

        // Shows the element at the front of the queue
         System.out.println(MyClassmate.peek()); 

        // Removes the element at the front of the queue
        MyClassmate.remove();
        MyClassmate.remove();
        MyClassmate.remove();
        MyClassmate.remove();
        MyClassmate.remove();

        // Display all elements of the queue.
       System.out.println(MyClassmate);

        // Adds elements to the queue
        MyClassmate.add("Paller, Richael");
        MyClassmate.add("Saavedra, Vincent Paul");
        MyClassmate.add("Papina, Marianne Jovi");
        MyClassmate.add("Adia, Ronn");
        MyClassmate.add("Abella, Justine Nica");

     // Display all elements of the queue.
        System.out.println(MyClassmate);

    // Returns the number of elements in the queue.
        System.out.println(MyClassmate.size());

    // Shows the element at the front of the queue
       System.out.println(MyClassmate.peek());

    }
}
