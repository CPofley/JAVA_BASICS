package OppsBasic_17072025;

public class Car {
    public String carName;
    public String carBrand;

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", engineNumber=" + engineNumber +
                ", engineCapacity=" + engineCapacity +
                ", bike=" + bike +
                '}';
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setEngineNumber(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public int engineNumber;
    public float engineCapacity;
    public Bike bike;

}
