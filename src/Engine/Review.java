package Engine;

import java.io.File; //the import used to access exterior files
import java.io.FileWriter; //the import for the file writer
import java.io.IOException; //the import for the IOException
import java.io.PrintWriter; //the import for the print writer class
import java.util.Scanner; //the import used to access the scanner function

/**
 * This file is for when a user wants to leave a review on a book.
 *
 * @author 073685950 (Alex Weber)
 */
public class Review {

    File f = new File("bookinfo.txt"); //create a new file linked to bookinfo
    Scanner input = new Scanner(f); //create a new scanner
    PrintWriter pw = new PrintWriter(new FileWriter(f, true)); //create a new print writer
    Book book = new Book(); //making a book so all the variables can be used

    /**
     * This is the constructor for the Review class.
     *
     * @throws IOException this is thrown because the program needs to check
     * that the file exists
     */
    public Review() throws IOException {
    }

    /**
     * This method is initiated by the user, this will allow them to add a
     * comment or rating to a book.
     *
     * @param book the book that the review is going to be made on
     */
    public void addReview(Book book) {
        //on the BookIntoScreen, the user will have the option to leave a review
        //the user to can choose if they want to leave a rating (using a slider)
        //or leave a comment (using a text boxt)
        //Psudocode_________________________________________________________________________________
        //if user populates the text box when the window is changed, the addComment() method is called
        //if the user user uses the slider, when the window changes,
        //the computer will take in the value of the slider and call the addRating() method
        //link the netbeans file and an exterior file
    }

    /**
     * This method allows the user to add a comment to a book. It is initiated
     * by a button.
     *
     * @return the text that the user enters
     */
    private void addComment(String saveText) {
        //from the GUI, connect to a text box and just save the text as an String
        //textboxText = saveText;
        storeComment(saveText); //stores the comment back into the file
    }

    /**
     * This method allows the user to add a rating to a book. It is initiated by
     * a button.
     *
     * @return the rating the user enters
     */
    private void addRating(int saveRating) {
        //from the GUI, connect to a slider and use that variable as the rating variable
        //slider = saveRating;
        storeRating(saveRating); //stores the rating
        book.numRatings++; //adds one to the counter
    }

    /**
     * This is the method used to store the users comment under the books name
     * and bar code.
     *
     * @param comment the text to be saved
     */
    private void storeComment(String comment) {
        book.comments += comment; //adds the most recent comment to all the other files
    }

    /**
     * This is the method used to store the users rating under the books name
     * and bar code.
     *
     * @param rating the rating to be saved
     */
    private void storeRating(int rating) {
        book.addedRatings += rating; //adds the most recent rating to all the ratings
    }

    /**
     * This method updates the rating of a book by re-calculating the average.
     *
     * @return the rating of the book
     */
    private double calculateBookRating() {
        double averageRating = book.addedRatings / book.numRatings; //calculates the average
        return averageRating; //returns the calculated average
    }

    /**
     * This method gets the value for the addedRatings of the book.
     *
     * @return the value of addedRatings
     */
    public int getAddedRatings() {
        return book.addedRatings; //returns all the ratings added together
    }

    /**
     * This method gets the number of ratings made on the book.
     *
     * @return the number of ratings made
     */
    public int getNumberRatings() {
        return book.numRatings; //returns the number of ratings made
    }

    /**
     * This method gets the comments for the book.
     *
     * @return the comments made on the book
     */
    public String getComments() {
        return book.comments; //returns all the comments
    }

    /**
     * This main method is purely for testing purposes.
     *
     * @param args
     */
    public static void main(String[] args) {
    }
}
