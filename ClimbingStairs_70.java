package leetcode;

public class ClimbingStairs_70 {
    public static void main(String[] args) {
        ClimbingStairs_70 climbingStairs_70 = new ClimbingStairs_70();
        int resultWay = climbingStairs_70.climbStairs(45);
        System.out.println("resultWay: " + resultWay);
    }

    //climb 1 step or 2 step at one time
    public int climbStairs(int n) {
        if(n == 5) {
            return 8;
        }
        else if(n == 4) {
            return 5;
        }
        else if(n == 3) {
            return 3;
        }
        else if(n == 2) {
            return 2;
        }
        else if(n == 1) {
            return 1;
        }
        int resultWay = climbStairs(n - 1) + climbStairs(n - 2);

        return resultWay;
    }
}
