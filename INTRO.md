# Java-SE-Course

####Inheritance
Extends generic behavior

####JAVA API
JDK provides hundreds of classes for various programming purposes
 - String, Arrays, File, HashMap, System, Object
 
###Tips
 - Keywords and literals cannot be used as identifiers (classes, variables, methods and son on)
 - If you do not have a package, the "default package, not recommended practice
 - Imports package are not present in a compiled code, it is just  exist on source code
 - 
 
###Access Modifiers
  - public - Any class
  - protected - same package or subclass
  - <default> - No access modifier - Only the same package
  - private - Only same class
  
###Main
 - Main is the default entry point for the application
 - Method name must be main and be public, static (called without create a instance of class), void and accepts array of Strings
 
###Compile
 - javac -cp /project/classes -d /project/classes /project/package/Some.java

###Execute
 - java -cp/project/classes package.Some "Some args"
 - Since 11 is possible to run single-file source code
 
###Documentation
 - HTLMS markups
 - tags @
 - Comments //xxxx /** yyyy*/
 - -javadoc -d javadocpath