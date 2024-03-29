class Solution {
    public String frequencySort(String s) {
        // Count frequency of characters
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Create a list of characters sorted by frequency
        List<Character> characters = new ArrayList<>(frequencyMap.keySet());
        characters.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // Build the sorted string
        StringBuilder sortedString = new StringBuilder();
        for (char c : characters) {
            int frequency = frequencyMap.get(c);
            for (int i = 0; i < frequency; i++) {
                sortedString.append(c);
            }
        }

        return sortedString.toString(); 
    }
}