package Week2.day1;

public class Reverseoddwords {

    public static String reverseOddPositionWords(String str) {
        String[] words = str.split(" ");
        for (int i = 1; i < words.length; i += 2) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ", words);
        
        
    }
    public static void main(String[] args) {
        String test = "I am a software tester";
        System.out.println(reverseOddPositionWords(test));
    }

}

