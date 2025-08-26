package spring.Demo.model;

public class Address {

    private int doorNo;
    private String streeName;
    private String city;

    public Address(int doorNo, String streeName, String city) {
        this.doorNo = doorNo;
        this.streeName = streeName;
        this.city = city;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreeName() {
        return streeName;
    }

    public void setStreeName(String streeName) {
        this.streeName = streeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo=" + doorNo +
                ", streeName='" + streeName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
