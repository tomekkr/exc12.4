import java.util.Map;
import java.util.Scanner;

class Service {
    public static String getIdFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID klienta:");
        return scanner.nextLine();
    }

    public static void printValues(Map<String, Customer> customers) {
        System.out.println("Wartości: " + customers.values());
    }

    public static void printKeys(Map<String, Customer> customers) {
        System.out.println("Klucze: " + customers.keySet());
    }

    public static void printInfoAboutCustomer(Map<String, Customer> customers, String id) {
        if (!customers.containsKey(id)) {
            throw new NoCustomerFoundException("Nie znaleziono klienta o numerze ID: " + id);
        }
        System.out.println(customers.get(id));
    }
}
