   import java.util.Scanner;
class ScannerClass1{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        // sc.nextLine(); // Consume the newline character
        
        System.out.print("Enter a word: ");
        String word = sc.next();
        
        // sc.nextLine(); // Consume the newline character
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        System.out.println("Number: " + num);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);
    }
}
