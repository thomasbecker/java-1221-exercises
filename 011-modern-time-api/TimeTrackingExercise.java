import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * Modern Time API Exercise
 *
 * Key Features Demonstrated:
 * - Duration operations
 * - Time truncation
 * - Period calculations
 * - Modern formatting
 */
public class TimeTrackingExercise {

    record TimeEntry(String activity, LocalDateTime start, Duration duration) {
        @Override
        public String toString() {
            return "%s: %s for %s".formatted(
                    start.truncatedTo(ChronoUnit.MINUTES),
                    activity,
                    formatDuration(duration)
            );
        }

        private String formatDuration(Duration duration) {
            if (duration.toHours() > 0) {
                return "%dh %dm".formatted(
                        duration.toHours(),
                        duration.toMinutesPart()
                );
            }
            return "%dm".formatted(duration.toMinutes());
        }
    }

    static class ActivityTracker {
        // TODO 1: Create method to round duration to nearest quarter hour
        public Duration roundToQuarterHour(Duration duration) {
            return null; // Implement this
        }

        // TODO 2: Create method to format duration in a human-readable way
        public String formatDuration(Duration duration) {
            return null; // Implement this
        }

        // TODO 3: Calculate total duration for multiple time entries
        // Hint: Use Duration::plus
        public Duration calculateTotal(List<TimeEntry> entries) {
            return null; // Implement this
        }

        // TODO 4: Find gaps between consecutive time entries
        public List<Duration> findGaps(List<TimeEntry> entries) {
            return null; // Implement this
        }
    }

    public static void main(String[] args) {
        ActivityTracker tracker = new ActivityTracker();

        // TODO 5: Create sample time entries

        // TODO 6: Demonstrate duration rounding

        // TODO 7: Show gap analysis

        // TODO 8: Display totals with formatting
    }
}
