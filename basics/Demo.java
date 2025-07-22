abstract class Car {
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play Music");
    }
}


 class UpdateWagonR extends WagonR {
    public void fly() {
        System.out.println("WagonR cannot fly");
    }
}
abstract class WagonR extends Car {
    public void drive() {
        System.out.println("Driving WagonR");
    }

}

public class Demo {
    public static void main(String[] args) {
        Car car = new UpdateWagonR();
        car.drive();
        car.playMusic();
        car.fly();
    }
}