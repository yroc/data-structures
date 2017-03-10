# Project Description
An implementation of a circularly linked list in Java (source: Data Structures and Algorithms in Java, pp. 128&ndash;131).

# Background
Linked lists are traditionally viewed as storing a sequence of items in a linear order, from first to last. However, there are many applications in which data can be more naturally viewed as having a cyclic order, with well-defined neighboring relationships, but no fixed beginning or end.

For example, many multiplayer games are turn-based, with player A taking a turn, then player B, then player C, and so on, but eventually back to player A again, and player B again, with the pattern repeating. As another example, city buses and subways often run on a continuous loop, making stops in a scheduled order, but with no designated first or last stop per se.

For these types of scenarios, we have to change the way we think about the concepts of &ldquo;first&rdquo; and &ldquo;last&rdquo;,  &ldquo;head&rdquo; and &ldquo;tail&rdquo; Now, first and last are *variable* concepts&mdash; there&rsquo;s no single constant first (or beginning) and last (or end). Head and tail keep shifting (though they are always right &ldquo;next to&rdquo; one another, with head in front of (or after) tail. Head might now be better thought of as representing *most distant* and tail representing *most recent* (current).

Using the multiplayer game as an example, the tail would the player whose turn it currently is, and the head would be the player whose turn is most distant (i.e., the player who *just* had his/her turn). For the bus route example, the tail is the stop the bus is currently at, and the head is the stop furthest away (the stop the bus was *just* at).

A circularly linked list is essentially a singularly linked list in which the next reference of the tail node is set to refer back to the head of the list (rather than to `null`). 

The implementation of a CLL is very similar to that of a SLL. The differences are:
1. CLL includes a `rotate()` method to make the current head node the tail node
2. This actually obviates the need for a `head` reference in the list (and this is reflected in the implementation).
