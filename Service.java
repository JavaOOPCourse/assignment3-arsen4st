public abstract class Service {
    private String serviceName;
    private int serviceId;
    protected boolean isActive;

    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false;
    }

    public void activateService() {
        isActive = true;
        System.out.println(serviceName + " activated.");
    }

    public void deactivateService() {
        isActive = false;
        System.out.println(serviceName + " deactivated.");
    }

    public String getServiceName() {
        return serviceName;
    }

    public boolean isActive() {
        return isActive;
    }

    public abstract void performService();
}
