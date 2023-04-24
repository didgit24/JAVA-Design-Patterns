# JAVA-Design-Patterns

## Singleton

### Basic features
with Lazy Initialization

* Private constructor, private static instance variable, public getInstance method
* Private constructor as no one can initialize this class
* Lazy initialization - only initializes whenever getInstance gets called
* Only happens once. Same initialized instance will be available to every time whenever it gets called.
* Example - PropertyReader, DatabaseConnectionSetup, Loggers

With Eager Initialization

* In this case class gets initialized before getInstance method called, so its named Eager
* Static block can also do this as its get loaded whenever memory gets loaded.

With Multi Threading

* It will fail if two threads checks if condition at a same time and creates two instance.
* To avoid we can use syncronized block
* Lock object or class

With Multi Threading and null check
* Acquiring lock is an expensive process
* We will check if instance is null, then only we will acquire the lock
* Double check
* make static variable volatile to avoid issue in multi thread. (Volatile keyword is used to modify the value of a variable by different threads. It is also used to make classes thread safe. It means that multiple threads can use a method and instance of the classes at the same time without any problem. The volatile keyword can be used either with primitive type or objects.)

### Singleton problems
`Serializtion Prob` - If we serialize and deserialize the same instance it will give different values for Singleton classes.

`Sol` - Use to readResolve() method, it will return a object to desrialize. It will read instance from readResolve method while deserializing, instead of creating a new one. Mark it with private/protected so that other classes can't invoke this method.

`Coleable Prob` - If any class extends they can clone our singleton class.

`Sol` - Implement cloneable method to stop cloning. throw new CloneNotSupportedException(), when someone tries to clone.

`Reflection Prob` - Using the reflection API, getDeclaredConstructor() method and  constructors.setAccessible(true) which will return you a separate instance.

`Sol` - Use Enum. Enums doesn't has constructors. So reflection can not modify this.

## Factory Pattern

### Basic features

Hides the object creation process, hands over the created object. Example - Driver creation for DB connection(JDBC driver), we just pass urls.

## Abstract Factory Pattern

### Basic features

Factory of factory patterns. Example - JAXP, read-write-update xml class using document class. To create document we use DocumentBuilder which is a factory class. DocumnetBuliderFactory creates DocumnetBuilder, factory of factory.

## Template Method Pattern

### Basic features

Behavioural pattern. Parent would have Base template method whic should be used by child classes.

## Adapter Pattern

### Basic features

Adapter pattern helps one method from one class to adapt and imlement method according to other class. Adapter class will converts the methods accordingly.