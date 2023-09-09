public class Main {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        double result = 0.0;

        for (int j = 1; j <= 4; j++) {
            double term = Math.pow(-1, j + 1) * (1.0 / (j * Math.pow(2, j)));
            stack.push(term);
            result += term;
        }

        System.out.println("Valores almacenados en la pila:");
        while (!stack.isEmpty()) {
            double term = stack.pop();
            System.out.println(term);
        }

        System.out.println("Resultado final de la expresión matemática: " + result);
    }
}
