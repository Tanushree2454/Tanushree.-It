package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
       // Engine car = new Car();
       // car.a;
       
        car.acc();
        car.brake();
        car.start();
        car.stop();

        Media carMedia = new Car();
        carMedia.stop();

        NiceCar car1 = new NiceCar();
        car1.start();
        car1.startMusic();
        car1.upgradeEngine();
        car1.start();
    }
    
}
