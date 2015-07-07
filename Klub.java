
public class Klub {
    private String namaKlub;
    private Divisi div;
    private Liga liga;

    //Constructor

    public Klub(String namaKlub, Divisi div, Liga liga) {
        this.namaKlub = namaKlub;
        this.div = div;
        this.liga = liga;
    }

    //Setter and Getter
    public void setNamaKlub(String namaKlub) {

        this.namaKlub = namaKlub;
    }

    public String getNamaKlub() {

        return namaKlub;
    }

    public void setDivisi(Divisi div) {

        this.div = div;
    }

    //test nomer 4
    public void getDivisi(String Klub){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Divisi a = liga.daftarDivisi.get(d);
            for (int c = 0; c < div.daftarKlub.size(); c++){
                a.daftarKlub.get(c);
                Klub i = a.daftarKlub.get(c);
                if (Klub == i.getNamaKlub()){
                    System.out.println(a.getNamaDivisi());
                }
            }
        }
    }

    public void setLiga(Liga liga) {

        this.liga = liga;
    }

    //test nomer 5
    public void getLiga (String club){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Divisi a = liga.daftarDivisi.get(d);
            for (int c = 0; c < div.daftarKlub.size(); c++){
                a.daftarKlub.get(c);
                Klub i = a.daftarKlub.get(c);
                if (club == i.getNamaKlub()){
                    System.out.println(liga.getNamaLiga());
                }
            }
        }
    }

    //toString
    @Override
    public String toString() {
        return "Nama Klub = " + namaKlub;
    }
}
