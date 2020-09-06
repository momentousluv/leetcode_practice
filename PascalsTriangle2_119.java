package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2_119 {
    public static void main(String[] args) {
        PascalsTriangle2_119 pascalsTriangle2_119 = new PascalsTriangle2_119();
        List<Integer> pascalsTriangleList = pascalsTriangle2_119.getRow(0);

        for(int i = 0; i < pascalsTriangleList.size(); i++) {
            System.out.print(pascalsTriangleList.get(i) + ", ");
        }
    }

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangleList = new ArrayList<>();

        for(int i = 0; i < rowIndex + 1; i++) {
            List<Integer> tempSubList = new ArrayList<>();
            for(int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i) {
                    tempSubList.add(1);
                }
                else {
                    int pascalTriangleNum = triangleList.get(i -1).get(j - 1) + triangleList.get(i -1).get(j);
                    tempSubList.add(pascalTriangleNum);
                }
            }
            triangleList.add(tempSubList);
        }

        return triangleList.get(rowIndex);
    }
}
