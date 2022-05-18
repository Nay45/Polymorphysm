package AbstractClassInterfacePolymorphism.Latihan1;

public class Vechicle2 extends Vehicle {

    public void walk(){
        System.out.println("Flying");
    }

    public static void main(String[] args) {
        Vechicle2 masuk = new Vechicle2();
        masuk.function();
        masuk.fuel();
        masuk.walk();
    }
}
