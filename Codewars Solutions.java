/*Is this a triangle?
Implement a method that accepts 3 integer values a, b, c. The method should return true if a triangle can be built with the sides of given length and false in any other case.

Solution:
Simple if you know the triangle inequality therom where the sum of two sides must be longer than the sum of the third:
*/
public static boolean isTriangle(int a, int b, int c){
    return a + b > c && a + c > b && c + b > a;
  }