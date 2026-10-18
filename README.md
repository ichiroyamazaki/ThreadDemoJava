# ThreadDemoJava

A simple **Java Multithreading Demonstration** that introduces thread creation, execution, and state monitoring using the built-in `Thread` class.

## Overview

ThreadDemoJava asks the user to provide names for two threads. It creates two instances of the `ThreadDemo` class, displays their initial states, starts both threads, and prints their states again after a 500-millisecond delay.

Each thread's `run()` method prints its assigned name and the state reported by `Thread.currentThread().getState()`.

## Features

- **Custom thread names:** Lets users name two threads through console input.
- **Thread creation:** Creates two instances of a class that extends `Thread`.
- **Thread state inspection:** Displays thread states before and after execution.
- **Concurrent execution:** Starts both threads using `start()`.
- **Thread-state reporting:** Prints the state of the currently executing thread from `run()`.
- **Timed pause:** Uses `Thread.sleep(500)` before the final state checks.
- **Exception handling:** Catches `InterruptedException` if the main thread's sleep is interrupted.

## Technologies Used

- Java
- `Thread` for multithreading
- `Scanner` for console input
- `Thread.State` for thread-state reporting
- `Thread.sleep()` for a timed pause

## Requirements

- Java Development Kit (JDK)
- A terminal or command prompt, or a Java-compatible IDE

## Project Structure

```text
ThreadDemoJava/
├── ThreadDemo.java
└── README.md
```

The source file declares the `Threads` package.

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/ichiroyamazaki/ThreadDemoJava.git
cd ThreadDemoJava
```

### 2. Compile the program

From the repository root, run:

```bash
javac -d . ThreadDemo.java
```

The `-d .` option creates the directory structure corresponding to the declared package.

### 3. Run the program

```bash
java Threads.ThreadDemo
```

Alternatively, open the project in a Java-compatible IDE and run `ThreadDemo` while preserving its package configuration.

## How to Use

1. Launch the program.
2. Enter a name for the first thread.
3. Enter a name for the second thread.
4. Observe the initial state of both threads.
5. Watch as the two threads start and print their execution states.
6. Observe the state report printed after the 500-millisecond pause.

### Example Output

```text
Name your first thread: WorkerOne
Name your second thread: WorkerTwo
WorkerOne is NEW
WorkerTwo is NEW

Starting the threads...
WorkerOne is RUNNABLE
WorkerTwo is RUNNABLE

After sleep...
WorkerOne is TERMINATED
WorkerTwo is TERMINATED
```

*This is illustrative output. Actual thread states and their display order can vary between runs.*

## Understanding Thread States

Java provides several thread states:

| State | Description |
|---|---|
| `NEW` | The thread has been created but not started. |
| `RUNNABLE` | The thread is executing or eligible to execute. |
| `BLOCKED` | The thread is waiting to acquire a monitor lock. |
| `WAITING` | The thread is waiting indefinitely for another action. |
| `TIMED_WAITING` | The thread is waiting for a specified period. |
| `TERMINATED` | The thread has finished execution. |

The initial state is normally `NEW`. Once `start()` is called, the thread transitions into an execution-related state. The `run()` method prints the state of the currently executing thread, which will normally be `RUNNABLE`.

## Current Limitations

- The program creates exactly two threads.
- Thread names are entered at runtime and are not saved.
- The fixed 500-millisecond delay does not guarantee that both threads have completed.
- The program does not use `join()` to wait explicitly for thread termination.
- Thread execution and output ordering are not deterministic.
- The example demonstrates basic thread creation rather than a production concurrency workflow.

## Purpose

This project is suitable for beginners learning Java multithreading, class inheritance, constructors, method overriding, thread lifecycle states, and exception handling.

## Repository

[https://github.com/ichiroyamazaki/ThreadDemoJava](https://github.com/ichiroyamazaki/ThreadDemoJava)
