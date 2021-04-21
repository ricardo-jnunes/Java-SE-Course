# Java-SE-Course

####Objects

#####Strings
 - String Class that represents char sequences
 - String someStrinv ="Hello"; is recommended, cause JVM optimize memory in String Pool memory (someString.intern())
 - Strings are immutable, any change results in a new String, Strings are collected by GC if there is not references anymore
 - String index starts from 0
 
#####StringBuilder
 - StringBuilder is mutable, they no create a new instance after modify String 
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
 
 