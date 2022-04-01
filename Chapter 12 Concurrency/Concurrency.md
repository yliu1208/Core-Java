## 12.3 Thread Properties

When the `interrupt` method is called on a thread that blocks on a call such as `sleep` or `wait`, the blocking call is terminated by an `InterruptedException`.

### 12.4.3 Lock Objects

### 12.4.4 Condition Objects

A lock object can have one or more associated condition objects.

When should you call `signalAll`? The rule of thumb is to call `signalAll` whenever the state of an object changes in a way that might be advantageous to waiting threads.

Another method, `signal`, unblocks **only a single thread from the wait set, chosen at random**.

## 12.6 Tasks and Thread Pools

### 12.6.1 Callables and Futures

### Callable

Callable Interface Link: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/concurrent/Callable.html

### 12.6.2 Executors

The `Executors` class:

```Java
public class Executors
extends Object
```

https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/concurrent/Executors.html
