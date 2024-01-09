import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update {

    //Driver
    private static final String URL = "jdbc:mysql://localhost:3306/reservasi";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    
    public static void updatekkCredentials(Scanner scanner) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "UPDATE booking SET nama_pengunjung = ?, umur = ? WHERE id_reservasi=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("----UPDATE DATA PENGUNJUNG----");
                System.out.print("ID    : ");
                int id = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Nama  : ");
                String newnama = scanner.next();

                System.out.print("Umur  : ");
                String newjkl = scanner.next();

                preparedStatement.setInt(3, id);
                preparedStatement.setString(1, newnama);
                preparedStatement.setString(2, newjkl);
            

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data Pengunjung diupdate!");
                } else {
                    System.out.println("Tidak ditemukan data Pengunjung dengan id tersebut");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
