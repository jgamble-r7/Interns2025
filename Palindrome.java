public boolean isPalindrome(String word) {

    String reversed = "";

    for (int i = 0; i <= word.length(); i++) { 

        reversed += word.charAt(i);

    }

    return reversed.equals(word);
}
