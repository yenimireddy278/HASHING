
package Demo;
import java.util.*;

public class GroupAnagrams{
    public static List<List<String>> groupAnagrams(String[] words) {
        // 1. Initialize the map to group anagrams
        HashMap<String, List<String>> map = new HashMap<>();
        
        // 2. Iterate through each word in the input array
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            // Convert the sorted character array back into a String key
            String sortedWord = new String(chars);
            String key = new String(chars);
            
            // If the key doesn't exist, create a new ArrayList, then add the word
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        
        // Return all grouped lists as a list of lists
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {
            "eat", "tea", "tan",
            "ate", "nat", "bat"
        };
        
        System.out.println(groupAnagrams(words));
    }
}
            
