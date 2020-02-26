public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Intesa");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Jovana", 120.25);
        bank.addCustomer("Adelaide", "Milica", 146.30);
        bank.addCustomer("Adelaide", "Kalina", 96.10);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Marija", 42.69);

        bank.addCustomerTransaction("Adelaide", "Jovana", 50);
        bank.addCustomerTransaction("Adelaide", "Jovana", 55);
        bank.addCustomerTransaction("Adelaide", "Jovana", 63);
        bank.addCustomerTransaction("Adelaide", "Milica", 25.56);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);
    }
}
