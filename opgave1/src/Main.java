import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Custom> customers = new ArrayList<>();
        Custom customer1 = new Custom("lisa", "jensen", "lisajensen1", 1);
        Custom customer2 = new Custom("erik", "larsen", "eriklarsen2", 2);
        Custom customer3 = new Custom("filo","jens","filojens",3);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        Custom.printCustomers(customers);
    }

}
