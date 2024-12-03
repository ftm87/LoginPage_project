package loginPageApp;

   //2. adim :user nesnesini olusturalim

    //POJO:Plain Old Java Object
    //field:private
    //constructor
    //getter-setter
    //toString

public class User {

    //ad-soyad,username(mail),password

    private  String name;//null

    private String email;//null

    private String password;//null

    //user olusturuldugunda fieldlarin set edilmesi icin parametreli construter

    public  User(String name,String email, String password){
       this.name=name;
       this.email=email;
       this.password=password;
   }

   //getter- setter

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //3.adim : uye olma methodu(bunu bu sekilde yapabiliriz ama daha best olmasi icin baska classda yapalim

   // public void register (){



}
