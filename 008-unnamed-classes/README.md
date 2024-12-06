# Modern Java Launch Points Exercise

## Key Features Demonstrated

- Unnamed classes
- Instance main methods
- Different parameter variations
- Modern program structure

Create three different program entry points using modern Java features.
Follow the TODOs to implement each version.

**Hint:** This is a preview feature in Java 21

### Tasks

1. Create a simple unnamed class with instance main

   - Save as `SimpleGreeting.java`
   - desired output:

   ```sh
   ❯ java --enable-preview PersonalizedGreeting
   Welcome to modern Java!
   Current time: 13:42:34.621417
   ```

1. Create an unnamed class with parameterized main

   - Save as `PersonalizedGreeting.java`

   ```sh
   ❯ java --enable-preview PersonalizedGreeting Johnny
   Hello, Johnny!
   This is a modern Java program with:
   - Unnamed class
   - Instance main
   - Command-line arguments
   ```

1. Create an unnamed class demonstrating both static and instance methods

   - Save as `CalculatorDemo.java`
   - add instance methods for addition and subtraction
   - add static methods square(int number), isPrime(int number) and max(int number)
   - count operations in a field belonging to the instance
