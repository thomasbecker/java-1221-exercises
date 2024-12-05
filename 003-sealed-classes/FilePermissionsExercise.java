
/**
 * File System Permissions Exercise
 *
 * Key Features Demonstrated:
 * - Sealed hierarchies for modeling finite sets of possibilities
 * - Pattern matching with sealed types
 * - Exhaustiveness checking
 * - Records with sealed interfaces
 * - Type-safe permission modeling
 *
 * Common Pitfalls Addressed:
 * 1. Understanding permitted subtype requirements
 * 2. Proper use of final/sealed/non-sealed
 * 3. Switch expression exhaustiveness
 * 4. Sealed type hierarchies with records
 *
 * Learning Objectives:
 * - Master sealed type declarations
 * - Understand pattern matching benefits
 * - Practice exhaustive type checking
 * - Model domain constraints
 *
 * Task: Implement a file system permissions model using sealed types.
 * Follow the TODOs to complete the implementation.
 */
public class FilePermissionsExercise {
    // TODO 1: Create a sealed interface 'Permission' that permits three types:
    // ReadPermission, WritePermission, and ExecutePermission

    // Each should be implemented as a record with appropriate fields

    // TODO 2: Create a sealed interface 'User' that permits:
    // AdminUser, RegularUser, and GuestUser
    // Include appropriate fields for each user type
    // E.g. AdminUser may have some admin field, RegularUser a department, GuestUser might expire

    // TODO 3: Create a sealed interface 'Resource' that permits:
    // File, Directory, and SymbolicLink
    // Include appropriate fields for each resource type
    // Every resource has a name, a file has a size, a link a target, ...

    // TODO 4: Implement a PermissionChecker class that uses pattern matching
    // to determine if a user has permission for a specific action on a resource

    // Hint: A user should have write and execute permissions on resources he owns. Guests have only read permissions.

    public static void main(String[] args) {
        // TODO 5: Create instances of different users, resources, and permissions

        // TODO 6: Demonstrate permission checking with different combinations

        // TODO 7: Show exhaustive pattern matching with switch expressions

        // TODO 8: Demonstrate how the sealed hierarchy prevents invalid states
    }
}
