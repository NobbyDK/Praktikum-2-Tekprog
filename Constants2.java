public class Constants2 
{
    public static final double CM_PER_INCH = 2.54;      //Mendefinisikan konstanta CM_PER_INCH yang bernilai 2.54
        public static void main(String[] args) 
        {
            double paperWidth = 8.5;        //Mendeklarasikan variabel double paperWidth dengan nilai 8.5
            double paperHeight = 11;         //Mendeklarasikan variabel double paperHeight dengan nilai 11
            System.out.println("Paper size in centimeters: " + paperWidth*CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);        //menghitung ukuran paper kedalam cm dan menampilkannya
        }
}

