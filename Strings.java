import java.util.Scanner;
public class Strings {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String A;
        String B;

        A = scan.nextLine();
        B = scan.nextLine();
        scan.close();
        
        System.out.println("---------------");

        int lengthA = A.length();
        int lengthB = B.length();

        System.out.println(lengthA + lengthB);

        if(A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
            String mergedInput = A + " " + B;

            String[] words = mergedInput.split(" ");

            StringBuilder output = new StringBuilder();
            for (String word : words) 
            {
            // Mengonversi huruf pertama setiap kata menjadi huruf besar
                output.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
             }
             System.out.println(output.toString().trim());
    }
}

