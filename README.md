# Conway's Game of Life

## Rule of the game

The Game of Life consists of a finite two-dimensional grid of square cells, each of which is in one of two possible states, alive or dead.
Every cell could have minimum three to  maximum eight neighbors, which are the cells that are horizontally, vertically, or diagonally adjacent.  (The corner cells have three neighbors.)

At each step in time, the following transitions occur:

- Any live cell with fewer than two live neighbors dies, as if caused by under population.
- Any live cell with two or three live neighbors lives on to the next generation.
- Any live cell with more than three live neighbors dies, as if by overpopulation.
- Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules simultaneously to every cell in the seed.

## Class Diagram 

We described following classes and an interface in the class diagram:
1.     Pattern Interface: The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules simultaneously to every cell in the seed.
2.     GameOfLife: This class implements a control of the game and graphic user interface.  The game is initialized here and a timer acts as a trigger for each transition.
3.     Grid: The class describes a connection between logic and graphic user interface. The grid consisted of a number of columns and rows and it has column*row cells. It has a function called applyPattern() which transfer a message about pattern user selected.
4.     Cell: It is a main class which implements the logic of the game. Each cell changes its state according to the rule. GetNumberOfLivingNeighbours() function counts live neighbors and the next states are arrived for GoNextState() and SettleState()  functions.
5.     BasePattern: This class implements Pattern interface and provides common functions for all patterns.
6.     ExploderPattern, GliderPattern: These classes implement the different patterns in the grid.

![class](Game_of_Life_ClassDiagram.PNG)

## State Diagram

![class](CellStateDiagram.PNG)

The first state is a dead state from where the process starts. The next states are arrived for GoNextState() and SettleState() events. While GoNextState() checks a number of live neighbors and assigns the cell states in accordance with the aforementioned rules. SettleState() is responsible to change the state from GoingDead to Dead of Cell object or GoingAlive to Alive, after each trigger.
