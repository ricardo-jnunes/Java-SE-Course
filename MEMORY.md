# Java-SE-Course

####Memory
Extends generic behavior

#####Stack and Heap
 - Memory is a logical, cause JVM manage this, different of C where you manipulate the address memory
 - Object is allocated on a heap
 - Primitives are stored on stack
 - Passing parameter, just like any local method variable, parameter are stored on a stack (variable is copied a references an object on heap)
 - See imgs/memory.PNG
 
####Memory Cleanup
Objects remain in the heap, so long as they are still referenced.
 - An object reference is null until it is initialized.
 - Assigning null does not destroy the object, just indicates absence of reference
 - When a method returns, its local variables go out of scope and their values are destroyed
 
Garbage collection is a background process that cleans unused memory within java run time.
 - GC is deferred
 - Objects becomes eligible for GC when there are no references pointing to it
 