import java.util.Random;
import java.util.Scanner;

public class java_project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] weatherForecasts = { "Sunny", "Cloudy", "Rainy", "Snowy", "Partly Cloudy" };

        while (true) {
            System.out.print("Enter a city (or type 'exit' to quit): ");
            String city = scanner.nextLine();

            // Check if the user wants to exit
            if (city.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Weather Forecast CLI.");
                break;
            }

            // Generate a random weather forecast
            int randomIndex = random.nextInt(weatherForecasts.length);
            String forecast = weatherForecasts[randomIndex];

            System.out.println("Weather forecast for " + city + ": " + forecast);
        }

        scanner.close(); // Close the scanner
    }
}
