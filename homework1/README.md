## Please enter your personal info here:
Name: Felisa "Fee" Wiley

PennKey (e.g., taliem): fwiley1 83102237


# Part 1:
## Are Alicia and Lloyd both wrong, or perhaps both right? Is only one of them correct? Why?
## Lloyd is right that “A is constant time and B is linear time.” A runs in O(1) time and B runs in O(n) time.


# Part 2:
## What are the Big O and Big Ω times for snippets C and D?
## Snippet C has a Big O of O(nm) and Big Ω of Ω(1).
## Snippet D has a Big O of O(nm) and Big Ω of Ω(nm).

## When measuring actual runtime, does one of the snippets run faster than the other? In what situations? Why do you think this is the case?
## Snippet C runs faster but only when thetarget is found early. For example, as soon as the target is found, both of Snippet C's loops stop.
## Snippet D will always run slower except if the target is not found at all or at the end. Even if the target is found, the loop continues through all the remaining cells. 

## What else do you notice about the reported runtime? Is it 100% consistent every time you run it?
## The reported runtime is not 100% consistent every time you run it.


# Part 3:

## Results for 15 tickets:
## LinkedList time: 963541 ns
## ArrayList time:  11449833 ns
## LinkedList is 11x faster

## Results for 20,000 tickets:
## LinkedList time: 1015250 ns
## ArrayList time:  45504333 ns
## LinkedList is 44x faster

## Results for 40,000 tickets:
## LinkedList time: 966333 ns
## ArrayList time:  111589333 ns
## LinkedList is 115x faster

## Before you make any changes, explain whether you think a LinkedList or an ArrayList makes more sense in this instance. Which do you think will be faster? Why?
## LinkedList is faster for FIFO (first in, first out) queue operations
## For ArrayList<>() it's O(n) removal but with LinkedList it's O(1) removal.


## When measuring actual runtime, is the LinkedList version Suho wrote, or your ArrayList version faster? Does this change when the list size is small versus when it is very large?
## For all tests queue sizes, the LinkedList<>() is faster. 
## LinkedLists performance scales with increasing queue tickets. 
## The ArrayList version becomes even slower at larger sizes due to its O(N) removal cost, while LinkedList maintains a near-constant removal time regardless of queue size.



## If you ignore queue creation times, does that affect which ticket processor version is faster?
## LinkedList's constant-time removal ensures it will always outperform ArrayList for first in, first out queue operations.



## Write a paragraph or two in the style of a technical report (think about – how would I write this professionally if I needed to explain my findings to my manager?).
Your report should answer the following questions:
* What did you learn from this experience?
* Which implementation do you suggest should be used? Are there certain situations that might call for the other approach?
* How does the theoretical time complexity compare with your findings?

## Technical Report Summary

* From this experience, I learned that even though ArrayList and LinkedList seem similar on the surface, their internal differences really matter for performance. The Big O complexity—LinkedList’s O(1) removal vs. ArrayList’s O(N) showed up clearly during the runtime tests. I was honestly surprised by how much faster LinkedList was for larger queues—up to 115 times faster with 40,000 tickets.

I definitely recommend using LinkedList for Suho’s ticket system since it processes tickets in first in, first out (FIFO) order and will handle large queues efficiently. The only time I’d consider ArrayList is if we need random access by index. Otherwise, LinkedList is the clear winner.

My runtime measurements matched the theory perfectly: LinkedList’s constant-time removal kept processing time nearly flat, while ArrayList’s time grew quadratically with queue size.


# Part 4
## What are the Big O and Big Ω times for Javier's algorithm? What are the Big O and Big Ω for space use?



## Write a paragraph or two in the style of a technical report (think about – how would I write this professionally if I needed to explain my findings to my manager?). 
Your report should answer the following questions:
* Which of the two algorithms (yours versus Javier's) is more efficient in time and space (in terms of Big O)
* What about in actual runtime?
* Which implementation do you suggest should be used? Are there certain situations that might call for the other approach?

## Technical Report for Part 4:
* Looking at both merge sort implementations, I realized there are different ways to solve the same sorting problem. Javier's version uses a LinkedList and loops everything step-by-step (iterative), while my version keeps calling itself until the arrays are tiny (recursive). Both should take about O(N log N) time, which is pretty fast for sorting.

* My recursive version needs extra memory for the temporary arrays plus some space on the call stack for all the function calls. Javier's version also needs extra arrays but uses a LinkedList instead of recursion. In practice, my version might be a bit slower because calling functions has some overhead.

* I am partial toward recursive implmentations BUT I know they take up too much exra memory and Travis told us yesterday to not use recursive calls.