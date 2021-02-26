/**
 * Test Class
 */
public class TestClass {

    public static void main(String [] args) {

        //bare sedan (no options)
        System.out.println("==========================================================");
        System.out.println("Vehicle No.1\n");

        Cars vehicle1 = new Sedan();
        System.out.printf("%-20s%s", "vehicle type: ", vehicle1.getVehicleType());
        System.out.printf("\n%-20s%d", "final price: ", vehicle1.price());



        //sedan with moon roof
        System.out.println("\n\n==========================================================");
        System.out.println("Vehicle No.2\n");

        Cars vehicle2 = new Sedan();
        vehicle2 = new MoonRoof(vehicle2);
        System.out.printf("%-20s%s", "vehicle type: ", vehicle2.getVehicleType());
        System.out.printf("\n%-20s%d", "final price: ", vehicle2.price());



        //sports car with sound, wheels and navigation
        System.out.println("\n\n==========================================================");
        System.out.println("Vehicle No.3\n");

        Cars vehicle3 = new SportsCar();
        vehicle3 = new premiumSoundSystem(vehicle3);
        vehicle3 = new AlloyWheels(vehicle3);
        vehicle3 = new NavigationSystem(vehicle3);
        System.out.printf("%-20s%s", "vehicle type: ", vehicle3.getVehicleType());
        System.out.printf("\n%-20s%d", "final price: ", vehicle3.price());



        //SUV with wheels and moon roof
        System.out.println("\n\n==========================================================");
        System.out.println("Vehicle No.4\n");

        Cars vehicle4 = new SUV();
        vehicle4 = new AlloyWheels(vehicle4);
        vehicle4 = new MoonRoof(vehicle4);
        System.out.printf("%-20s%s", "vehicle type: ", vehicle4.getVehicleType());
        System.out.printf("\n%-20s%d", "final price: ", vehicle4.price());



        //SUV loaded
        System.out.println("\n\n==========================================================");
        System.out.println("Vehicle No.5\n");

        Cars vehicle5 = new SUV();
        vehicle5 = new premiumSoundSystem(vehicle5);
        vehicle5 = new AlloyWheels(vehicle5);
        vehicle5 = new MoonRoof(vehicle5);
        vehicle5 = new NavigationSystem(vehicle5);
        System.out.printf("%-20s%s", "vehicle type: ", vehicle5.getVehicleType());
        System.out.printf("\n%-20s%d", "final price: ", vehicle5.price());

    }
}
