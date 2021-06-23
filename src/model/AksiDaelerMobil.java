package model;

public class AksiDaelerMobil {
    public static void main (String [] args){

        //object class 1
        DaelerMobil  DaelerMobil = new DaelerMobil();
        DaelerMobil.NamaMobil = "Honda Brio";
        DaelerMobil.TypeMobil = "Honda";
        DaelerMobil.WarnaMobil = "Merah";
        DaelerMobil.TahunKeluarMobil= "2021";
        DaelerMobil.NomerMesinMobil=" 345678956245";
        DaelerMobil.NomerKerangkaMobil ="243567865689";
        DaelerMobil.ModelMobil="Brio E CVT";
        DaelerMobil.HargaMobil= 175000000;

        //Object class 2
        PembeliMobil pembeli = new PembeliMobil();
        pembeli.NamaMobil = "jazz";
        pembeli.TypeMobil = "Honda";
        pembeli.WarnaMobil= "Merah";
        pembeli.TahunKeluarMobil = "2021";
        pembeli.NomerMesinMobil ="xx345678956245";
        pembeli.NomerKerangkaMobil ="xaxx243567865689";
        pembeli.ModelMobil="Honda E MT";
        pembeli.HargaMobil= 175000000;
        pembeli.tampilkanAtribut();
        pembeli.create();
        pembeli.create("Honda Jazz");

        //construktor dengan mothod (obeject)
        DaelerMobil Mobil1 = new DaelerMobil();
        Mobil1.tampilkanAtribut();
        DaelerMobil Mobil2 = new DaelerMobil();
        Mobil2.tampilkaninfoDealerMobil();

        DaelerMobil Mobil3 = new DaelerMobil("inova", "hitam");
        Mobil3.tampilkaninfoDealerMobil();
        DaelerMobil Mobil3 = new DaelerMobil("yaris", "merah");
        Mobil3.tampilkanAtribut();


        DaelerMobil Mobil5 = new DaelerMobil("HONDA","Honda E MT","2021");
        Mobil3.tampilkaninfoDealerMobil();
        DaelerMobil Mobil6 = new DaelerMobil("Toyota","Honda E MT","2021");
        Mobil3.tampilkanAtribut();





    }
}
