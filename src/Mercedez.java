public class Mercedez extends Vehicle{ // inheritance
    private String name;
    private int speed;
    private float fuelCapacity;

    public Mercedez(int modelNo, String Category, String name, int speed, float fuelCapacity){
        super(modelNo, Category);
        this.name = name;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void display(){ // method overriding(runtime polymorphism)
        super.display();
        System.out.println(name+" "+speed+" "+fuelCapacity);
    }
}
