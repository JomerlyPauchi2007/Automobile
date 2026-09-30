package ec.edu.espoch.automobile;

public class Automobile {

    public static void main(String[] args) {
        Carmobile myCar = new Carmobile("Toyota", 2026, 2.0, FuelType.GASOLINE, CarType.COMPACT, 4, 5, 180.0, Color.RED);

        myCar.displayAttributes();
        myCar.setCurrentSpeed(100);
        System.out.println("Velocidad inicial fijada a: " + myCar.getCurrentSpeed() + " km/h");

        myCar.accelerate(20);
        System.out.println("Luego de acelerar 20 km/h: " + myCar.getCurrentSpeed() + " km/h");

        myCar.decelerate(50);
        System.out.println("Luego de desacelerar 50 km/h: " + myCar.getCurrentSpeed() + " km/h");

        myCar.brake();
        System.out.println("Luego de frenar por completo: " + myCar.getCurrentSpeed() + " km/h");
    }
}
