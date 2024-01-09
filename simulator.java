import java.sql.SQLException;
import java.util.*;
public class simulator {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("       WELCOME TO DIAMOND HOTEL AND RESTO");
        for(int pls = 1; pls <= 50; pls++){
            System.out.print("=");  
     }
        String y = "next";
        Integer biayareser =0;
        Integer jumlahreser =0;

        login br = new login();
        br.signin();

Scanner choice = new Scanner(System.in);
        System.out.println("\n----Menu Pengunjung---- \n1. Reservasi\n2. Tambah Data Pengunjung\n3. Update Data pengunjung\n4. Hapus Data Pengunjung");
        System.out.print("Pilih Menu Pengunjung: ");
        Integer c = choice.nextInt();
        if (c == 1) {
                try (Scanner custom = new Scanner(System.in)) {
                        System.out.println();
                        System.out.println("              DATA PENGUNJUNG");
                        for(int pls = 1; pls <= 40; pls++){
                            System.out.print("-");
                         }
                        System.out.println();
                        System.out.print("Nama Pelanggan         : ");
                        String nama = custom.nextLine();
                        System.out.print("Alamat                 : ");
                        String alamat = custom.nextLine();
                        System.out.print("Tujuan Reservasi       : ");
                        String tujuan = custom.nextLine();
                        System.out.print("Jumlah Hari Reservasi  : ");
                        jumlahreser = custom.nextInt();
                        System.out.print("Biaya Reservasi        : ");
                        biayareser = custom.nextInt();
                        custom.nextLine();
                        System.out.print("Nomor Reservasi        : ");
                        Integer kodeBarang = custom.nextInt();
                        custom.nextLine();
                        System.out.print("Resepsionis            : ");
                        String respsionis = custom.nextLine();
                        informasi info = new informasi(nama, alamat, tujuan, respsionis, biayareser, jumlahreser, kodeBarang);
                    }catch(Exception e){

                }

        }else if(c == 2){
            Scanner scanNEW = new Scanner(System.in);
            create.insertkkData(scanNEW);
            System.out.println("");
        } else if(c == 3) {
           Scanner scanner = new Scanner(System.in);
           update.updatekkCredentials(scanner);
            System.out.println("");

        } else if(c == 4) {
            delate.deletekkByNIK();
            System.out.println("");
        }else {
        System.out.println("Maaf pilihan tidak tersedia!");
        }
                
        
            }
        }

            
        

