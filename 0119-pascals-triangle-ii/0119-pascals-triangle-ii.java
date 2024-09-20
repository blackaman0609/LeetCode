class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);

            for (int j = 1; j < i; j++) {
                nextRow.add(currentRow.get(j - 1) + currentRow.get(j));
            }

            nextRow.add(1);
            currentRow = nextRow;
        }

        return currentRow;
    }
}