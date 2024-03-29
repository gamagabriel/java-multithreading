**1° Section: Motivation & Operating System Fundamentals**
-

**2 motivations for multithreading:**
- Responsiveness achieved by Concurrency. 
- Performance achieved by Parallelism;

**What the thread contains?**
- Stack - Region in memory, where local variable are stored, and passed into functions;
- Instruction Pointer, address of the next instruction to execute.
- ![threads-contains.png](images/threads-contains.png)

**What threads share?**
- Files;
- Heap;
- Code.

**Context Switch**
- The act of stopping one thread, scheduling it out, scheduling in another thread and starting it 
is called context switch;
- Context switch is not cheap, and is the price of multitasking (concurrency);
- Same as we humans when we multitask - Takes time to focus.
- Each thread when running on a CPU occupies some resources like registers, cache in CPU and kernel resources
in the memory;
- When we switch to a different thread, we need to store all this data and restore the resources
of another thread back to the CPU and memory;

**Context Switch - Key Takeaways**
- Too many threads: Thrashing, spending more time in management than real productive work;
- Threads consume less resources than processes;
- Context switching between threads from the same process is cheaper than context switch between different processes

**Threading fundamentals**
- Thread.class: Encapsulates all thread related functionality;
- Have two ways to run code on a new thread:
  - Implement Runnable interface, and pass to a new Thread object (See first here: [FirstWayCreateThread.java](src%2Fmain%2Fjava%2Forg%2Fmultithread%2Fcreation%2FFirstWayCreateThread.java));
  - Extend Thread class and create an object that class (See second here: [SecondWayCreateThread.java](src%2Fmain%2Fjava%2Forg%2Fmultithread%2Fcreation%2FSecondWayCreateThread.java)).
- Both ways are equally correct to run a new thread.


**Stack & heap memory regions**
- Threads share all data located on the heap, can access and allocate objects on the heap at any moment
- Data allocated on the heap:
  - Objects (anything created with new operator)
    - Strings
    - Object
    - Collections
    - ...
  - Members of classes
  - Static variables


- Heap Memory Management:
  - Governed and managed by Garbage Collector
  - Objects - As long as there is a reference, it will be allocated
  - Members of classes - exist as long as their parent object exists (same life cycle as their parents)
  - Static variables - stay forever


- Allocated (See image memory regions):
  - References:
    - Can be allocated on the **slack**
    - Can be allocated on the **heap** if they are members of a class
  - Objects:
    - Always allocated on the **heap**
    - 
- Heap image example: ![heap-format.png](images/heap-format.png)
- Memory regions: ![memory-regions.png](images/memory-regions.png)