class Solution {
    public String sortVowels(String s) {
        // Step 1: Collect all vowels
        List<Character> vowels = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels.add(ch);
            }
        }

        // Step 2: Sort vowels by ASCII
        Collections.sort(vowels);

        // Step 3: Replace vowels in original string
        StringBuilder sb = new StringBuilder(s);
        int j = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (isVowel(sb.charAt(i))) {
                sb.setCharAt(i, vowels.get(j++));
            }
        }

        return sb.toString();
    }

    // Helper function to check vowel
    private boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
