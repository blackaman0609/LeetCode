class Solution {
    public int singleNumber(int[] arr) {
        Set<Integer> s = new HashSet<>();

        for (int i : arr) {
            // Add if not present, else remove if already present
            if (s.contains(i)) {
                s.remove(i);
            } else {
                s.add(i);
            }
        }

        // At this point, the HashSet will have only one element
        // Convert the Set to an Array and return the single element
        return s.iterator().next();
    }
}


// class Solution {
//     public int singleNumber(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             int count = 0;
//             for (int j = 0; j < n; j++) {
//                 if (arr[j] == arr[i] && i!=j) {
//                 count++;
//                 break;
//                 }
//             }
//             if (count == 0) {
//                 return arr[i];
//             }
//         }
//         return -1;
//     }
// }

















