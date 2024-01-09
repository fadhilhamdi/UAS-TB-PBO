import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import ff.pengunjung; 

class informasi  extends pengunjung{
  static Integer kodeBarang=0;
   public String tujuanreservasi;
   public Integer biayareser;
   public Integer jumlahreser;
   public Integer totalBiaya;  
   public String resepsionis;

   public informasi(String nama, String alamat, String tujuanreservasi, String resepsionis, Integer biayareser, Integer kodeBarang,
     Integer jumlahreser) {
      super(nama, alamat);
      this.alamat = alamat;
      this.resepsionis = resepsionis;
      this.tujuanreservasi = tujuanreservasi;
      this.biayareser = biayareser;
      this.kodeBarang = kodeBarang;
      this.jumlahreser = jumlahreser;
      totalBiaya = biayareser*jumlahreser;
      cetakFaktur();
   }
   @Override
   public void cetakFaktur(){
      System.out.println();
      System.out.println("         DIAMOND HOTEL AND RESTO");
      for(int pls = 1; pls <= 20; pls++){
          System.out.print("-=");  
       }
            DateTimeFormatter tgl = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime lv = LocalDateTime.now();
       
      System.out.print("\nTanggal  : " + tgl.format(lv));
            DateTimeFormatter wkt = DateTimeFormatter.ofPattern("HH:m:ss");
      System.out.println("\nWaktu    : " + wkt.format(lv) + " WIB" + "\n");
      
   
      System.out.println("             DATA PENGUNJUNG");
      for(int pls = 1; pls <= 40; pls++){
          System.out.print("=");  
   }
   
   System.out.print("\nNama Pelanggan               : "+ nama) ;
   System.out.print("\nAlamat                       : "+ super.alamat + "");   
   System.out.print("\nNomor Reservasi              : N-" + kodeBarang);
   System.out.print("\nTujuan Reservasi             : " + tujuanreservasi);
   System.out.print("\nJumlah Hari Reservasi        : " + jumlahreser + " hari");
   System.out.print("\nBiaya Reservasi              : Rp " + biayareser);
   System.out.print("\nTOTAL BIAYA                  : Rp " + totalBiaya+ "\n");
   for(int pls = 1; pls <= 40; pls++){
      System.out.print("-");
   }
   System.out.println("\nResepsionis                : " + resepsionis);
   System.out.println();
}
}
