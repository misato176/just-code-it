package ex030902;

public class SplitStringExample {
    public static void main(String[] args) {
        String sentense = "The scientific name persica, along with the word \"peach\" itself and its cognates in many European languages, derives from an early European belief that peaches were native to Persia (modern-day Iran).";
        String[] words = sentense.split(" ");
        
        for(String word : words){
            System.out.println(word);
        }
        
    }
    
}
