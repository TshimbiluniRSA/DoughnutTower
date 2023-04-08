# DoughnutTower

Assignment 5 2022: DoughnutTower

You are going to write a DoughnutTower game for a toddler!
The aim of the game is to stack 5 doughnuts of the same colour (red/blue/green).

##The purpose of this DoughnutTower game assignment is to:
• Use the provided MyArrayList class and add a method.
• Write a StackAsMyArrayclass with the typical methods and two additional methods.
• Write an implementation (test) class for the game.

In order to check if a toddler has stacked the 5 doughnuts successfully, one needs to check if all the doughnuts in the tower are the same colour.

##• Find attached the MyArrayList class. Make the following addition in the MyArrayList class (Please use the given naming conventions):
###A generic version of this method:
• public boolean checkUniform()
The method should return true if all the doughnuts are identical.
• Make sure you have an accessor for the instance variable called:
public int getSize()

##• Write the StackAsMyArrayList class with:
• Push(), Pop(), toString()
• We are going to add 2 non-typical stack methods (just to make this game work)
• public int getStackSize() which calls the getSize() method of the MyArrayList class
• public boolean checkStackUniform() which calls the checkUniform() method of the MyArrayList class

HINT: The toString() of the stack class calls the toString() of the MyArrayList class
##• Write an implementation (test) class for the game.
• You can use the accompanying output as a guideline.
