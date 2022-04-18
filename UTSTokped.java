package model;

public class Tokped {
    public String FotoBarang ;
    public int  Harga;
    public String AsalBarang ;
    public String Deskripsi ;
    public int StokBarang ;

    public Tokped(){
    
    }

    public Tokped(String FtBarang, int Hrg, String AslBarang, String Dskrip, String StkBarang){
        this.FotoBarang = FtBarang;
        this.Harga = Hrg;
        this.AsalBarang = AslBarang;
        this.Deskripsi = Dskrip;
        this.StokBarang = StkBarang;
    }
    public String getFotoBarang(){
       return this.FotoBarang;
    }
    public void setFotoBrang(String FotoBarang){
         this.FotoBaranag = FotoBarang;
    }
    public int getHarga(){
       return this.Harga;
    }
    public void setHarga(int Harga){
         this.Harga = Harga;
    }
    public String getAsalBarang(){
       return this.AsalBarang;
    }
    public void setAsalBarang(String AsalBarang){
         this.AsalBarang = AsalBarang;
    }
    public String getDeskripsi(){
       return this.Deskripsi;
    }
    public void setDeskripsi(String Deskripsi){
         this.Deskripsi = Deskripsi;
    }
    public String getStokBarang(){
      return this.StokBarang;
   }
   public void setStokBarang(String StokBarang){
      this.StokBarang = StokBarang;
}

}
