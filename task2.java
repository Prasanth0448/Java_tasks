

//Task2
//// for the given input do the following operatons.
//1.Duplicates words
//2.Vowels count
//3.Reverse the sentence
//
//
//example:
//
//Inpute: This sentence has some duplicates that repeats again and again
// input:1
//  output:again
//
//  input:2
//  output:22
//
//  input:3
//  output: siht ecnetnes sah emos setacilpud taht staeper niaga dna niaga


// Duplicates words:


import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String input = "this sentence has some duplicates that repeats again and again";

        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (String word : input.split(" ")) {
            if (!uniqueWords.add(word)) {
                duplicateWords.add(word);
            }
        }

        System.out.println("Duplicate words: " + duplicateWords);
    }
}

/// Vowels Count:
 
public class Main {
    public static void main(String[] args) {
        String input = "this sentence has some duplicates that repeats again and again";
        int vowelCount = 0;

        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelCount++;
            }
        }

        System.out.println("Vowel count: " + vowelCount);
    }
}







/// Reverse the sentence:


class StringFormatter {
static String reverseWord(String str){
    String words[]=str.split("\\s");
    String reverseWord="";
    for(String w:words){
        StringBuilder sb=new StringBuilder(w);
        sb.reverse();
        reverseWord+=sb.toString()+" ";
    }
    return reverseWord.trim();
}
}
class TestStringFormatter {
public static void main(String[] args) {
    System.out.println(StringFormatter.reverseWord("this sentence has some duplicates that repeats again and again"));

    }
}
