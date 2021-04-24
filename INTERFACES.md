# Java-SE-Course

####Interfaces
An interface defines a set of features that can be applied to various other classes.
Is it to solve inheritance is not very flexible.
It is used to achieve abstraction and multiple inheritance in Java and solve ambiguity of multiply inheritance.

Interface is Type, just like a Class.
Can be used to casting and works with instanceof.
It describes a set of features to implement

 - Instance methods are by default public and abstract
 - They can contain concrete methods only if it re either default, or private or static
 - Can contain constants, but not variables
 -  Private interface methods do not cause conflicts, cause they are not visible outside of interface
 - Static class do not causes conflicts
 
 - Accessing superclass operations or variables could be ambiguous, thats it multiple inheritance is forbidden
 - A class must override default interface method only if it conflict with another default method


#####Functional Interfaces
Functional Interface is an interface that defines a single abstract operation (function)
 - Contains just one abstract method, no extra operations that could be "unwanted baggage" has to be implemented;
 It is a recommended approach