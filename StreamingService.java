public class StreamingService extends Service implements PremiumFeature {

    private boolean isPremium;

    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println(getServiceName() + " is inactive.");
            return;
        }
        System.out.println("Streaming content from " + getServiceName());
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println(getServiceName() + " upgraded to premium.");
    }
}
