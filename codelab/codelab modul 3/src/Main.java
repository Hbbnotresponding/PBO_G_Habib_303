class KarakterGame{
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan){
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target){
        //nantinya akan di override oleh subclass
    }
}

class Pahlawan extends KarakterGame{
    public Pahlawan(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + "menyerang" + target.getNama() + "menggunakan pedang!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + "sekarang memiliki kesehatan" + target.getKesehatan());
    }
}

class musuh extends KarakterGame{
    public musuh(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}
public class Main {
    public static void main(String[] args) {
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan pahlawan = new Pahlawan("Habib", 150);
        musuh musuh = new musuh("Syaiton", 200);

        System.out.println("Status awal:");
        System.out.println(pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan());
        System.out.println(musuh.getNama() + " memiliki kesehatan: " + musuh.getKesehatan());

        pahlawan.serang(musuh);
        musuh.serang(pahlawan);
    }
}