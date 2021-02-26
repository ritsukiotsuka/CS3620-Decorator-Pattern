public class Sedan extends Cars {

    /**
     * Constructor
     */
    public Sedan() {

        vehicleType = "sedan";

    }

    @Override
    public long price() {

        return 20000;
    }
}
