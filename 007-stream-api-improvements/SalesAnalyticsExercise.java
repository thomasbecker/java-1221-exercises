import java.util.List;

/**
 * Sales Analytics Exercise
 *
 * Key Features Demonstrated:
 * - Stream.toList() convenience method
 * - Collectors.teeing for parallel calculations
 * - Practical analytics scenarios
 * - Modern Stream operations
 */
public class SalesAnalyticsExercise {

    record Sale(String product, double amount, String category) {}

    static class SalesStats {
        String category;
        double averageAmount;
        double totalAmount;
        long numberOfSales;

        SalesStats(
                String category,
                double averageAmount,
                double totalAmount,
                long numberOfSales
        ) {
            this.category = category;
            this.averageAmount = averageAmount;
            this.totalAmount = totalAmount;
            this.numberOfSales = numberOfSales;
        }

        @Override
        public String toString() {
            return "Category: %s, Average: $%.2f, Total: $%.2f, Count: %d"
                    .formatted(category, averageAmount, totalAmount, numberOfSales);
        }
    }

    // TODO 1: Implement a method that filters sales by category and converts to List
    static List<Sale> getSalesByCategory(List<Sale> sales, String category) {
        return null; // Use stream and toList()
    }

    // TODO 2: Implement a method using teeing collector to calculate average and total
    // Hint: Look in the API of Collectors for methods to sum and count
    static SalesStats calculateStats(List<Sale> sales, String category) {
        return null; // Use teeing to calculate multiple statistics at once
    }

    public static void main(String[] args) {
        List<Sale> sales = List.of(
                new Sale("Laptop", 999.99, "Electronics"),
                new Sale("Headphones", 99.99, "Electronics"),
                new Sale("Book", 19.99, "Books"),
                new Sale("Coffee Maker", 79.99, "Appliances"),
                new Sale("Tablet", 299.99, "Electronics"),
                new Sale("Novel", 24.99, "Books")
        );

        // TODO 3: Test your implementations

        // TODO 4: Print statistics for each category
    }
}
