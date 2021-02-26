/**
 * Class modeling vehicles
 */
public abstract class Cars {

    protected String vehicleType = "Unknown Vehicle";

    /**
     *
     * @return string representing vehicle type
     */
    public String getVehicleType() {

        return vehicleType;
    }

    /**
     *
     * @return prince of a vehicle
     */
    public abstract long price();

}
