/*Is this a triangle?
Implement a method that accepts 3 integer values a, b, c. The method should return true if a triangle can be built with the sides of given length and false in any other case.

Solution:
Simple if you know the triangle inequality therom where the sum of two sides must be longer than the sum of the third:
*/
public static boolean isTriangle(int a, int b, int c){
    return a + b > c && a + c > b && c + b > a;
  }


/*Sock Merchant
John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Rephrased question:
Return the number of integer pairs in an array.
Solution:
Iterate over array, checking at each index if the int is in a set. If no, add it to the set. If yes, then it's a pair, then increment the pair_count.
*/
 static int sockMerchant(int n, int[] ar) {
 	int pair_count = 0
 	Set<Integer> set = new Hashset();

 	for (int i = 0; i < ar.length; i++){
 		if (!set.contains(ar[i])){
 			set.add(ar[i])
 			} else {
 			set.remove(ar[i])
 			pair_count++
 			}
 		}
 		return pair_count
    }

/*Most frequent integer in an array
Find the most frequent integer in an array.

Solution:
Iterate through array, adding each value to a hash table and assigning it a count value.
*/
public static Integer mostFreqent(int[] givenArray) {
    Integer maxCount = -1; Integer maxItem = null;
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    for (int i : givenArray) {
        if (count.containsKey(i)) {
            Integer newVal = count.get(i) + 1;
            count.put(i, newVal);
        } else {
            count.put(i, 1);
        }
        if (count.get(i) > maxCount) {
            maxCount = count.get(i);
            maxItem = i;
            }
        }
    return maxItem;
}