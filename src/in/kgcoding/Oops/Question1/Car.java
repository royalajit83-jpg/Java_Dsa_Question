package in.kgcoding.Oops.Question1;

public class Car {
    public int make ;
    public int model;
    public int year;

    public Car(int make, int model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startCar(){
        System.out.println("car started....");
    }

    public void StopCar(){
        System.out.println("car stoped...");
    }

}
