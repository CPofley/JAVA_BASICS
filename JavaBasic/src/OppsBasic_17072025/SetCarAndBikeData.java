package OppsBasic_17072025;

public class SetCarAndBikeData {
    public void setData(Car car,Bike bike){

       car.setCarName("Nano");
        car.setCarBrand("Tata");
        car.setEngineNumber(123);
        car.setEngineCapacity(123.4f);

        bike.setBikeName("Apache");
        bike.setBikeBrand("TVS");
        bike.setEngineNumber(765);
        bike.setEngineCapacity(765.4f);

        car.setBike(bike);
    }
    public void setData(Bike bike,Car car ){


        bike.setBikeName("Apache");
        bike.setBikeBrand("TVS");
        bike.setEngineNumber(765);
        bike.setEngineCapacity(765.4f);
    }


}
