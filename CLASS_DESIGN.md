# Java-SE-Course

####Class Design
Extends generic behavior

####Methods overload
You can more than one version of one method
 - Same method name
 - Different number or different types or order of parameters
 - Flexible design
 
####Variable Number of Arguments
Known as varargs

 ```java
 public some(double... vargs){
    // do something
 }
 ```
 
####Constructors
Special method that initializes the object
You can reuse constructors
 - this(<other constructor parameters>);
 
####Access Modifiers
 - public - Visible to any other class
 - protected - Visible to classes in the same package and subclasses
 - <default> - Only in the same package
 - private - Only in the same class
 
####Encapsulation
Hide the thins are implemented, hide the logic
 - private access modifier
 - control the access to information
 
####Define Immutability
Read-only data objects.
Good when you have multi-thread programming and concurrency.

 - Immutable are thread-safe
 - Primitive wrappers, String, LocaDate and so on.
 - Instance variables must be encapsulated with private
 - You can set variables final, but you need initialize, you can use the instance initializer
 
####Enumeration
Is a collections fixed set of instances of a particular type
 - enum keyword
 - Implicit public, static and final
 - Used as Variable types and switch constructs