import java.util.Scanner;

public class ProfanityFilter 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String[] swearWordsArr = sc.nextLine().split(" ");

        while(sc.hasNextLine())
        {
            String currentLine = sc.nextLine();
            String[] currentLineWords = currentLine.split(" ");
            // Filter the words in the line call filterMethod with 2 args - swearwords +  
            for (int i = 0; i < currentLineWords.length; i++)
            {
                currentLineWords[i] = filterWords(currentLineWords[i], swearWordsArr);
            }
            System.out.println(String.join(" ", currentLineWords));
        } sc.close();
    }
    public static String filterWords (String currentLinewords, String[] swearWordsArr)
    {

        return currentLinewords;
    }
    
}
