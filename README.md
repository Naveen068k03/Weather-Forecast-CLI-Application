# Weather-Forecast-CLI-Application
Simulate a weather forecast system that allows users to input a city and get a random weather forecast.
### Detailed Description of the Weather Forecast Program

The provided Java program simulates a simple **Weather Forecast CLI (Command Line Interface)** that allows users to input the name of a city and receive a random weather forecast. The program generates a forecast from a predefined list of weather conditions such as "Sunny", "Cloudy", "Rainy", "Snowy", and "Partly Cloudy". The program runs in an infinite loop, continuously asking for city names, and exits when the user types 'exit'. This is a fun example of random number generation and user interaction through the command line.

### Working Procedure in Detail

#### 1. **Initialization of Variables and Objects**:
   - **Scanner**: The program creates a `Scanner` object (`scanner`) to handle user input from the command line.
   - **Random**: A `Random` object (`random`) is instantiated to generate random numbers, which will be used to select a random weather forecast from the list.
   - **Weather Forecasts Array**: An array of strings (`weatherForecasts`) is declared, containing five different weather conditions: "Sunny", "Cloudy", "Rainy", "Snowy", and "Partly Cloudy". These will serve as the possible outcomes for the weather forecast.

#### 2. **Infinite Loop for Continuous User Interaction**:
   - The program enters a `while (true)` loop, which keeps the program running indefinitely until the user decides to exit. This loop is essential to allow the user to repeatedly enter different cities and receive a weather forecast without restarting the program.
   
#### 3. **Prompting for City Input**:
   - Inside the loop, the program prompts the user with the message:
     ```
     Enter a city (or type 'exit' to quit):
     ```
   - The user is expected to enter the name of a city as a string. This input is read using `scanner.nextLine()`, which captures the entire line of text, including spaces, until the user presses "Enter".
   
#### 4. **Exit Condition**:
   - After capturing the city name, the program checks if the user input is equal to "exit" (case-insensitive) using the `equalsIgnoreCase()` method. If the user enters "exit", the program will print the message:
     ```
     Exiting Weather Forecast CLI.
     ```
   - Then, the `break` statement is executed, which terminates the infinite `while` loop and exits the program gracefully.

#### 5. **Random Weather Forecast Generation**:
   - If the user has not entered "exit", the program proceeds to generate a random weather forecast. 
   - The `random.nextInt(weatherForecasts.length)` method generates a random integer between `0` (inclusive) and the length of the `weatherForecasts` array (exclusive). This integer will be used as an index to select one of the weather conditions from the array.
     - For example, if `randomIndex` is `2`, the program will select the forecast at index 2, which is "Rainy".
   - The selected weather forecast is then stored in the `forecast` variable, and the program prints the weather forecast for the specified city:
     ```
     Weather forecast for [city]: [forecast]
     ```
   - Here, `[city]` is the user input and `[forecast]` is the randomly selected weather condition.

#### 6. **Loop Repeats**:
   - After printing the weather forecast for the city, the program returns to the start of the loop, prompting the user to enter another city or type "exit" to quit. This continues until the user chooses to exit.

#### 7. **Closing the Scanner**:
   - Once the loop is terminated (i.e., when the user types "exit"), the `scanner.close()` method is called to properly close the `Scanner` object. This is important for freeing up resources associated with the scanner, especially in larger programs or when handling files and network connections.

### Summary of Key Features:
- **User Interaction**: The program asks the user for a city and gives a random weather forecast based on predefined weather conditions.
- **Random Forecast Generation**: The weather forecast is selected randomly from an array using a `Random` object.
- **Exit Option**: The program can be exited at any time by typing "exit", which gracefully terminates the program.
- **Looping Behavior**: The program continuously runs, allowing the user to query multiple cities for their weather forecasts without restarting the application.

### Example of Program Execution:

1. The program starts and displays:
   ```
   Enter a city (or type 'exit' to quit):
   ```
2. The user enters "London", and the program outputs:
   ```
   Weather forecast for London: Cloudy
   ```
3. The user enters "Paris", and the program outputs:
   ```
   Weather forecast for Paris: Sunny
   ```
4. If the user enters "exit", the program outputs:
   ```
   Exiting Weather Forecast CLI.
   ```
   And the program terminates.

### Example Interaction:
```
Enter a city (or type 'exit' to quit): London
Weather forecast for London: Partly Cloudy
Enter a city (or type 'exit' to quit): New York
Weather forecast for New York: Snowy
Enter a city (or type 'exit' to quit): exit
Exiting Weather Forecast CLI.
```

### Key Concepts Demonstrated in the Program:
1. **Random Number Generation**: The program uses the `Random` class to generate a random index for selecting a weather forecast.
2. **Control Flow with Looping**: The `while (true)` loop ensures that the program keeps asking for user input until the user opts to exit.
3. **String Manipulation**: The program checks user input (e.g., `equalsIgnoreCase("exit")`) to handle special cases like quitting the program.
4. **Basic User Interface**: The command-line interface interacts with the user to get input and display output, which is a common feature in many text-based applications.

This program is a simple example of a randomization task with user input handling, ideal for practicing basic Java concepts such as arrays, loops, random number generation, and input validation.
