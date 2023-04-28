public class Car implements Movable {
    private int speed;
    private String Name;
    
    public Car() {
    speed = 0;
    Name = "Car";
    }
    
    @Override
    public String getName() {
    return Name;
    
    }
    
    @Override
    public void moveUp() {
    speed += 10;


    }

    @Override
    public void moveDown() {
    speed -= 10;
    
    
    }
    
    public int getSpeed() {
    return speed;
    
    }
    
    }