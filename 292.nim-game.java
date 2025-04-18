/*
 * @lc app=leetcode id=292 lang=java
 *
 * [292] Nim Game
 * 
You are playing the following Nim Game with your friend:

Initially, there is a heap of stones on the table.
You and your friend will alternate taking turns, and you go first.
On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
The one who removes the last stone is the winner.
Given n, the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false.

 */

// @lc code=start
class Solution {
    public boolean canWinNim(int n) {
        // return canWin(n, true, 1) || canWin(n, true, 2) || canWin(n, true, 3);

        return n % 4 != 0;

    }

    private boolean canWin(int n , boolean player, int steps) {
       if(steps == n) {
        return true;
       }
       else if (steps > n) {
        return false;
       }

       boolean step1 = canWin(n, !player, steps + 1);
       boolean step2 = canWin(n, !player, steps + 2);
       boolean step3 = canWin(n, !player, steps + 3);

       return !(step1 || step2 || step3 );


    }

}
// @lc code=end

