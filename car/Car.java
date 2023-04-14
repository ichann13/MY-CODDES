public class Car extends Vehicle {
    private String Color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        
        this.Color = color;

    }

    public String getColor() {
        return Color;

    }
}
