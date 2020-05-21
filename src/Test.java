import java.util.Map;

class Test {
    public static void main(String[] args) {
        Customer marek = new Customer("111", "Marek", "Kowalski", "500 500 500");
        Customer kasia = new Customer("123", "Katarzyna", "Markowska", "600 200 343");
        Customer piotrek = new Customer("284", "Piotr", "Kot", "744 111 218");

        Map<String, Customer> customers = Map.ofEntries(
                Map.entry(marek.getId(), marek),
                Map.entry(kasia.getId(), kasia),
                Map.entry(piotrek.getId(), piotrek)
        );

        Service.printKeys(customers);
        Service.printValues(customers);

        String id = Service.getIdFromUser();
        try {
            Service.printInfoAboutCustomer(customers, id);
        } catch (NoCustomerFoundException e) {
            System.err.println(e.getMessage());
        }
    }


}