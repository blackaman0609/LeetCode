class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(1);
                } else {
                    int aboveLeft = pascalTriangle.get(i - 1).get(j - 1);
                    int aboveRight = pascalTriangle.get(i - 1).get(j);
                    currentRow.add(aboveLeft + aboveRight);
                }
            }
            
            pascalTriangle.add(currentRow);
        }
        
        return pascalTriangle;
    }
}