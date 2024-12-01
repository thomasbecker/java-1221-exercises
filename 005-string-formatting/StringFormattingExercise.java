
/**
 * String Formatting Evolution Exercise
 *
 * Key Features Demonstrated:
 * - Traditional String.format()
 * - Modern .formatted() method
 * - String templates with STR
 * - Expression evaluation in templates
 * - Format specifiers vs template expressions
 *
 * Task: Complete the methods to explore different string formatting approaches
 * Note: String templates are a preview feature in Java 21 and preview features have to be enabled
 * (https://www.baeldung.com/java-preview-features)
 */
public class StringFormattingExercise {

    record Person(String name, int age, double salary) {}

    /**
     * TODO 1: Implement three versions of the same formatting:
     * - Using String.format()
     * - Using .formatted()
     * - Using string template (STR)
     */
    static class PersonFormatter {
        // Should return: "Person: NAME (AGE) - $SALARY"
        String formatTraditional(Person person) {
            // TODO: Implement using String.format()
            return null;
        }

        String formatModern(Person person) {
            // TODO: Implement using .formatted()
            return null;
        }

        String formatTemplate(Person person) {
            // TODO: Implement using STR template
            return null;
        }
    }

    /**
     * TODO 2: Implement a method that demonstrates expression
     * evaluation in string templates
     */
    static String getExpressionTemplate(Person person) {
        // TODO: Return template with salary calculation and uppercase name
        // Example: "JOHN earns $60,000.00 annually (monthly: $5,000.00)"
        return null;
    }

    /**
     * TODO 3: Create a multi-line formatted output using all three approaches
     */
    static class MultiLineFormatter {
        // TODO: Implement three versions of multi-line formatting
        // Should show person details in a structured format
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, 60000.0);
        PersonFormatter formatter = new PersonFormatter();

        // TODO 4: Test and compare all formatting approaches

        // TODO 5: Demonstrate expression template with calculations

        // TODO 6: Show multi-line formatting comparison
    }
}
