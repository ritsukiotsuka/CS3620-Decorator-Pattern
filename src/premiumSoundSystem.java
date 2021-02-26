public class premiumSoundSystem extends Options {

    //member variables
    Cars car;

    /**
     * Constructor
     *
     * @param car
     */
    public premiumSoundSystem(Cars car) {

        this.car = car;
    }

    @Override
    public String getVehicleType() {

        return car.getVehicleType() + ", sound";
    }

    @Override
    public long price() {

        return car.price() + 1000;
    }
}
