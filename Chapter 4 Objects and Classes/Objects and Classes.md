

### 4.6.2 Default Field Initialization
If you don't set a field explicitly in a constructor, it is automatically set to a default value: numbers to `0`, `boolean` values to `false`, and object references to `null`. 

### 4.6.3 The Constructor with No Arguments
If you write a class **with no constructors whatsoever**, then a no-argument constructor is provided for you. This constructor sets *all* the instance fields to their default values. (Please keep in mind that you get a free no-argument constructor only when your class has no other constructors.)  

If a class supplies at least one constructor but does not supply a no-argument constructor, **it is illegal to construct objects without supplying arguments**.  

