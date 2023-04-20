public class Main {
    public static void main(String[] args) {

        Sedan sedanCoupe = new Sedan("Opel",100000,500000,5);

        System.out.println("Car's model " + sedanCoupe.getModel() + " km traveled " + sedanCoupe.kmTraveled()+ " price " + sedanCoupe.getprice());

        sedanCoupe.driveTheCar(5000);

        sedanCoupe.salePrice(495000);

        System.out.println("Car's model " + sedanCoupe.getModel() + " km traveled " + sedanCoupe.kmTraveled()+ " price " + sedanCoupe.getprice());


    }
}