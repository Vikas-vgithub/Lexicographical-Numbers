
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        lexicalOrderHelper(1, n, list);
        return list;
    }

     public void lexicalOrderHelper(int current, int n, List<Integer> result) {
        if (current > n) {
            return;
        }

        result.add(current);
        lexicalOrderHelper(current * 10, n, result);

        if (current % 10 != 9) {
            lexicalOrderHelper(current + 1, n, result);
        }
     }    
}
