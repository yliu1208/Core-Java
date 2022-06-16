

## 5.4 Object Wrappers and Autoboxing
**wrappers**: 
- Integer, Long, Float, Double, Short, Byte, Character, Boolean
- The first six classes inherit from the common superclass `Number`; 
- The wrapper classes are immutable


## 5.6 Abstract Class
1. A class with one or more abstract methods must itself be declared abstract. 
```java
public abstract class Person {
    ...
    public abstract String getDescription(); 
}
```
2. Abstract classes can have fields and concrete methods. 
3. Abstract classes cannot be instantiated. However, you can create objects of concrete subclasses. 
4. You can still create object variables of an abstract class, but such a variable must refer to an object of a nonabstract subclass. 
