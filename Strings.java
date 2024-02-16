import java.util.Scanner;
public class Strings {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //scan inputan dari user
        String A;
        String B;

        A = scan.nextLine();
        B = scan.nextLine();
        scan.close(); //menutup scanner
        
        System.out.println("---------------");    //menampilkan batas antara hasil scan dan ouput

        //menghitung panjang string A dan string B
        int lengthA = A.length();
        int lengthB = B.length();

        //menampilkan jumlah karakter string A dan string B
        System.out.println(lengthA + lengthB);

        //membandingkan string A dan String B
        if(A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
            //menggabungkan string A dan string B dengan Spasi diantaranya
            String mergedInput = A + " " + B;

            String[] words = mergedInput.split(" ");

            // Membuat StringBuilder untuk menyusun string output
            StringBuilder output = new StringBuilder();
            for (String word : words) 
            {
            // Mengonversi huruf pertama setiap kata menjadi huruf besar
                output.append(Character.toUpperCase(word.charAt(0)))    //Mengonversi karakter pertama menjadi huruf besar
                      .append(word.substring(1))    //Menambahkan sisa kata setelah huruf pertama
                      .append(" ");    //Menambahkan spasi setelah setiap kata
             }
             System.out.println(output.toString().trim());    //Menampilkan output dengan menghapus spasi tambahan di ujung string
    }
}

