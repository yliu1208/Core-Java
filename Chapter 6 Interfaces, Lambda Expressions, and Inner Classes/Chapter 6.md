

## 6.1 Interfaces
### 6.1.1 The Interface Concept
1. The `sort` method of the `Arrays` class promises to sort an array of objects, but under one condition: the objects must belong to classes that *implement* the `Comparable` interface.  

2. All methods of an interface are automatically `public`. 

### 6.1.2 Properties of Interfaces
1. Even though you can't construct interface objects, you can still declare interface variables. An interface variable must refer to an object of a class that implements the interface. 
`Comprable x; // OK` 

2. Just as you use `instanceof` to check whether an object is of a specific class, you can use `instanceof` to check whether an object implements an interface: 
`if (anObject instanceof Comparable) {...}` 

3. Although you cannot put instance fields in an interface, you can supply constants in them. For example: 
```java
public interface Powered extends Moveable 
{
    double milesPerGallon(); 
    double SPEED_LIMIT = 95;    // a public static final constant 
} 
```
### 6.1.3 Interfaces and Abstract Classes
