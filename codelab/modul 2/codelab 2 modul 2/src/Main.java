class RekeningBank{
    String nomorRekening;
    String namaPemilik;
    double saldo;

    RekeningBank(String nomorRekening, String namaPemilik, double saldo){
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    void tampilkanInfo(){
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    void setorUang(double jumlah){
        if (jumlah > 0){
            saldo += jumlah;
            System.out.println(namaPemilik + "menyetor Rp" + jumlah + ".Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println(namaPemilik + "menarik Rp" + jumlah + ".(Gagal,Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }

    public void tarikUang(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }
}

public class Main {
    public static void main(String[] args){
        RekeningBank rekening1 = new RekeningBank("202410370110303", "HABIB",500000);
        RekeningBank rekening2 = new RekeningBank("202410370110313", "ROMI", 1000000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(700000.0);
        rekening2.setorUang(700000.0);

        rekening1.tarikUang(800000.0);
        rekening1.tarikUang(300000.0);

        System.out.println();
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}