package TicketReservationApp;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    //2.plaka, koltuk sayısı, koltuk numaraları(ozellik variabla)

    private  String numberPlate;

    private  int numberOfSeat;

    private List<String> seats=new  ArrayList<>();// "1","2",..."33"

    //3-parametreli constructor: otobus objesini olusturdugumda ozellikler belli olsun.
    // bunun icin constructer olusmali

    public Bus(String plaka, int koltuksayisi){
        this.numberPlate=plaka;
        this.numberOfSeat=koltuksayisi;
        for (int i=1;i<=numberOfSeat ;i++){
            //this.seats.add(String.valueOf(i));----bunuda kullanabiliriz.sayilari string ifadeye cevirir
            this.seats.add(i+"");
        }
    }


    // getter :degerlerin okunmasini saglar


    public String getNumberPlate() {
        return numberPlate;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public List<String> getSeats() {
        return seats;
    }


    // setter :degerlerin degismesini saglar


    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public void setSeats(List<String> seats) {
        this.seats = seats;
    }
}
