package JavaBasico;

public class ForWhileLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "# Hola mundo desde un for");
        }
        System.out.println("Fin for");

        boolean check = true;
        int count = 0;

        while (count < 10){
            count++; // condicion
            if (count == 6)
                break; // rompe el flujo de ejecucion
                //continue; // salta el valor 6 y continua a la siguiente iteracion

            System.out.println(count + "# Hola mundo desde un while");

        }
        System.out.println("Fin while");

    }
}
