public class AlloyWheels extends Options {

    //member variables
    Cars car;

    /**
     * Constructor
     *
     * @param car
     */
    public AlloyWheels(Cars car) {

        this.car = car;
    }

    @Override
    public String getVehicleType() {

        return car.getVehicleType() + ", wheels";
    }

    @Override
    public long price() {

        return car.price() + 2000;
    }
}
