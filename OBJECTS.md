# Java-SE-Course

####Objects
Java objects are instances of classes.
The new operator creates an Objects (instance of Class), allocating memory to store this object.

Assign "reference" to memory allocated for the object to be able to access it.

 - Uninitialized primitives are defaulted to 0, and boolean to false
 - Uninitialized object references are defaulted to null
 - You can assign the same object reference to more than one variable, this does not duplicate the object
 - Use the this keyword (recursive reference to current object) to refer to an instance, rather than Local variable, but it is not required, 
 
#####Strings
 - String Class that represents char sequences
 - String someStrinv ="Hello"; is recommended, cause JVM optimize memory in String Pool memory (someString.intern())
 - Strings are immutable, any change results in a new String, Strings are collected by GC if there is not references anymore
 - String index starts from 0
 
#####StringBuilder
 - StringBuilder is mutable, they no create a new instance after modify String 
 - Are not thread-safe
 - Instantiated by new word
 - Default capacity is 16 and it auto-expands as required
 - Used to manipulate amount of text
 
####Wrapper Classes
 - Apply object-oriented capability to primitives
 - Avoid too many auto-boxing and auto-unboxing for performances reasons
 
 ```java
 Integer inum = 3; //Auto=boxing
 Integer num2 = new Integer(50);
 int inum = num2; //Auto-unboxing
 ```
 
######BigDecimal Class
 - Arbitrary-precision arithmetic, not limited 64bit precision like double
 - They are signed and immutable
 - Sacale and round operations
 
####Method Chain
 - When an operations returns an object you can invoke next operation upon this object
 - You do not need a intermediate variables
 
 ```java
 String some1 = "Hello";
 String some2 = some1.concat("World").substring(3,6); //some2 is "loW"
 ```

####Local Date and Time API
 - Introduced in Java SE 8 (java.time package), earlier versions use java.util.Date
 - LocalDate, LocalTime and LocalDateTime
 - Duration, Period and Instant
 - ZonedDateTime and java.util.Locale
 - Are immutable
 - Used to manipulate Date and Time, they provide methods like now()
 
#####Formating based on Locale
 - java.text.NumberFormat class is used to parse and format numeric values
 - java.time.format.DateTimeFormatter class is used parse and format date and time values
 
#####Localizable Resources
 - java.util.ResourceBundle, java.text.MessageFormat
 - resources package
    - messages.properties
    - messages_ru.properties ...

 ```java
 Locale locale = new Locale("ru");
 ResourceBundle bundle = ResourceBundle.getBundle("resources.messages", locale);
 String hello = bundle.getString("hello");
 String message = MessageFormat(hello, "John") // hello= Hello {0}
 ```

#####Local variable Type inference
Java is strong typed language, not allowed do not have a type (String, int, etc)

Introduces in Java 10 the typed inference, so no need explicitly declare local variable types
 - Overuse can reduce readbility 

 ```java
public void someOp(int param){
   var value1 = "Hello";
   var value2 = param;
}
 ```
 
#####Constants
Data is assigned once and cannot be changed
 - Declare final keyword
 
#####Static Context
Class memory context, know as static context

Shared data between instances
 - Use of static keyword
 - Static initializer runs once and is the first thing to run when the class is loaded