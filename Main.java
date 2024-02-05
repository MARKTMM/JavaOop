public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.model);

        Vehicle vehicle1 = new Vehicle("Tesla", "Blue", "2016");
        System.out.println(vehicle1.model);
    }
}
