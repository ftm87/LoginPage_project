package TicketReservationApp;

public class Tichet {

    //4- mesafe (km), yolculuk tipi ,koltuk no , fiyat,otobus

    private double distance;

    private int typeNo;// 1 -tek yon, 2- cift yon

    private String seatNo;

    private double price;// degeri dinamik olarak hesplanmali

    private Bus bus; //bu bilet hangi otobuse ait(biletten otobus biletine nasil ulasilabilirm)
    //burda has a iliskisi var.bir clasin objesini baska bir clasin onjesi ile iliskilendirmek

    //parametreli constructer
    public Tichet(double distance, int typeNo, String seatNo, Bus bus) {
        this.distance = distance;
        this.typeNo = typeNo;
        this.seatNo = seatNo;
        this.bus = bus;
    }
    // getter


    public double getDistance() {
        return distance;
    }

    public int getTypeNo() {
        return typeNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public Bus getBus() {
        return bus;
    }

    //setter


    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setTypeNo(int typeNo) {
        this.typeNo = typeNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }


    //5-bilet fiyatini kurallara gore hesaplama ve set etme olsun

    public void setPrice(int age) {
        //buradaki hesaplamalar sonucunda ancak deger set edilebilir

        double total = 0;

        int seat = Integer.valueOf(this.seatNo);


        switch (this.typeNo) {  // 1 -tek yon, 2- cift yon
            case 1:// tek yon
                if (seat % 3 == 0) {// tekli koltuk
                    total = this.distance * 1.2;
                } else {
                    total = this.distance * 1;
                }
                System.out.println("Toplam tutar:" + total);
                break;
            case 2://cift yon
                if (seat % 3 == 0) {// tekli koltuk
                    total = this.distance * 2.4;
                } else {
                    total = this.distance * 2;
                }
                System.out.println("Toplam tutar:" + total);
                total = total * 0.8;//%20 indirim
                System.out.println("Cift yon indirimli tutar:" + total);
                break;
        }

        // yas indirimi


        if (age < 12) {
            total = total * 0.5;
            System.out.println("12 yas indirimi tutar:" + total);
        } else if (age > 65) {
            total = total * 0.7;
            System.out.println("65 yas indirimli tutar:" + total);

        }

        this.price=total;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    //6- bilet dokumunu yazdiralim

    public void printTicket(String name){

        System.out.println("*".repeat(42));//repeat methodu bilet dukumunun basina 42 defa * isaretini koya
        System.out.println("---Bilet Detayi---");
        System.out.println("Sayin"+name);
        System.out.println("Otobus plakasi:"+this.bus.getNumberPlate());
        System.out.println("Mesafe(km):"+this.distance);
        System.out.println("yolculuk tipi:"+(this.typeNo==1 ? "Tek yon": "Cift yon"));
        System.out.println("Koltuk No      : "+this.seatNo);
        System.out.println("Toplam Tutar   : "+this.price);
        System.out.println("Keyifli yolculuklar dileriz...");
        System.out.println("*".repeat(42));

    }

}

