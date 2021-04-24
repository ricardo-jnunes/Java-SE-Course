# Java-SE-Course

####Generic
Generics is a feature of Java SE 5.
 - It allows variables and methods to operate on objects of various types while providing compile-time type safety.

 - Generic type avoids hard-coding the exact type as part of the class design
 - Helps to produce compact and type-safe code.
 
```java
//Without Generics
public class Some{
 private Object value;
  public Object getValue(){
    return value;
   }
}

Some some = new Some();

..............................

//With Generics
//T is a generic type marker
public class Some<T>{
 private T value;
  public T getValue(){
    return value;
   }
}

Some<Product> some = new Some<>;

```