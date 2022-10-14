public class Smallest {
    public static void main(String [] args) {
        String[] words = {"roma", "hello", "world", "bye", "nope"};
        smallest(words);
        System.out.println("The shortest word is: " + smallest(words));
    }

    public static String smallest(String[] words) {
        String n = words[0];
        for (int i = 1 ; i < words.length ; i++) {
            if (words[i].length() < n.length()) {
                n = words[i];
            }
        }
        return n;
    }
}