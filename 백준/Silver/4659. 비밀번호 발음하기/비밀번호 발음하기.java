import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean test2(String str) {
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                vowel++;
                consonant = 0; // Reset consonant count
            } else {
                consonant++;
                vowel = 0; // Reset vowel count
            }

            if (vowel == 3 || consonant == 3) {
                return false;
            }

            if (i > 0 && current == str.charAt(i - 1) && current != 'e' && current != 'o') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int check = 0;
            String str = br.readLine();
            if (str.equals("end")) {
                break;
            } else {
                // 1번 조건
                if (!(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u"))) {
                    check = 1;
                } else {
                    // 1+2번 조건
                    if (!test2(str)) {
                        check = 1;
                    } else {
                        // 1+2+3 조건
                        for (int i = 0; i < str.length() - 1; i++) {
                            if (str.charAt(i) == str.charAt(i + 1)) {
                                if (str.charAt(i) != 'e' && str.charAt(i) != 'o') {
                                    check = 1;
                                }
                            }
                        }
                    }
                }
            }

            if (check == 0) {
                System.out.println("<" + str + ">" + " is acceptable.");
            } else {
                System.out.println("<" + str + ">" + " is not acceptable.");
            }
        }
    }
}