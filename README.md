# Tower of Hanoi Algorithm in Java

This repository contains an implementation of the Tower of Hanoi algorithm in Java. The Tower of Hanoi is a classic mathematical puzzle that involves three rods and a number of disks of different sizes. The objective is to move the entire stack of disks from one rod to another, following simple rules.

How to Run:

1.Clone the repository to your local machine.

2.Open the project in your preferred Java IDE.

3.Run the towerofhanoi class, and you will be prompted to enter the number of disks.

4.The algorithm will then display the sequence of moves to solve the Tower of Hanoi problem with the specified number of disks.

Algorithm Overview:

The algorithm is implemented using a recursive approach.
The toi method represents the Tower of Hanoi algorithm, taking into account the rules of the puzzle.
The base case handles the scenario when there's only one disk, printing the move to transfer it directly to the destination rod.
In the recursive case, the algorithm breaks down the problem by moving the top n-1 disks to an auxiliary rod before moving the remaining disk to the destination rod.

Feel free to explore and use this code to understand the Tower of Hanoi problem or incorporate it into your Java projects!

