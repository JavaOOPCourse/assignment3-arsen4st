public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }

    public void manageService(Service s) {
        if (!s.isActive()) {
            s.activateService();
        } else {
            s.deactivateService();
        }
        System.out.println(name + " managed " + s.getServiceName());
    }
}
