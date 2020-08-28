These are my steps on the Data Structure grade, so there will be classes, projects, issues that i had. The main programming language used in this grade is Java using the concepts of POO.

# Data Structure

In computer science, a data structure is a data organization, management, and storage format that enables efficient acess and modification.


## Content Table

### **Queues, Stacks and Lists**

- [**Static Allocation**](#static-alloc)
	- [Queue](#static-queue)
	- [Stack](#static-stack)
	- [List](#static-list)
	
- [**Dynamic Allocation**](#dynamic-alloc)
	- [Queue](#dynamic-queue)
	- [Stack](#dynamic-stack)
	- [List](#dynamic-list)
	
## <div id="static-alloc" />Static Allocation

**Advantages:**
	- Keeps data organized when allocated side by side in a vector.
	- Has faster access speed to the memory.
	
**Disadvantages:**
	- To change the address you need to change your code.
	- The allocated memory will always be allocated, so if you reserved 100 positions on a vector and use just 10 the memory of the 90 will be allocated anyway.

### <div id="static-queue" />Queue

A queue in computational terms is a collection of entities that are maintained in a sequence and can be modified by the addition of entities at one end of the sequence and the removal of entities from the other end of the sequence. This operation is called FIFO (First in first out).

### <div id="static-stack" />Stack

A stack uses the same concept of the queues but instead of using the FIFO operation uses LIFO, that means that the first entity inserted will be the last taken out.

### <div id="static-list" />List

A list is when an entity inserted will be inserted on the desired location and will be no order to take out, any entity on the list can be popped out.

## <div id="dynamic-alloc" />Dynamic Allocation

In dynamic allocation of memory, when you need for example to increase your vector size it will be allocated more memory for usage. Gives more flexibility but always when inserting a new entity the memory will be allocated.

### <div id="dynamic-queue" />Queue

In this lesson i've learned how to implement the queue with dynamic allocation, i used the concept of Objects to create nodes that saves the value of it and the value of next node, and used an Object called header that is the first Node of the queue.

### <div id="dynamic-stack" />Stack

Stacks uses the same concept of queues but instead of removing first elements inserted, the last one will be removed. Using the concept of pointer we just create a Node that points to the last element inserted, and when it is removed it will be pointed to the next element so when the garbage collector does its work it will be cleared.

### <div id="dynamic-list" />List

