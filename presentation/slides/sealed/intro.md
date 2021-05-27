## Introduction

* Introduced in Java 15 (September 2020)
* A sealed class is a class or interface which restricts which other classes or interfaces may extend it
* Sealed classes, like enums, capture alternatives in domain models, allowing programmers and compilers to reason about exhaustiveness.
* Sealed classes are also useful for creating secure hierarchies by decoupling accessibility from extensibility, allowing library developers to expose interfaces while still controlling all the implementations.
* Sealed classes work together with records and pattern matching to support a more data-centric form of programming.
