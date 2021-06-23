package model;

public class DaelerMobil {
//    8 atribut clas DaelerMobil

    public String NamaMobil;
    public String TypeMobil;
    public String WarnaMobil;
    public String TahunKeluarMobil;
    public String NomerMesinMobil;
    public String NomerKerangkaMobil;
    public String ModelMobil;
    public int HargaMobil;

    public void tampilkanAtribut() {
        System.out.println("==========================");
        System.out.println("Nama Mobil : " + NamaMobil);
        System.out.println("TypeMobil  : " + TypeMobil);
        System.out.println("Warna Mobil : " + WarnaMobil);
        System.out.println("Tahun Keluar Mobil : " + TahunKeluarMobil);
        System.out.println("NomerMesinMobil : " + NomerMesinMobil);
        System.out.println("NomerKerangkaMobil : " + NomerKerangkaMobil);
        System.out.println("ModelMobil : " + ModelMobil);
        System.out.println("HergaMobil : " + HargaMobil);
    }

    public void tampilkaninfoDealerMobil() {
        System.out.println("===========================");
        System.out.println("Nama Mobil : " + NamaMobil);
        System.out.println("Type Mobil: " + TypeMobil);
        System.out.println("WarnaMobil : " + WarnaMobil);
        System.out.println("Tahun Keluar Mobil : " + TahunKeluarMobil);
        System.out.println("ModelMobil :" + ModelMobil);
    }

    public boolean create() {
        String insertCreate = "INSERT INTO DealerMobil VALUES ('" + NamaMobil + "','" + TypeMobil + "','" + ModelMobil + "','" + WarnaMobil + "')";
        System.out.println(insertCreate);
        boolean berhasil = true;
        if (berhasil) {
            return true;
        } else {
            return false;
        }
    }

    public boolean create(String TypeMobil) {
        String insertCreate = "INSERT INTO DaelerMobil VALUES Type Mobil " + TypeMobil;
        System.out.println(insertCreate);
        return false;
    }
}