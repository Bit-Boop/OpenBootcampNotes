package JavaBasicoObjeto;

public class CarMain {
    public static void main(String[] args) {

        Car carObj1 = new HybridCar();

        Car carObj2 = new ElectricCar("rojo", "honda", "civic", 1500.10, 5.4, 0, "motor electrico");

        carObj2.acelerar(50);

        System.out.println(carObj2);

        carObj2.peso = 1347.20;

        System.out.println(carObj2);

        ElectricCar electricCar = new ElectricCar();

        electricCar.motorElectrico = "Ejemplo de motor";
        electricCar.color = "verde";
        electricCar.fabricante = "Honda";
        electricCar.modelo = "Civic";

        System.out.println(electricCar);

        HybridCar hybridCar = new HybridCar("Ejemplo de motro");
        hybridCar.color = "verde";
        hybridCar.fabricante = "Honda";
        hybridCar.modelo = "Civic";

        System.out.println(hybridCar);

        ElectricCar electricCar1 = new ElectricCar("azul", "fiat", "600", 1000d, 3.4d, 100, "Ejemplo motor");

        System.out.println(electricCar1);



    }
}
