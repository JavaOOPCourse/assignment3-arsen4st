public class ConsultationService extends Service implements Billable {

    private int sessionCount;

    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.sessionCount = 1;
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println(getServiceName() + " is inactive.");
            return;
        }
        System.out.println("Providing consultation via " + getServiceName());
        sessionCount++;
    }

    @Override
    public void generateBill() {
        System.out.println("Consultation bill: $" + sessionCount * 20);
    }
}
