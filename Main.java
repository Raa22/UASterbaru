
public class Main {

    public static void main(String[] args) {

        //Liga
        Liga Inggris = new Liga("Inggris");
        Liga Itali = new Liga("Itali");

        //Divisi
        Divisi serieA = new Divisi("Serie A",Inggris);
        Divisi serieB = new Divisi("Serie B",Inggris);
        Divisi divisi1 = new Divisi("Divisi1",Itali);
        Divisi divisi2 = new Divisi("Divisi2",Itali);

        //Klub
        Klub City = new Klub("MAN City",serieA,Inggris);
        Klub Ars = new Klub("Arsenal",serieA,Inggris);
        Klub Spurs = new Klub("Hotspurs",serieB,Inggris);
        Klub Blues = new Klub("Chelsea",serieB,Inggris);
        Klub AC = new Klub("AC Milan",divisi1,Itali);
        Klub Juve = new Klub("Juve",divisi1,Itali);
        Klub AS = new Klub("AS Roma",divisi2,Itali);
        Klub Lazio = new Klub("Lazio",divisi2,Itali);

        Inggris.setDaftarDivisi(serieA);
        Inggris.setDaftarDivisi(serieB);
        Itali.setDaftarDivisi(divisi1);
        Itali.setDaftarDivisi(divisi2);

        serieA.setDaftarKlub(City);
        serieA.setDaftarKlub(Ars);
        serieB.setDaftarKlub(Spurs);
        serieB.setDaftarKlub(Blues);
        divisi1.setDaftarKlub(AC);
        divisi1.setDaftarKlub(Juve);
        divisi2.setDaftarKlub(AS);
        divisi2.setDaftarKlub(Lazio);

        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 : get daftar divisi by nama liga");
        System.out.println("Divisi Liga Inggris : ");
        Inggris.getDaftarDivisi("Inggris");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 : get daftar klub by nama liga");
        System.out.println("Klub Liga Itali : ");
        serieA.getDaftarKlubLiga("Itali");
        System.out.println("Divisi Liga Itali : ");
        divisi1.getDaftarKlubLiga("Itali");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 : get daftar klub by nama divisi");
        System.out.println("Serie A : ");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.println("Serie B : ");
        serieB.getDaftarKlubDivisi("Serie B");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 : get klub berada di divisi mana by nama klub");
        Spurs.getDivisi("Hotspurs");
        Spurs.getDivisi("Real Madrid");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 : klub ini berada di liga apa by nama klub");
        AC.getLiga("AC Milan");
        Ars.getLiga("Arsenal");
    }
}

