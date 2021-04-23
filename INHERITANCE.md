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