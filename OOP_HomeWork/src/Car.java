public class Car {

    public String bodyType;
    public String model;
    public int kmTraveled;

    public int price;
    public int doors;

    public Car(String bodyType, String model, int kmTraveled, int price, int doors) {
        this.bodyType = bodyType;
        this.model = model;
        this.kmTraveled = kmTraveled;
        this.price = price;
        this.doors = doors;
    }

    public String getbodyType() {
        return bodyType;
    }

    public String getModel() {
        return model;
    }

    public int kmTraveled() {
        return kmTraveled;
    }

    public int getprice() {
        return price;
    }

    public int getdoors() {
        return doors;
    }


    public void driveTheCar(int kmDriven){
        this.kmTraveled+=kmDriven;
        System.out.println("Car's km: " + this.kmTraveled);
    }

    public int salePrice(int newSalePrice){
        return this.price=newSalePrice;
    }
}
