public int countUniqueWords(String sentence) {

    String[] words = sentence.split(" ");

    int count = 0;

    for (int i = 0; i < words.length; i++) {

        for (int j = i + 1; j < words.length; j++) {

            if (words[i].equals(words[j])) {

                count++; 
            }
        }
    }
    return count;
}

