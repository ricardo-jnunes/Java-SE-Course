# Java-SE-Course

####Inheritance
Classes form a hierarchy descending from the java.lang.Object class.
Java class does not support multiple inheritance
It is to reuse behaviors and attributes

The Object class contains generic behaviours
 - toString
 - equals
 - hashcode
 - clone
 - wait, notify to control threads
 
 - super keyword to reference parent object
 - this keyword to reference same object
 

  - The Object class is the ultimate parent of any other class in Java
  - The Object class defines common, generic operations that all other Java classes inherit and reuse

####Initialization Summary
 - All code of class must be loaded into memory first
 -  It needs to be loaded only once per class
 
The following is executed once
 1. Object static initializer
 2. Shop static initializer
 3. Product static initializer
 4. Food static initializer
 
 The following is executed per each instantiation
 1. Object class constructor
 2. Product instance initializer
 3. Product constructor
 4. Food instance initializer
 5. Food constructor
 
####Polymorphism
The subclass can override parent class methods.
 - @override is optional, but it say to compiler check the signature matches the superclass method
 - Simplifies coding (not if/else by type or cast), each class has its logic
 - JVM gets automatically get the correct method
 - Reuse parent mehtod logic, use super keyword
 
 
####Abstract X Interface
Consider using abstract classes if any of these statements apply to your situation:
 - In the java application, there are some related classes that need to share some lines of code then you can put these lines of code within the abstract class and this abstract class should be extended by all these related classes.
 - You can define the non-static or non-final field(s) in the abstract class so that via a method you can access and modify the state of the Object to which they belong.
 - You can expect that the classes that extend an abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).

Consider using interfaces if any of these statements apply to your situation:
 - It is a total abstraction, All methods declared within an interface must be implemented by the class(es) that implements this interface.
 - A class can implement more than one interface. It is called multiple inheritances.
 - You want to specify the behaviour of a particular data type, but not concerned about who implements its behaviour.