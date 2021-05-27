## Introduction

* Introduced in Java 14 (March 2020)
* The first phase of pattern matching is limited to one kind of pattern (type patterns) and one language construct (instanceof), but this is only the first installment in a longer feature arc.
* At the simplest level, pattern matching allows us to reduce the ceremony of conditional state extraction
* Binding variables are subject to definite assignment, but take this one step further: the scope of a binding variable is the set of places in the program where it would be definitely assigned. This is called flow scoping
