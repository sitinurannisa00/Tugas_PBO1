package model;

public class PembeliMobil extends DaelerMobil {

    public String NamaPembeli;
    public int NamaPenjual;
    public String Jumlahbeli;

    public void infopenjual(){
        System.out.println("==================");
        System.out.println("Nama Pembeli Mobil : "+NamaPembeli);
        System.out.println("Nama Penjual Mobil : "+NamaPenjual);
        System.out.println(" Jumlah Beli       : "+Jumlahbeli);
    }
    public void jumlahinfo(){
        String ji = "INSERT INTO DaelerMobil VALUES ('"+Jumlahbeli+"')";
        System.out.println(ji);

    }
    //Getter And Setter


    public String getNamaPembeli() {
        return NamaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        NamaPembeli = namaPembeli;
    }

    public int getNamaPenjual() {
        return NamaPenjual;
    }

    public void setNamaPenjual(int namaPenjual) {
        NamaPenjual = namaPenjual;
    }

    public String getJumlahbeli() {
        return Jumlahbeli;
    }

    public void setJumlahbeli(String jumlahbeli) {
        Jumlahbeli = jumlahbeli;
    }
}
