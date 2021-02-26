public class MoonRoof extends Options {

    //member variables
    Cars car;

    /**
     * Constructor
     *
     * @param car
     */
    public MoonRoof(Cars car) {

        this.car = car;
    }

    @Override
    public String getVehicleType() {

        return car.getVehicleType() + ", roof";
    }

    @Override
    public long price() {

        return car.price() + 1500;
    }
}
