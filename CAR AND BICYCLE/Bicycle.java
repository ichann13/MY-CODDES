public class Bicycle implements Movable {
    private int speed;
    private String Name;
    
    public Bicycle() {
    speed = 0;
    Name = "Bicycle";
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