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
        pembeli.NamaMobil = "Honda Brio";
        pembeli.TypeMobil = "Honda";
        pembeli.WarnaMobil= "Merah";
        pembeli.TahunKeluarMobil = "2021";
        pembeli.NomerMesinMobil ="345678956245";
        pembeli.NomerKerangkaMobil ="243567865689";
        pembeli.ModelMobil="Brio E CVT";
        pembeli.HargaMobil= 175000000;
        pembeli.tampilkanAtribut();
        pembeli.create();
        pembeli.create("Honda Brio");

        //construktor dengan mothod (obeject)



    }
}
