public class Operators_1 
{
    static short methodOne(long l)      //Mendefinisikan methodOne dengan parameter long
    {
        int i = (int) l;            //Mengonversi nilai long menjadi int dan menyimpannya di variabel i
        return (short)i;            //Mengembalikan nilai short dari variabel i yang dihasilkan dari nilai int
    }
    public static void main(String[] args)
    {
        double d = 10.25;             //Mendeklarasikan variabel double d dengan nilai 10.25
        float f = (float) d;            // Mengonversi nilai double d dan menyimpannya di variabel float f
        byte b = (byte) methodOne((long) f);    //Memanggil methodOne dengan argumen nilai float f yang dikonversi menjadi long
                                                //Lalu mengonversi nilai yang dikembalikan dari methodOne menjadi byte
        System.out.println(b);      //Menampilkan nilai byte b
    }
}
