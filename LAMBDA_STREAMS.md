# Java-SE-Course

####LAMBDA
Lambda expression is an inline implementation of a functional interface.

 - Lambda token -> separates parameters list from the method body
 - Lambda expression must implement abstract R apply(T t)

####Streams
Processing can be sequential(default) or parallel
STREAMS HANDLING IS DESCRIBED BY THE FOLLOWING INTERFACESç
 - BaseStream - core behavious
 - Stream, DoubleStream, InStream, LongStreams interfaces extend the BaseStream
 - Stream uses Generics
 - Can be implemented using lambda

 - Predicate interface does the filter method in a stream accept
 - A Function replace every element in a stream with a different value
 - Traversal of the pipeline source does not begin until the terminal operation of the pipeline is executed
 
Located in java.util.function package
Improve stream pipeline handling performance by avoiding excessive auto-box-unboxing
 
Stream pipeline have the following operations categories
 - Intermediate - perform action and produce another stream
 - Terminal - traverse stream pipeline and end stream processing
 - Short-Circuit - produce finit result, even if is infinite
 
Streams Intermediate Operations
 - filter
 - map
 - flatMap - merge stream
 - peek
 - sorted
 - dropWhile
 - limit (Short-Circuit)
 
Streams Terminate Operations
 - forEach
 - count
 - min, max, sum
 - reduce - Produce a single result from the stream, in a Optional using BiFucntion (mapping and accumulation)
 - allMatch, anyMatch, noneMatch (Short-Circuit)
 - findAny, findFirst  (Short-Circuit)
 
Parallel Stream Processing
 - Parallel Or Sequential (Default)
 -  Parallel of the stream are subdivided into subsets then are processed in parallel
 - Processing order is stochastic (indeterminate)
 - Parallel is good just for certains cases
    - Stateless (state of one elmente must not affect another)
    - Non-Interfering (data source must not be affected)
     -Associative (result must no be affected by the order of operands)
 - Incorrect handling of parallel streams can corrupt memory and slow down
    - Do not perform operation that require sequential access to a shared resource
    - Do not perform operations that modify shared resource
        - topMap in sequential mode
        - toCouncurrentMap in parallel mode
 - Parallel can only be beneficial if:
     - Stream contains large number of elements
     - Multiple CPU cores

