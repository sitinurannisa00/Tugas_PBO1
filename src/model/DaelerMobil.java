package model;

public class DaelerMobil {
//    8 atribut clas DaelerMobil//

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
        System.out.println("Tahun Keluar Mobil : " +TahunKeluarMobil);
        System.out.println("NomerMesinMobil : " + NomerMesinMobil);
        System.out.println("NomerKerangkaMobil : " + NomerKerangkaMobil);
        System.out.println("ModelMobil : " + ModelMobil);
        System.out.println("HergaMobil : " + HargaMobil);
    }

    public void tampilkaninfoDealerMobil() {
        System.out.println("===========================");
        System.out.println("Nama Mobil : " +NamaMobil);
        System.out.println("Type Mobil: " +TypeMobil);
        System.out.println("WarnaMobil : " +WarnaMobil);
        System.out.println("Tahun Keluar Mobil : " +TahunKeluarMobil);
        System.out.println("ModelMobil :" +ModelMobil);
    }

    public boolean create() {
        String insertCreate = "INSERT INTO DaelerMobil VALUES ('"+NamaMobil+"','"+TypeMobil+"','"+ModelMobil+"','"+WarnaMobil+"')";
        System.out.println(insertCreate);
        boolean berhasil = true;
        if (berhasil) {
            return true;
        } else {
            return false;
        }
    }

    public boolean create(String TypeMobil) {
        String insertCreate = "INSERT INTO DaelerMobil VALUES Type Mobil "+TypeMobil;
        System.out.println(insertCreate);
        return false;
    }

    //construktor
    public DaelerMobil(){
        System.out.println("===================");
        NamaMobil = "please isi Nama Mobil";
        TypeMobil = "please isi Type Mobil";
        WarnaMobil = "please isi Warna Mobil";
        ModelMobil = "please isi Model Mobil";
    }
    public DaelerMobil(String NamaMobil, String WarnaMobil){
        this.NamaMobil = NamaMobil;
        this.WarnaMobil = WarnaMobil ;
    }
    public DaelerMobil(String TypeMobil, String ModelMobil, String TahunKeluarMobil){
        this.TypeMobil = TypeMobil;
        this.ModelMobil = ModelMobil;
        this.TahunKeluarMobil = TahunKeluarMobil;
    }

    //Getter and setter

    public String getNamaMobil() {
        return NamaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        NamaMobil = namaMobil;
    }

    public String getTypeMobil() {
        return TypeMobil;
    }

    public void setTypeMobil(String typeMobil) {
        TypeMobil = typeMobil;
    }

    public String getWarnaMobil() {
        return WarnaMobil;
    }

    public void setWarnaMobil(String warnaMobil) {
        WarnaMobil = warnaMobil;
    }

    public String getTahunKeluarMobil() {
        return TahunKeluarMobil;
    }

    public void setTahunKeluarMobil(String tahunKeluarMobil) {
        TahunKeluarMobil = tahunKeluarMobil;
    }

    public String getNomerMesinMobil() {
        return NomerMesinMobil;
    }

    public void setNomerMesinMobil(String nomerMesinMobil) {
        NomerMesinMobil = nomerMesinMobil;
    }

    public String getNomerKerangkaMobil() {
        return NomerKerangkaMobil;
    }

    public void setNomerKerangkaMobil(String nomerKerangkaMobil) {
        NomerKerangkaMobil = nomerKerangkaMobil;
    }

    public String getModelMobil() {
        return ModelMobil;
    }

    public void setModelMobil(String modelMobil) {
        ModelMobil = modelMobil;
    }

    public int getHargaMobil() {
        return HargaMobil;
    }

    public void setHargaMobil(int hargaMobil) {
        HargaMobil = hargaMobil;
    }
}