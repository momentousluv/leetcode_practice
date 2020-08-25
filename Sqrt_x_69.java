package leetcode;

public class Sqrt_x_69 {
    public static void main(String[] args) {
        Sqrt_x_69 sqrt_x_69 = new Sqrt_x_69();
        int resultX = sqrt_x_69.mySqrt(2);
        System.out.println("resultX: " + resultX);
    }

    public int mySqrt(int x) {
        if(x == 1) {
            return 1;
        }
        for(int i = 1; i <= x; i++) {
            if(Math.pow(i, 2) > x && Math.pow(i - 1, 2) <= x) {
                return i - 1;
            }
        }

        return 0;
    }
}
