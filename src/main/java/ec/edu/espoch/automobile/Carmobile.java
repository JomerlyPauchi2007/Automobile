package ec.edu.espoch.automobile;

public class Carmobile {

    private String brand;
    private int model;
    private double engine;
    private FuelType fuelType;
    private CarType carType;
    private int numberOfDoors;
    private int numberOfSeats;
    private double maximumSpeed;
    private Color color;
    private double currentSpeed;

    // CORREGIDO: Se quitó el parámetro 'double currentSpeed' del final para que reciba 9 argumentos
    public Carmobile(String brand, int model, double engine, FuelType fuelType, CarType carType, int numberOfDoors, int numberOfSeats, double maximumSpeed, Color color) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuelType = fuelType;
        this.carType = carType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.currentSpeed = 0; // Inicializa automáticamente en cero
    }

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    // AGREGADO: Este método faltaba y por eso daba error en el main
    public void setCurrentSpeed(double speed) {
        if (speed >= 0 && speed <= this.maximumSpeed) {
            this.currentSpeed = speed;
        } else {
            System.out.println("Error: Velocidad fuera de los límites permitidos.");
        }
    }

    public void accelerate(double speed) {
        if (this.currentSpeed + speed <= this.maximumSpeed) {
            this.currentSpeed += speed;
        } else {
            this.currentSpeed = this.maximumSpeed;
            System.out.println("¡Alcanzaste la velocidad máxima permitida!");
        }
    }

    public void decelerate(double speed) {
        if (this.currentSpeed - speed >= 0) {
            this.currentSpeed -= speed;
        } else {
            this.currentSpeed = 0;
            System.out.println("El vehículo ya se ha detenido.");
        }
    }

    public void brake() {
        this.currentSpeed = 0;
    }

    public double calculateArrivalTime(double distance) {
        if (this.currentSpeed == 0) {
            System.out.println("El vehículo está detenido.");
            return -1;
        }
        return distance / this.currentSpeed;
    }

    public void displayAttributes() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Motor: " + engine);
        System.out.println("Tipo de Combustible: " + fuelType);
        System.out.println("Tipo de Auto: " + carType);
        System.out.println("Numero de Puertas: " + numberOfDoors);
        System.out.println("Numero de Asientos: " + numberOfSeats);
        System.out.println("Velocidad Maxima: " + maximumSpeed);
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + currentSpeed);
    }
}
