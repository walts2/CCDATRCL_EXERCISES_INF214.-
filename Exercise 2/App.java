import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Heroes");
        Playlist.add("Let's Dance");
        Playlist.add("There is a light that never goes out");
        Playlist.add("Are you bored yet?");
        Playlist.add("Cigarette Daydreams");
        Playlist.add("Mr. Brightside");


        // Adds a new song at the front of the Playlist
        Playlist.addFirst("The Middle");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("Cornerstone");

        // Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(3, "Mardy Bum");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}
