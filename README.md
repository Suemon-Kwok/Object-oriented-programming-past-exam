Object oriented programming past exam

| Week | Topic | File(s) | Notes |
|------|-------|---------|-------|
| Week 1–2 | Introduction to the Java Language | `MethodIsClosedQ1.java` | Basic static method using `String` methods (`toUpperCase`, `contains`) — core language syntax, no OOP concepts yet. |
| Week 4 | Get and Set Methods | `Grade.java` | Simple class with a public field, used here to demonstrate method behavior (`compareTo`) alongside accessor-style design *(see note below — also touches Week 8)*. |
| Week 6 | Inheritance | `Food.java` + `Hamburger.java` **(paired)** | `Hamburger extends Food`, calls `super()`, and overrides `isHealthy()` — classic superclass/subclass pair. |
| Week 7 | Enumerated Types | `BoardingApp.java`, `LevelApp.java` | Both define and use custom `enum` types (`Membership`, `Levels`) with constructors, fields, and `switch` statements. |
| Week 8 | Interface and Collections | `Grade.java`, `MyList.java` | `Grade implements Comparable<Grade>` (interface); `MyList` uses `ArrayList` (Java Collections Framework). |
| Week 9 | Exceptions | `InvalidAgeException.java` + `Person.java` **(paired)** | `InvalidAgeException extends Exception`; `Person`'s constructor throws it when age is out of range. Note: `Person.java` in this upload only contains the `InvalidAgeException` class definition — it's a duplicate/companion of the exception class from `InvalidAgeException.java`, not the `Person` class itself. |
| Week 10 | Stack | `Stack.java` | Array-backed stack (`Integer[]`) implementing `push`, `pop`, and `isEmpty`. |
| Week 11 | Linked Lists | `LinkedList.java` | Custom singly-linked list class with `add()` and a recursive `find()` method. |

## Paired files
- **Food.java + Hamburger.java** — superclass/subclass pair for Week 6 (Inheritance).
- **InvalidAgeException.java + Person.java** — exception class + the class that throws it, for Week 9 (Exceptions).

## Files appearing in two weeks
- **Grade.java** is listed under both Week 4 and Week 8 since it's a simple example of implementing an interface (`Comparable`), which is the stronger match — treat **Week 8** as its primary home.



