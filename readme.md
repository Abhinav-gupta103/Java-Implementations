# Multi-Threading Java Demos

This repository contains Java examples demonstrating multi-threading concepts, synchronization, atomic operations, collections, and more.

## Files Overview

- [`AtomicDemo.java`](AtomicDemo.java): Shows usage of `AtomicInteger` for thread-safe counting.
- [`CallableDemo.java`](CallableDemo.java): Demonstrates the `Callable` interface and retrieving results from threads using `Future`.
- [`JoinMethodDemo.java`](JoinMethodDemo.java): Illustrates the use of `Thread.join()` to control thread execution order.
- [`SynchronizationDemo.java`](SynchronizationDemo.java): Explains synchronization using the `synchronized` keyword for thread safety.
- [`TestArrayList.java`](TestArrayList.java): Demonstrates working with `ArrayList` and creating an unmodifiable list.
- [`TestTreeMap.java`](TestTreeMap.java): Shows usage of `TreeMap` with custom comparators and objects.
- [`ThreadTest.java`](ThreadTest.java): Basic example of creating and running multiple threads.

## How to Run

Compile and run any demo using:

```sh
javac FileName.java
java FileName
```

For example:

```sh
javac AtomicDemo.java
java AtomicDemo
```

## Requirements

- Java 8 or above