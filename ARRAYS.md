# Java-SE-Course

####ARRAYS
 - Declare array - Determine the type to be stored in the array
 - Create array - Determine the length
 - Initialize array - Assign values to array
 - Access elements - in the array using index
 
 - Java arrays are of fixed length
    - However, you can recreate a new array
 - After an array is created, its length cannot be changed.
 - An array of primitive values is filled with 0 values (false values if it is of boolean type).
  - It is a fixed-length collection of elements of the same type indexed by int.
 - Is an object itself

####Java Collection API
 - Use generics
 - Dynamically expands as appropriate
 - Provide thread-safe operations
 - order elements and validations
 
####Deque Class
The Deque interface present in java.util package is a subtype of the queue interface. The Deque is related to the double-ended queue that supports addition or removal of elements from either end of the data structure.
 - Provides FIFO and LIFO
 - no args initial capacity 16
 - Constructor with specific initial capacity
 
 - offerFirst and offerLast - insert elements at head and tail
 - poolFirst and poolLast - get and remove elements at head and tail
 - peekFirst and peekLast get element at head and the tail of the deque
 
 
####ArrayList
 - Instances can be created using no-args, creating a list of initial capacity of 10 elements
 - Constructor with specific initial capacity
 - Any other Collection
 - Auto-expand

####HashMap
A HashMap is an implementation of Map. A Map maps keys to values. The key look up occurs using the hash.
 - Implements Set, no args initial capacity 16
 - Load factor 0.75 and Auto-expand
 - a Read only instance can be created using Map.of up to ten (10)
 - var-arg method ofEntries

####HashSet
 - Implements Set, no args initial capacity 16
 - Constructor with specific initial capacity
 - Load factor 0.75 and Auto-expand
 - Both HashSet and HashMap are not synchronized.
 - HashSet is implementation of Set Interface which does not allow duplicate value.


####Predicate
Implement interface Predicate method to remove elements from a collection based on a condition

####Collections Class
Convenience methods for handling collections
 - fill
 - searching
 - comparable
 
Can be corrupted if accessed concurrently from multiples threads
 - Any object in a heap is not thread-safe id its not immutable.
 - Only immutable objects are automatically thread-safe
 
 
 
See more in imgs/MostUsedColelctions.PNG