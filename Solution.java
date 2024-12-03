class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int spaceIndex = 0; // Pointer for the spaces array
        
        for (int i = 0; i < s.length(); i++) {
            // If the current index matches the space index, add a space
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                result.append(" ");
                spaceIndex++;
            }
            // Append the current character
            result.append(s.charAt(i));
        }
        
        return result.toString();
    }
}
