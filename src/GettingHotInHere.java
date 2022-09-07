import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");

        int tempF = scanner.nextInt();

        double tempC = (tempF - 32) * 5 / 9.0;

        String output = """
                Temperature: %d°F%n=%.6f°C
                
                Int: %d°C
                          
                If it were 2°C warmer it would be %d°C
                """;

        System.out.printf(output, tempF, tempC, (int) tempC, 2 + (int) tempC);
    }
}
