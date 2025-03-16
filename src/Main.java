import java.util.*;

public class ConsoleCalculator {
    private static final List<String> history = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Console Calculator!");

        while (true) {
            System.out.print("Enter an operation (or 'history' to view past calculations, 'exit' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            } else if (input.equalsIgnoreCase("history")) {
                showHistory();
                continue;
            }

            try {
                double result = evaluateExpression(input);
                System.out.println("Result: " + result);
                history.add(input + " = " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static double evaluateExpression(String input) throws Exception {
        String[] tokens = input.split(" ");
        if (tokens.length < 2) throw new Exception("Invalid input format.");

        String operator = tokens[0];

        switch (operator) {
            case "+": return Double.parseDouble(tokens[1]) + Double.parseDouble(tokens[2]);
            case "-": return Double.parseDouble(tokens[1]) - Double.parseDouble(tokens[2]);
            case "*": return Double.parseDouble(tokens[1]) * Double.parseDouble(tokens[2]);
            case "/":
                double divisor = Double.parseDouble(tokens[2]);
                if (divisor == 0) throw new Exception("Cannot divide by zero.");
                return Double.parseDouble(tokens[1]) / divisor;
            case "%": return Double.parseDouble(tokens[1]) % Double.parseDouble(tokens[2]);
            case "power": return Math.pow(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
            case "sqrt": return Math.sqrt(Double.parseDouble(tokens[1]));
            case "abs": return Math.abs(Double.parseDouble(tokens[1]));
            case "round": return Math.round(Double.parseDouble(tokens[1]));
            default: throw new Exception("Unknown operation.");
        }
    }

    private static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No calculations yet.");
        } else {
            System.out.println("Calculation History:");
            for (String record : history) {
                System.out.println(record);
            }
        }
    }
}
