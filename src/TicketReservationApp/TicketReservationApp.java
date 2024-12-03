package TicketReservationApp;

import java.util.Scanner;

/*
Project: Bilet Rezervasyon ve Bilet Fiyatı Hesaplama Uygulaması

    1- Uygulama mesafe ve kurallara göre otobüs bileti fiyatı hesaplar sonuç olarak bilet bilgisini verir
    2- Kullanıcıdan     mesafe (KM),
                        yolcu adı, yaşı ,
                        yolculuk tipi (Tek Yön, Gidiş-Dönüş)
                        ve koltuk no bilgilerini alınır.
             NOT: Koltuk numaraları her otobüs için dinamik olmalıdır.)
                  Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
                  Aksi halde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

    3-Fiyat hesaplama kuralları:
       -Mesafe başına ücret:
                  Tek yön: 1 Lira / km       Çift Yön(Gidiş-Dönüş): 2 Lira/km
       -Tekli Koltuk ücreti:
                  Koltuk no 3 veya 3 ün katı ise fiyat %20 daha fazladır(Tek yön: 1.2 Lira/km, Çift Yön:2.4 Lira/km).
       -İlk olarak seferin mesafe, yön ve koltuk no bilgisine göre fiyatı hesaplanır,
        sonrasında koşullara göre aşağıdaki indirimler uygulanır ;
                   i)-Çift Yön indirimi:
                               "Yolculuk Tipi" gidiş dönüş seçilmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
                   ii)-Yaş indirimi:
                                Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
                                Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.

 */
public class TicketReservationApp {
    public static void main(String[] args) {


    start();



    }

    private static void start() {

        //1-bilet ve otobus objelerini olusturalim.

        Bus bus=new Bus("34 TPE 789",33);

        Tichet tichet;

            Scanner scanner =new Scanner(System.in);
            int select ;// cikis icin 0 i seciniz

         do {
            //kullanicidan bilgileri alaim
             System.out.println("Bilet rezervasyon sistemine hosgeldiniz");
             System.out.println("Lutfen ad soyad giriniz:");
             String name=scanner.nextLine();


             System.out.println("Lutfen yasinizi yaziniz");
             int age =scanner.nextInt();//  \n
             scanner.nextLine();

             System.out.println("Lütfen gidilecek mesafeyi(KM) giriniz:");
             double km=scanner.nextDouble();

             System.out.println("Yolculuk tipini seçiniz :");
             System.out.println("1-Tek Yön");
             System.out.println("2-Gidiş-Dönüş");
             int type=scanner.nextInt();// \n
             scanner.nextLine();

             System.out.println("Lütfen koltuk no giriniz: ");
             System.out.println("Tekli koltuk ücreti %20 daha fazladır!");
             System.out.println(bus.getSeats());// burda listedeki koltuk numarasini getirir
             String seat=scanner.next();

            //koltuk no rezerve edilmismi veya listede varmi
             boolean isReserved=!bus.getSeats().contains(seat);
            //true ise rezerve edilmis veya bu koltuk no otobuste yok


             // girilen degerler gecerlimi

             if (km>0 && age>0 && (type==1 ||  type==2) && !isReserved){

              // bileti hazirlama
                 tichet=new Tichet(km,type,seat,bus);
                 tichet.setPrice(age);

               //rezerve edilen koltugu listeden kaldiralim
                 tichet.getBus().getSeats().remove(seat);

              //bileti yazdiralim
              tichet.printTicket(name);


             }else{
               if (isReserved){
                   System.out.println("Secilen koltuk mevcut degil veya rezerve edilmistir");
               }else {
                   System.out.println("Sayin "+ name+"hatali veri girdiniz");
               }
             }
             System.out.println("Yeni islem icin bir sayi giriniz, cikis icin 0 giriniz");
             select=scanner.nextInt();
             scanner.nextLine();


         }while (select!=0);
        System.out.println("Iyi gunler dileriz yine bekleriz");

    }


}
