
package beersong;

public class BeerSong {

    public static void main(String[] args) {// Main that calls the function to write the lyrics
        for (int i = 99; i > 0; i--) { // Loops through the number of beers on the wall
            Ninety_Nine_Bottles_of_Beer(i);
        }
    }
    public static void Ninety_Nine_Bottles_of_Beer(int i) { //Displays the lyrics for the song
        if (i == 2) {
            System.out.print(i + " bottles of beer on the wall, " + i + " bottles of beer\ntake one down pass it around, ");
            System.out.print((i - 1) + " bottle of beer on the wall\n");
        } else if (i == 1) {
            System.out.print(i + " bottle of beer on the wall, " + i + " bottle of beer\ntake one down pass it around, "); 
            System.out.print("no more bottles of beer on the wall\n");
        } else {
            System.out.print(i + " bottles of beer on the wall, " + i + " bottles of beer\ntake one down pass it around, ");
            System.out.print((i - 1) + " bottles of beer on the wall\n");
        }
    }
}
