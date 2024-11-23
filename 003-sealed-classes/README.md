## Key Features & Concepts

1. Sealed class/interface declaration with 'permits' clause
1. Permitted subclass requirements (final, sealed, or non-sealed)
1. Pattern matching with sealed types
1. Exhaustiveness checking in switch expressions
1. Combination with records
1. Module system interaction
1. Compile-time type checking benefits

## Exercise Ideas

Main Exercise: File System Permissions Model

- Demonstrates practical use of sealed hierarchies
- Shows pattern matching benefits
- Combines with records for data holding
- Illustrates exhaustiveness checking
- Models real-world permission scenarios

## Bonus Exercise: Expression Language Parser

- More complex sealed hierarchy
- Demonstrates nested sealed types
- Shows pattern matching in evaluator
- Practical compiler/interpreter concepts
- Mathematical expression handling

## Potential Pitfalls to Address

- Understanding permitted subtypes must be in same module/package
- Proper usage of final/sealed/non-sealed modifiers
- Exhaustiveness checking in switch statements
- Inheritance restrictions

## Real-world Applications

- Domain modeling
- Type-safe state machines
- Parser implementations
- Security models
