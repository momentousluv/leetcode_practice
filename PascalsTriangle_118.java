package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
    public static void main(String[] args) {
        PascalsTriangle_118 pascalsTriangle_118 = new PascalsTriangle_118();
        List<List<Integer>> pascalsTriangleList = pascalsTriangle_118.generate(5);

        for(int i = 0; i < pascalsTriangleList.size(); i++) {
            for (int j = 0; j < pascalsTriangleList.get(i).size(); j++) {
                System.out.print(pascalsTriangleList.get(i).get(j) + ", ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangleList = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> tempSubList = new ArrayList<>(i + 1);
            for(int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i) {
                    tempSubList.add(j,1);
                }
                else {
                    int pascalsGenerated = triangleList.get(i - 1).get(j - 1) + triangleList.get(i - 1).get(j);
                    tempSubList.add(j, pascalsGenerated);
                }
            }
            triangleList.add(tempSubList);
        }

        return triangleList;
    }
}
