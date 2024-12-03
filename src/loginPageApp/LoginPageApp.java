package loginPageApp;


    /*

Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

         menü: kullanıcıya işlem seçimi için menü gösterilir.

         üye olma(register): kullanıcıdan ad-soyad, email ve şifre bilgileri alınız.
                             email ve şifre birer listede tutulur.
                             aynı email kabul edilmez.

         giriş(login): email ve şifre girilir.
                       email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                       email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

         email validation: boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

         password validation: boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli
*/


import java.util.Scanner;

public class LoginPageApp {
    public static void main(String[] args) {
        start();
    }


    //1.Adim

    private  static void start(){
        Scanner scanner=new Scanner(System.in);

        int select ; //CIKIS icin 0 secmesini onerelim

        // kullaniciya bir menu sunucam

        do {
            System.out.println("=== TECHPRO EDUCATION===");
            System.out.println("1. Uye ol");
            System.out.println("2- Giriş Yap");
            System.out.println("0-ÇIKIŞ");
            System.out.print("Seçiminiz : ");
            select=scanner.nextInt();//0,1,2 burda kullanicidan aldigimiz secenegi okuyup selcte yukluyoruz

         //simdi durumlri degerlendirelim

            switch (select){
                case 1:
                    //uye olma
                    break;
                case 2:
                    //giris yapma
                    break;
                case 0:
                    System.out.println("iyi gunler");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz tekrar deneyiniz");
                 break;

            }

        }while (select !=0);// select! =0 olmadigi surece dongu devam edecek

        }
    }









