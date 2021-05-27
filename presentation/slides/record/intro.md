## Introduction

* Introduced in Java 14 (March 2020)
* A record can be best thought of as a nominal tuple; it is a transparent, shallowly immutable carrier for a specific ordered sequence of elements.
* Records can be used in a wide variety of situations to model common use cases, such as multiple return, stream joins, compound keys, tree nodes, DTOs, and more, and provide stronger semantic guarantees that allow developers and frameworks to more reliably reason about their state.
* Like enums, records come with some restrictions compared to classes, and so will not replace all data-carrier classes.   Specifically, they are not intended as a replacement for mutable JavaBean classes.
* Similar to Kotlin's data classes
