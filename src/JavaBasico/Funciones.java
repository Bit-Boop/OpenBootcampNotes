package JavaBasico;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();
        holaNombre("Juan");
        String hola = devolverHola();
        System.out.println(hola);

    }

    private static void holaMundo() {
        System.out.println("Hola mundo");
    }

    private static void holaNombre(String name) {
        System.out.println("Hola " + name);
        System.out.println("Como estas ?");
    }

    private static String devolverHola(){
        return "Hola";
    }
}
