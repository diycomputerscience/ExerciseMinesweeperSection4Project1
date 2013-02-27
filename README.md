<h1>Section 4 Project 1</h1>

<h2>Overview</h2>
In previous activities, we have created ```Board``` and ```Square``` classes. We also added basic functionality to these classes. Now it's time to move ahead one more step and introduce a simple user interface for the Minesweeper game. Keep in mind, this is not the final UI. Just something to get started with.

In this activity we will suffer temporary amnesia and forget that we have already implemented a bunch of classes. We will simply create and display a very simple ```JFrame```, and render it.

We have provided you a class called ```UI.java```. The purpose of this class is to implement the primary user interface of the game. 

However, before proceeding, we would like to draw your attention to a few things:

 1. Notice the package of UI – it is ```com.diycomputerscience.minesweeper.view```. This is different from the package of classes we have created earlier. Notice how we have used the package name to signify the purpose of this class. Just like we group related methods into one class, we group related classes into a package.
 1. Notice this class has a ```main``` method. When a class is executed, it's main method is where the code gets control. We will run this class when we want to run the game.
 1. Notice this class extends ```JFrame```. This allows us to instantiate and render the UI, which is a ```JFrame```. Eventually we will also place UI elements in this class.
 1. Notice the UI class has a static method called ```buildUI()```. This is more of a builder method in which you will initialize the UI. You may not be able to understand this right away, but we have introduced this method to make it easier to write unit tests for the UI.

<h2>Steps For This Activity</h2>
 1. Run ```SquareTest``` and ensure that all tests pass
 1. Run ```BoardTest``` and ensure that all tests pass
 1. Run ```UITest``` and notice that 1 test fails
 1. Follow instructions in the method ```UI.buildUI()``` and implement it. Then run UITest. If all tests pass, it means you have implemented the code properly. Keep in mind that we have not tested for the size of the ```JFrame```. It might be a good idea to set the size of the ```JFrame``` to 400x600.
 1. Run ```UI``` and verify that you see an empty window like this (this is what we see on Ubuntu. If you are running Minesweeper on a Windows or Mac machine, you will see a window which is slightly different)

![Mine](https://raw.github.com/diycomputerscience/MinesweeperImages/master/images/BlankMinesweeperBoard.jpg)

<h2>Learning Outcomes</h2>
 1. Understand that the ```main``` method of the class, is the point of entry, when that class is executed
 1. How to invoke a static method
 1. How to create a simple ```JFrame``` to render UI on the desktop
