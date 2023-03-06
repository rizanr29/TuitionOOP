public class HeadMaster {
    private String name;
    private String IC;
    private String address;

    public HeadMaster(String name, String IC, String address) {
        this.name = name;
        this.IC = IC;
        this.address = address;
    }

    public String getMasterName() {
        return name;
    }

    public String getMasterIC() {
        return IC;
    }

    public String getMasterAddress() {
        return address;
    }
}