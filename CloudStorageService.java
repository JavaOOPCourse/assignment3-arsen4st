public class CloudStorageService extends Service implements PremiumFeature, Billable {

    private boolean isPremium;
    private int usage;

    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
        this.usage = 100;
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println(getServiceName() + " is inactive.");
            return;
        }
        System.out.println("Storing files in " + getServiceName());
        usage += 50;
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println(getServiceName() + " upgraded to premium.");
    }

    @Override
    public void generateBill() {
        System.out.println("Bill for " + getServiceName() + ": $" + usage * 0.1);
    }
}
