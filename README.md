# Assignment: Ticketing System Simulation

This project simulates a basic ticketing system for a service center where customers take a number and wait to be served. The system uses a queue to model real‑world “first come, first served” behavior. The program includes ticket generation, ticket processing, random timing delays, and unit tests.

## Features
- Ticket class with ticket number and timestamp
- Queue‑based system using Java’s LinkedList
- Randomized timing to simulate real customer arrival and service time
- Separate phases for generating and processing tickets
- JUnit test cases for normal and edge scenarios
- Time and space complexity analysis

## How It Works
1. Ticket Generation
The system creates new Ticket objects and adds them to the queue.
A small random delay simulates customers arriving at different times.
2. Ticket Processing
Tickets are removed from the queue one by one and “served.”
Another random delay simulates variable service time.


## Clarifying Questions
- Should ticket numbers reset daily or continue increasing
- Should timestamps be formatted or raw
- Are there limits on queue size

## Test Cases
Normal Cases
- Tickets are generated correctly
- Ticket numbers increment properly
- Processing all tickets empties the queue
Edge Cases
- Processing an empty queue
- Generating zero tickets
- Handling a large number of tickets

## Time & Space Complexity
Ticket Generation
- Time: O(n)
- Space: O(n)
Ticket Processing
- Time: O(n)
- Space: O(1) extra

