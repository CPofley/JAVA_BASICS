package OppsBasic_17072025;

public class GetCarAndBikeData {

    public static void main(String[] args) {

        SetCarAndBikeData obj = new SetCarAndBikeData();
        Bike bike = new Bike();
        Car car = new Car();

        obj.setData(car,bike);
        System.out.println(car.toString());
        obj.setData(bike,car);

        System.out.println(bike.getBikeBrand());
        System.out.println(bike.getBikeName());
        System.out.println(bike.getEngineCapacity());
        System.out.println(bike.getEngineNumber());
        System.out.println(bike.getCar());
    }
}
