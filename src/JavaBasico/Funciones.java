package JavaBasico;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();
        holaNombre("Juan");
        String hola = devolverHola();
    }

    private static void holaMundo() {
        System.out.println("Hola mundo");
    }

    private static void holaNombre(String name) {
        System.out.println("Hola " + name);
    }

    private static String devolverHola(){
        return "Hola";
    }

    public static void holaPublic(String name) {
        System.out.println("Hola " + name + " desde un metodo public");
    }

    protected static int sum(int num1, int num2){
        return num1 + num2;
    }
}
