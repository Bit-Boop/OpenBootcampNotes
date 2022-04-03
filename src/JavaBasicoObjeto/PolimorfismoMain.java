package JavaBasicoObjeto;

public class PolimorfismoMain {
    public static void main(String[] args) {

        Car auto1 = new Car();
        ElectricCar auto2 = new ElectricCar();
        HybridCar auto3 = new HybridCar();

        // polimorfismo

        Car auto4 = new ElectricCar();

        Car auto5 = new HybridCar();

        if (auto4 instanceof Car)
            System.out.println("auto");

        if (auto4 instanceof ElectricCar)
            System.out.println("auto electrico");

        if (auto4 instanceof HybridCar)
            System.out.println("auto hibrido");
    }
}
