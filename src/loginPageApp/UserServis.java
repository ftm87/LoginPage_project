package loginPageApp;

//3.adim userla iliskili metod

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserServis {

     Scanner scan =new Scanner(System.in);

     // List<User> users=new ArrayList<>();--->practis


    Map<String,Integer> userInfo=new HashMap<>();// burda K:email,V:password  bilglerini saklayacagiz...bircok datayi saklamak icin kullanacagimiz Map lerdir


    //4.adim:uye olma methodu
    public void register (){
        System.out.println("Ad -Soyad giriniz: ");
        String name = scan.nextLine();

        //email gecerlimi?gecersiz ise tekrar sorulmalai
        String mail;
        boolean isValid;//T;gecerli F;gecerli degil dongu devam


        do {

            System.out.println("Email giriniz: ");
            mail =scan.nextLine();

            //gecerlimi
           isValid= validateEmail(mail);

           //mail unique olmali :bu mail ile daha once kayitli kullanici var mi

            boolean isExistEmail=this.userInfo.containsKey(mail);
            if (isExistEmail){
                System.out.println("Bu email ile kayitli kullanici var");
                isValid=false;
            }

        }while (!isValid);


        //gecerli bir sifre olusturma
        String password;
        boolean isValidPassword;


        do {
            System.out.println("Sifrenizi olusturunuz: ");
            password=scan.nextLine();

           isValidPassword =validePassword(password);

        }while (!isValidPassword);

        //user olusturalim
        User user =new User(name,mail,password);

        //userin bilgilerini userinfo ya ekleyelim

        this.userInfo.put(user.getEmail(),user.getPassword());
        System.out.println("Sayin "+user.getName()+",tebrikler ,kayit islemi basari");


    }

    //5. adim :email dogrulama metodu:odev
    private boolean validateEmail(String mail){
        return  true;
    }

    //6. adim password  dogrulama metodu:odev
    private boolean validePassword(String password){
        return true;
    }

}