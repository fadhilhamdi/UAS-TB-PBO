import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delate {

    private static final String URL = "jdbc:mysql://localhost:3306/reservasi";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void deletekkByNIK() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "DELETE FROM booking WHERE id_reservasi = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                Scanner del = new Scanner(System.in);
                System.out.println("----MENGHAPUS DATA PENGUNJUNG----");
                System.out.print("Masukkan ID untuk dihapus: ");
                int bookid = del.nextInt();
                preparedStatement.setInt(1, bookid);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data pengunjung berhasil dihapus!");
                } else {
                    System.out.println("Tidak ditemukan data pengunjung dengan ID tersebut.");
                }
        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
