package strings;

public class morseovka {
    public static void main(String[] args) {
        String [] morsecode = {
                ".-", //A
                "-...", //B
                "-.-.", //C
                "-..", //D
                ".", //E
                "..-.", //F
                "--.", //G
                "....", //H
                "..", //I
                ".---", //J
                "-.-", //K
                ".-..", //L
                "--", //M
                "-.", //N
                "---", //O
                ".--.", //P
                "--.-", //Q
                ".-.", //R
                "...", //S
                "-", //T
                "..-", //U
                "...-", //V
                ".--", //W
                "-..-", //X
                "-.--", //Y
                "--.." //Z
        };
        char[] alphabet = "abcdefghijklmnopqrstuvwxy".toCharArray();

        String input = "secret";
        String morseinput = "";

        for (int i = 0; i < input.length(); i++) {
            char currentchar = input.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (currentchar == alphabet[j]){
                    morseinput += morsecode[j];
                    break;
                }

            }
        }
        System.out.println("Input:" + input);
        System.out.println("Encoded:" + morseinput);
    }
}
