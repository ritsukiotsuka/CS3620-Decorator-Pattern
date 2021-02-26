public class NavigationSystem extends Options {

    //member variables
    Cars car;

    /**
     * Constructor
     *
     * @param car
     */
    public NavigationSystem(Cars car) {

        this.car = car;
    }

    @Override
    public String getVehicleType() {

        return car.getVehicleType() + ", navigation";
    }

    @Override
    public long price() {

        return car.price() + 1800;
    }
}
