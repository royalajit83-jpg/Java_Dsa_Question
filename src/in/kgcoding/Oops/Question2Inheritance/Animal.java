package in.kgcoding.Oops.Question2Inheritance;

public class Animal {
    public String name;
    public String souund;

    public Animal(String name, String souund) {
        this.name = name;
        this.souund = souund;
    }

    public void Display(){
        System.out.println(name+"say"+souund);
    }
}
