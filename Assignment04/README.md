Problem 1

Area of a Pentagon: Write a program that prompts the user to enter the length from the center of a pentagon to a vertex and compute the area of the pentagon.

The formula for computing the area of a pentagon is Area = (5 * s * s)/(4 * tan(PI/5), where s is the length of a side. The side can be computed using the formula s = 2 * r * sin(PI/5), where r is the length from the center of a pentagon to a vertex. The results should round up and only show two digits after the decimal point.

Output Example:

Enter the length from the center to a vertex: 5.5
The area of the pentagon is 71.92

Make sure the values generated in the code/program are correct.  The output does not have to match the example 100%.

Problem 2

Great Circle Distance: The great circle distance is the distance between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points. The great circle distance between the two points can be computed using the following formula:

d = radius * arccos(
sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)
)

Write a program that prompts the user to enter the latitude and longitude of two
points on the earth in degrees and displays its great circle distance. The average
radius of the earth is 6,371.01 km. Note you need to convert the degrees into radians
using the Math.toRadians() method since the Java trigonometric methods use
radians. The latitude and longitude degrees in the formula are for north and west.
Use negative to indicate south and east degrees.

Output Example:

Enter point 1 (latitude and longitude) in degrees: 39.55 −116.25
Enter point 2 (latitude and longitude) in degrees: 41.5 87.37
The distance between the two points is 10691.79183231593 km

Make sure the values generated in the code/program are correct.  The output does not have to match the example 100%.

Problem 3

Vehicle Plate Numbers: Assume that a vehicle plate number consists of three uppercase letters followed by four digits or four digits followed by three uppercase letters.  The random characters should not use I, O, or Q in the plate number. Write a program to generate a plate number.

Output Example:

Plate Number: 4598PLK
Plate Number: SRT9725

Make sure the values generated in the code/program are correct.  The output does not have to match the example 100%.

Problem 4

(Find the ASCII code and Unicode of a character) Write a program that receives a character and displays its ASCII code (an integer between 0 and 127)  and
displays its Unicode. 

Output Example:

Enter a character: E
The ASCII code for character E is 69
The Unicode for the character E is 69

Make sure the values generated in the code/program are correct.  The output does not have to match the example 100%.