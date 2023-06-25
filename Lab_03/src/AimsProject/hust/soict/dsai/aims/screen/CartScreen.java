package Lab_03.src.AimsProject.hust.soict.dsai.aims.screen;

import java.io.IOException;
import java.util.ArrayList;

import javax.naming.LimitExceededException;
import javax.swing.JFrame;

import Lab_03.src.AimsProject.hust.soict.dsai.aims.cart.Cart;
import Lab_03.src.AimsProject.hust.soict.dsai.aims.media.Book;
import Lab_03.src.AimsProject.hust.soict.dsai.aims.media.DigitalVideoDisc;
import Lab_03.src.AimsProject.hust.soict.dsai.aims.screen.CartScreenController;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.embed.swing.JFXPanel;

public class CartScreen extends JFrame{
    private Cart cart;

    public CartScreen(Cart cart){
        super();
        this.cart = cart;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Cart");
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run(){
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/fxml/cart.fxml"));
                    CartScreenController controller = new CartScreenController(cart);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args) throws LimitExceededException {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Category 1", 120, "Director 1");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Category 2", 90, "Director 2");

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        int bookId = 3;
        String bookTitle = "Book 1";
        String bookCategory = "Category 3";
        float bookCost = 12.99f;
        ArrayList<String> bookAuthors = new ArrayList<>();
        bookAuthors.add("Author 1");
        bookAuthors.add("Author 2");
        Book book = new Book(bookTitle, bookCategory, bookCost);

        cart.addMedia(book);

        new CartScreen(cart);
    }
}