class Solution {

    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        solve(n, 0, 0, "", result);
        return result;
    }

    public void solve(int n, int op_count, int cl_count, String answer, ArrayList<String> result) {
        if (op_count == n && cl_count == n) {
            result.add(answer);
            return;
        }

        if (op_count < n) {
            solve(n, op_count + 1, cl_count, answer + "(", result);
        }

        if (op_count > cl_count) {
            solve(n, op_count, cl_count + 1, answer + ")", result);
        }
    }
}
