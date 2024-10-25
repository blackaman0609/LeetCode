import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        // Sort the folder paths lexicographically
        Arrays.sort(folder);
        
        List<String> result = new ArrayList<>();
        String prev = "";  // This keeps track of the last valid folder added to result
        
        for (String current : folder) {
            // Check if `current` is a subfolder of `prev`
            if (prev.isEmpty() || !current.startsWith(prev + "/")) {
                result.add(current);
                prev = current;  // Update `prev` to the latest valid folder
            }
        }
        
        return result;
    }
}
