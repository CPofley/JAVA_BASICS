package OppsBasic_17072025;

public class Bike {
    private String bikeName;
    private String bikeBrand;
    private int engineNumber;

    @Override
    public String toString() {
        return "Bike{" +
                "bikeName='" + bikeName + '\'' +
                ", bikeBrand='" + bikeBrand + '\'' +
                ", engineNumber=" + engineNumber +
                ", engineCapacity=" + engineCapacity +
                ", car=" + car +
                '}';
    }

    public String getBikeBrand() {
        return bikeBrand;
    }

    public void setBikeBrand(String bikeBrand) {
        this.bikeBrand = bikeBrand;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private float engineCapacity;
    private Car car;

}
