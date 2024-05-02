Problem 1

Random number selector - Write a method that returns a random number from a list of numbers passed in the argument. The method header is specified as follows:

public static int getRandom(int... numbers)

Write a test program that prompts the user to enter the number set for this method. Then, invoke the method to return a random number from that list and display that number.  Then hard code three example of calling this method with different lengths of parameters.

Make sure the values generated in the code/program are correct. 

Problem 2

Sort students - Write a program that prompts the user to enter the number of students, the students’ names, and the students' scores.  Then, it prints student names in decreasing order of their scores. Assume the name is a string without spaces.  You can use the Scanner’s next() method to read a name.

Make sure the values generated in the code/program are correct.

Problem 3

Bubble sort - Write a sort method that uses the bubble-sort algorithm. The bubble-sort algorithm makes several passes through the array. On each pass, successive neighboring pairs are compared. If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. The technique is called a bubble sort or sinking sort because the smaller values gradually “bubble” their way to the top, and the larger values “sink” to the bottom. Write a test program that generates a random set of double numbers, displays the unsorted numbers, invokes the method, and displays the sorted numbers.  The number of numbers to use should be randomly picked from 10 to 100.

Output Example:

unsorted: 1.2, 0.9, 3.4, 9.6, 5.6, 2.3
sorted: 0.9, 1.2, 2.3, 3.4, 5.6, 9.6

Make sure the values generated in the code/program are correct.  The output does not have to match the example 100%.

Problem 4

The game hangman - Write a hangman game that randomly picks a word and prompts the user to guess one letter at a time, as presented in the output example below. Each letter in the word is displayed as an asterisk. The actual letter is displayed when the user makes a correct guess. When the user finishes a word, display the number of misses and ask the user whether to continue to play with another word. Declare an array to store the words as follows:

// Add any words you wish in this array
String[] words = {"write", "that",...};

Output Example:

(Guess) Enter a letter in word ******* > p
(Guess) Enter a letter in word p****** > r
(Guess) Enter a letter in word pr**r** > p
p is already in the word
(Guess) Enter a letter in word pr**r** > o
(Guess) Enter a letter in word pro*r** > g
(Guess) Enter a letter in word progr** > n
n is not in the word
(Guess) Enter a letter in word progr** > m
(Guess) Enter a letter in word progr*m > a
The word is program. You missed 1 time
Do you want to guess another word? Enter y or n >

Make sure the values generated in the code/program are correct.  The output does not have to match the example 100%.