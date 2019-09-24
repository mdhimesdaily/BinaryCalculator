## This project is a Binary Calculator for the CS 495 Capstone class

This project was created by Michael Himes, Brenden Jones, and Evan Witous. The tasks were divided up as follows:

Michael Himes:
* Created UI
* Created Converter class
* Wrote, debugged and refactored Controller

Brenden Jones:
* Created single variable math functions
* Wrote, debugged and refactored Controller

Evan Witous:
* Created dual variable math functions
* Created ReadMe
* Wrote, debugged and refactored Controller

## Screenshot of project:
![A screenshot of our software](https://github.com/mdhimesdaily/BinaryCalculator/blob/Development/Capture.PNG)

## Manual

The application is quiet simple, it is a basic calculator that works with binary numbers:
* If you press the button 1 or 0 it will add that number to the textbox like an ordinary calculator as long as there aren't more than 5 digits in the textbox.
* When you press one of the mathmatical operator buttons it will store the value of the number you have already entered assuming that you have entered it. If you have not entered a number into the text box, then nothing will occur.
* Once you have selected your mathmatical operator you can then enter a second number assuming you have selected a dual variable operator.
* If you try to do an operation that is not valid, such as dividing by zero or generating a negative number, then the calculator will display an error message to you. This message will automatically be cleared once you try to press any of the buttons.
* If you enter a number into the calculator, press a mathmatical operator button, then attempt to press another mathmatical operator button the calculator will ignore the second operator that was pressed.
* If you enter a number into the calculator, press a mathmatical operator button, then attempt to press the equal button without entering a second number the calculator will carry out the requested operation with the assumption that the second number is zero.
