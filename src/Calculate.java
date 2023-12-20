public class Calculate {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            minus(x, y);
        } else if (args[0].equals("multiplicar")) {
            multiply(x, y);
        } else if (args[0].equals("dividir")) {
            division(x, y);
        } else {
            System.out.println("Operacao invalida. Use somar ou subtrair");
        }
    }

    static void sum(int x, int y) {
        System.out.println("Soma: " + (x + y));
    }

    static void minus(int x, int y) {
        System.out.println("Subtracao: " + (x - y));
    }

    static void multiply(int x, int y) {
        System.out.println("Multiplicacao: " + (x * y));
    }

    static void division(int x, int y) {
        System.out.println("Divisao: " + (x / y));
    }

}
