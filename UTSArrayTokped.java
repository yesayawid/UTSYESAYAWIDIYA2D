import model.Tokped;

public class Arraytokped {
    public static void main(String[] args) {
        ArrayList<Tokped> MasukanBarang = new ArrayList<Tokped>();
        for (int index = 0; index < 3; index++) {
            Tokped Barang = new Tokped();
            Scanner detailInput = new Scanner(System.in);
            System.out.println("Masukkan Foto Barang :");
            Barang.FotoBarang = detailInput.nextLine();

            System.out.println("Masukkan Harga:");
           Barang.Harga= detailInput.nextInt();

            System.out.println("Masukkan Asal Barang : ");
           Barang.AsalBarang = detailInput.nextLine();

            System.out.println("Masukkan Deskripsi : ");
           Barang.Deskripsi = detailInput.nextLine();

           System.out.println("Masukkan Stok Barang : ");
           Barang.StokBarang = detailInput.nextLine();

            MasukanBarang.add(Barang);
        }

        for (int i = 0; i < MasukanBarang.size(); i++) {
            String FotoBarang = MasukanBarang.get(i).FotoBaranag;
            int Harga = MasukanBarang.get(i).Harga;
            String AsalBarang = MasukanBarang.get(i).AsalBarang;
            String Deskripsi = MasukanBarang.get(i).Deskripsi;
            String StokBarang = MasukanBarang.get(i).StokBarang;

            System.out.println("Kartu yang ke " + (i + 1));
            System.out.println("Nomor Kartu     : " + FotoBarang);
            System.out.println("Nomor Rekening  : " + Harga);
            System.out.println("Nama Bank       : " + AsalBarang);
            System.out.println("Nama            : " + Deskripsi);
            System.out.println("Nama            : " + StokBarang);

        }
    }

    
}
