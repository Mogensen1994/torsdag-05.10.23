import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();
        ArrayList<String> coffeeMenu = cafe.getCoffeeMenu();
        for (String coffee : coffeeMenu) {
            System.out.println(coffee);
        }
    }
}



