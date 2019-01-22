import java.util.Scanner;

public class WordCounter
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sentence and see how many words you typed.");
        String sentence = scan.nextLine();

        String[] allWordsInSentence = sentence.split(" ");
        int numberOfWords = allWordsInSentence.length;

        System.out.println(numberOfWords);
    }
}
