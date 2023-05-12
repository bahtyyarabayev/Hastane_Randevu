/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahtyyar_abayev_final;

import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException; 
import java.io.PrintWriter;

public class Bahtyyar_Abayev_Final {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException
    {
      
       try
           {
             String okunan=null;
             File dosyaAdi=new File("C:\\Users\\Bahtyyar\\Desktop\\Java Uygulama\\Bahtyyar_Abayev_Final\\src\\bahtyyar_abayev_final\\asilistesi.txt.txt");
             Scanner okuyucu=new Scanner(dosyaAdi);
             while(okuyucu.hasNextLine())
             {
               okunan=okuyucu.nextLine();
      
             }
            }
       catch(FileNotFoundException e)           
           {
           System.out.println("Bir hata ile karşılaşti");
               e.printStackTrace();
           }   
      Scanner input=new Scanner (System.in);
      int islem=0;
      while(islem!=4)
      {  
       System.out.println("             MENÜ              ");
       System.out.println("_______________________________");
       System.out.println("Yeni kayit için             1: ");
       System.out.println("Randevu almak için          2: ");
       System.out.println("Randevuları listelemek için 3: ");
       System.out.println("Çikiş için                  4: ");
      
       
       System.out.print("LÜTFEN SEÇİMİNİZİ GİRİNİZ:");
       islem=input.nextInt();
       
       
          switch (islem) {
              case 1:
                  PrintWriter cikti=null;
       String dosya="C:\\Users\\Bahtyyar\\Desktop\\Java Uygulama\\Bahtyyar_Abayev_Final\\src\\bahtyyar_abayev_final\\asilistesi.txt.txt";
       try
        {
            cikti=new PrintWriter(new FileOutputStream(dosya,true));
        }
       catch(FileNotFoundException hata)
               {
                   System.out.println("hata oldu");
                   System.exit(0);
               }
                     Scanner klavye=new Scanner(System.in);
                     System.out.print("Adı ve Soyadı:");
                     String cumle=klavye.nextLine();
                     System.out.print("Öğrenci Numara Giriniz:");
                     int num=klavye.nextInt();
                     cikti.println(num+","+" "+cumle+",");
                     cikti.close();
                     System.out.println("Kayıdınız Başarılı Bir Şekilde Yapılmıştır");
                     break;
              case 2:
                  System.out.println("Öğrenci No:898656744");
                  System.out.println("Bahtyyar Abayev:");
                  Scanner imput=new Scanner (System.in);
                  int asi;
                  System.out.println("             AŞI TERCİHİ"              );
                  System.out.println("_______________________________");
                  System.out.println("Biontech             :1 ");
                  System.out.println("Sinovac              :2 ");
                  System.out.println("Sputnik              :3 ");
                  asi=imput.nextInt();
                  switch(asi){
                      case 1:
                          Scanner impu=new Scanner (System.in);
                          System.out.println("Lütfen Aşi Tarihini Giriniz:");
                          String tar =impu.next();
                          System.out.println("Randevunuz Oluşturulmuştur...");
                          break;
                      case 2:
                          Scanner imp=new Scanner (System.in);
                          System.out.println("Lütfen Aşi Tarihini Giriniz:");
                          String tari=imp.next();
                          System.out.println("Randevunuz Oluşturulmuştur...");
                          break;
                      case 3:
                          Scanner im=new Scanner (System.in);
                          System.out.println("Lütfen Aşi Tarihini Giriniz:");
                          String tarih=im.next();
                          System.out.println("Randevunuz Oluşturulmuştur...");
                          break;
                  } break;
              case 3:
                  System.out.println("Sıra No   Öğrenci Numrası   Adı Soyadı        Aşı Firması      Tarih");
                  System.out.println("_______________________________________________________________________");
                  System.out.println("  1        203908677        Bahtyyar Abayev    Biontech      21.06.2021");
                  System.out.println("  2        203908677        Bahtyyar Abayev    Sinovac       22.06.2021");
                  System.out.println("  3        203908677        Bahtyyar Abayev    Sputnik       23.06.2021");
                  break;
              case 4:
                  System.out.println("Sistemden Çıkılyor");
                  break;
              default:
                  break;
          }
           
    }
        }
   
    } 

