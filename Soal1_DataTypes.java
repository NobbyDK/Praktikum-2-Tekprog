/*
 * Nama  : Nobby Dharma Khaulid
 * Kelas : 1A-D4 Teknik Informatika
 * NIM   : 231524020
 * Tujuan: program untuk menghasilkan deskripsi tipe data
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Soal1_DataTypes 
{
    public static void main(String[] args) 
    {
      Scanner scan = new Scanner(System.in);  //membuat objek scanner untuk inputan

      System.out.print("Jumlah Data = ");
      int Jml = scan.nextInt();   //Membaca jumlah data yang akan dimasukkan
      scan.nextLine();    //Membersihkan newline character

      //Mendefinisikan array untuk menyimpan data
      String Data[] = new String[Jml];
      for (int i = 0; i < Jml; i++)
      {
        Data[i] = scan.nextLine();    //Memasukkan data ke dalam array
      }
      System.out.println("---------------------");
      for (int i = 0; i < Jml; i++) 
      {
        BigInteger konversiData = new BigInteger(Data[i]);     // Mengonversi string menjadi BigInteger

         //Memeriksa apakah nilai/data yang diinput termasuk kedalam rentang/range tipe data primitif
        if (konversiData.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0
            || konversiData.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 )
            {
              System.out.println(Data[i] + " Can't be fitted anywhere");
            }
            else
            {
              System.out.println(Data[i] + " Can be fitted in: ");
            }

            //Mengecek tiap tipe data untuk menampung nilai yang diinputkan user
            if (konversiData.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0
                && konversiData.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 )
                {
                  System.out.println("*Byte");
                }
            if (konversiData.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0
                    && konversiData.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 )
                {
                  System.out.println("*Short");
                }
            if (konversiData.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0
                    && konversiData.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 )
                {
                  System.out.println("*Int");
                }
            if (konversiData.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0
                    && konversiData.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 )
                {
                  System.out.println("*Long");
                }    
        }scan.close();    //menutup scanner
      }
}  

    
