
/**
 * Task Queue Manager Exercise
 *
 * Key Features Demonstrated:
 * - First/Last operations
 * - Reversed view
 * - Different implementations
 * - View synchronization
 *
 * Task: Implement a simple task queue manager that can:
 * - Add tasks from both ends
 * - Process tasks from both ends
 * - View tasks in reverse order
 * - Demonstrate different implementations
 */
public class TaskQueueExercise {

    record Task(String id, String description, int priority) {}

    static class TaskQueue {
        // TODO 1: Create a SequencedCollection for tasks

        // TODO 2: Implement methods to add tasks at both ends
        // addUrgentTask (beginning) and addRegularTask (end)

        // TODO 3: Implement methods to process tasks from both ends
        // processNextTask and processLastTask

        // TODO 4: Implement a method to view tasks in reverse order
        // getReversedView

        // TODO 5: Add a method to demonstrate view synchronization
        // modifyAndShowSync
    }

    public static void main(String[] args) {
        // TODO 6: Test the TaskQueue with different implementations
        // Test with ArrayList and LinkedList

        // TODO 7: Demonstrate bidirectional operations

        // TODO 8: Show reverse view and synchronization
    }
}
