class Solution {

    public int getSum(int a, int b) {

        // Repeat until there is no carry
        while (b != 0) {

            // Calculate carry
            int carry = (a & b) << 1;

            // Add without carry
            a = a ^ b;

            // Update b with carry
            b = carry;
        }

        return a;
    }
}


/*

Suppose:

a = 2
b = 3

Binary:

2 = 0010
3 = 0011
First Iteration

Carry:

0010
0011
----
0010

Shift left

0100 = 4

Sum without carry:

0010
0011
----
0001 = 1

Now:

a = 1
b = 4
Second Iteration

Carry:

0001
0100
----
0000

Sum:

0001
0100
----
0101 = 5

Now:

a = 5
b = 0

Loop stops.

Answer:

5

*/

