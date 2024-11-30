/**
 * Expression Language Parser Exercise
 *
 * Key Features Demonstrated:
 * - Nested sealed hierarchies
 * - Pattern matching for expression evaluation
 * - Sealed interfaces with records
 * - Complex type hierarchies
 * - Exhaustiveness checking in evaluator
 *
 * Task: Implement a simple expression language parser and evaluator
 * that supports basic arithmetic operations and variables.
 */
public class ExpressionLanguageExercise {
    // TODO 1: Create a sealed interface 'Expression' that permits different types:
    // - NumberExpr (record with double value)
    // - VariableExpr (record with String name)
    // - BinaryExpr (sealed interface for operations)

    // TODO 2: Create sealed interface 'BinaryExpr' that permits:
    // - AddExpr, SubtractExpr, MultiplyExpr, DivideExpr
    // Each should have left and right Expression operands

    // TODO 3: Create an Environment class to store variable values

    // TODO 4: Implement an ExpressionEvaluator that uses pattern matching
    // to evaluate expressions

    // TODO 5: Implement a simple parser that creates expression trees
    // from string input (optional but recommended)

    public static void main(String[] args) {
        // TODO 6: Create sample expressions using the hierarchy

        // TODO 7: Demonstrate evaluation with different expressions

        // TODO 8: Show how pattern matching ensures all cases are handled

        // TODO 9: Demonstrate variable resolution in expressions
    }
}
