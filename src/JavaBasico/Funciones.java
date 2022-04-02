package JavaBasico;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();
        holaNombre("Juan", 18);
        String hola = devolverHola();
        System.out.println(hola);

    }

    private static void holaMundo() {
        System.out.println("Hola mundo");
    }

    private static void holaNombre(String name, int edad) {
        System.out.println("Hola " + name);
        System.out.println("Tu edad es " + edad);
    }

    private static String devolverHola(){
        return "Hola";
    }
}
