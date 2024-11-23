
/**
 * Game Inventory System Exercise
 * 
 * Key Features Demonstrated:
 * - Basic record syntax and automatic generation of methods
 * - Compact constructors with validation
 * - Record immutability
 * - Record composition (records containing other records)
 * - Interface implementation with records
 * - Collection usage with records
 * 
 * Common Pitfalls Addressed:
 * 1. Records are final and can't be extended by other records
 * 2. Fields in records are final and can't be modified after construction
 * 3. Proper validation in compact constructors
 * 4. Making collections immutable in records
 * 
 * Learning Objectives:
 * - Understand when to use records instead of traditional classes
 * - Learn proper validation techniques in records
 * - Understand record composition patterns
 * - Practice implementing interfaces with records
 * 
 * Real-world Applications:
 * - Data Transfer Objects (DTOs)
 * - Value Objects in Domain-Driven Design
 * - Immutable data structures in game development
 * 
 * Your task is to implement a game inventory system using Java Records.
 * Follow the TODO comments to complete the implementation.
 */
public class GameInventoryExercise {
    // TODO 1: Create a record 'Item' with fields: id (int), name (String), value (int)
    // Add validation in a compact constructor to ensure name is not empty and value is positive

    // TODO 2: Create a record 'Weapon' that extends Item with additional fields: damage (int), durability (int)
    // Hint: Records can't inherit from other records, but can implement interfaces

    // TODO 3: Create a record 'InventorySlot' containing: item (Item), quantity (int)
    // Add validation to ensure quantity is positive

    // TODO 4: Create a record 'Inventory' containing: slots (List<InventorySlot>), capacity (int)
    // Make sure the list is immutable after it is added and that capacity is positive
    // Add a method 'boolean isFull()' that checks if the number of slots equals capacity

    public static void main(String[] args) {
        // TODO 5: Create several items, weapons, and inventory slots

        // TODO 6: Create an inventory and demonstrate its usage

        // TODO 7: Print inventory contents using toString() method

        // TODO 8: Demonstrate equality comparison between two identical items
    }
}
