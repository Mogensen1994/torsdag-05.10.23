import java.util.ArrayList;

public class Custom {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Custom(String firstName, String lastName, String userName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Customer Details:\n" +
                "ID: " + id + "\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Username: " + userName;
    }

    public static void printCustomers(ArrayList<Custom> customers) {
        for (Custom customer : customers) {
            System.out.println(customer.toString());
            System.out.println();
        }
    }
}
