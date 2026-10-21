# Java Practice Repository

This repository contains beginner-friendly Java programs for learning core
syntax, input and output, operators, strings, loops, arrays, searching, and
basic problem-solving patterns.

## Tools

- Java Development Kit (JDK)
- Visual Studio Code
- Git and GitHub

## Repository Structure

```text
Java/
├── Code Base/
│   ├── Java Basics/
│   │   ├── Input Output/
│   │   └── Operators/
│   └── Strings/
├── Logic building/
│   └── Numbers/
└── UserInput.java
```

There are currently 32 Java programs:

- 19 Java basics, operator, and string programs
- 12 number and logic-building programs
- 1 root-level input program

## Programs by Topic

### Java Basics

- [AsciiDemo.java](Code%20Base/Java%20Basics/AsciiDemo.java)
- [DataTypesDemo.java](Code%20Base/Java%20Basics/DataTypesDemo.java)
- [FullNameGreeting.java](Code%20Base/Java%20Basics/FullNameGreeting.java)
- [HelloName.java](Code%20Base/Java%20Basics/HelloName.java)
- [HelloWorld.java](Code%20Base/Java%20Basics/HelloWorld.java)
- [ItemCostCalculator.java](Code%20Base/Java%20Basics/ItemCostCalculator.java)
- [PrintName.java](Code%20Base/Java%20Basics/PrintName.java)
- [PrintStatements.java](Code%20Base/Java%20Basics/PrintStatements.java)
- [RectangleArea.java](Code%20Base/Java%20Basics/RectangleArea.java)
- [StudentDetails.java](Code%20Base/Java%20Basics/StudentDetails.java)
- [SumOfTwoNumbers.java](Code%20Base/Java%20Basics/SumOfTwoNumbers.java)
- [ReadAgeInput.java](Code%20Base/Java%20Basics/Input%20Output/ReadAgeInput.java)
- [ArithmeticOperators.java](Code%20Base/Java%20Basics/Operators/ArithmeticOperators.java)
- [AssignmentOperators.java](Code%20Base/Java%20Basics/Operators/AssignmentOperators.java)
- [ComparisonOperators.java](Code%20Base/Java%20Basics/Operators/ComparisonOperators.java)
- [LogicalOperators.java](Code%20Base/Java%20Basics/Operators/LogicalOperators.java)

### Strings

- [StringIntro.java](Code%20Base/Strings/StringIntro.java)
- [StringMethodsDemo.java](Code%20Base/Strings/StringMethodsDemo.java)

### Loops and Number Series

- [Print1To10.java](Logic%20building/Numbers/Print1To10.java)
- [Print10To1.java](Logic%20building/Numbers/Print10To1.java)
- [PrintEvenNumbers.java](Logic%20building/Numbers/PrintEvenNumbers.java)
- [PrintOddNumbers.java](Logic%20building/Numbers/PrintOddNumbers.java)
- [MultiplicationTable.java](Logic%20building/Numbers/MultiplicationTable.java)
- [PrintSum.java](Logic%20building/Numbers/PrintSum.java)
- [SumOfNaturalNumber.java](Logic%20building/Numbers/SumOfNaturalNumber.java)
- [SumOfEvenNaturalNumber.java](Logic%20building/Numbers/SumOfEvenNaturalNumber.java)
- [WhileLoopCounter.java](Code%20Base/Java%20Basics/WhileLoopCounter.java)

### Arrays and Searching

- [BinarySearch.java](Logic%20building/Numbers/BinarySearch.java)
- [FindMaxUsingVector.java](Logic%20building/Numbers/FindMaxUsingVector.java)
- [InputMaxElement.java](Logic%20building/Numbers/InputMaxElement.java)
- [PrintingVectorIntegerInReverseOrder.java](Logic%20building/Numbers/PrintingVectorIntegerInReverseOrder.java)

### Input Handling

- [UserInput.java](UserInput.java)

## How to Run a Program

1. Install a JDK and verify it with `java --version` and `javac --version`.
2. Open a terminal at the repository root.
3. Compile one source file, for example:

   ```bash
   javac "Logic building/Numbers/BinarySearch.java"
   ```

4. Run the compiled class from the directory containing the source:

   ```bash
   cd "Logic building/Numbers"
   java BinarySearch
   ```

For a program that reads input, enter the values described in its sample
input comment. Compiled `.class` files are ignored by Git.

## Learning Roadmap

1. Java syntax and data types
2. Input, output, and operators
3. Loops and number series
4. Strings
5. Arrays and searching
6. Sorting, recursion, collections, and object-oriented programming

Every source file includes a problem statement, approach, algorithm,
complexity analysis, author, and sample output to make the examples easier to
review.

## Git Workflow

```bash
git status
git add <files>
git commit -m "describe the change"
git push origin main
```
