package JavaBasico;

public class Condicionales {
    public static void main(String[] args) {
        boolean check = 5 < 10;

        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000;

        if (number1 < number2 && number2 < number3){
            System.out.println("verdadero");
        }else if (number3 < number4){
            System.out.println("elseIf");
        }

        String weather = "sunny";

        switch (weather){
            case "sunny":
                System.out.println("El tiempo es soleado");
                break;

            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;

            default:
                System.out.println("No se ha podido encontrar este clima");
                break;
        }

    }
}
