import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondProject {

    public static void main(String[] args) {

        String sentence;
        System.out.println("please enter the sentence");
        Scanner scanner = new Scanner(System.in);
        sentence = scanner.nextLine();


        String[] words = sentence.split(" ");
        System.out.println(words.length);
        int counts[] = new int[words.length];
        List<String> word = new ArrayList<String>();



        for (int i = 0; i < words.length; i++) {
            if (word.contains(words[i]) == false) {
                word.add(words[i]);
            }
        }

        for (String k : word) {
            int sayac=0;
            for (int i = 0; i < words.length; i++) {
                if (k.contains(words[i])) {
                    sayac++;
                }
            }
            System.out.println(k+ " " + sayac + " kere tekrarlandı");



        }
    }
}






