public class Customer extends User {

    public Customer(String name, int id) {
        super(name, id);
    }

    public void useService(Service s) {
        if (s.isActive()) {
            s.performService();
        } else {
            System.out.println("Service " + s.getServiceName() + " is not available.");
        }
    }
}
