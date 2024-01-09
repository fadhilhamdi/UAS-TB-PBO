import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class create {

    private static final String URL = "jdbc:mysql://localhost:3306/reservasi";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void insertkkData(Scanner scanNEW) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO booking (id_reservasi, nama_pengunjung, umur) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("----MEMBUAT DATA PENGUNJUNG BARU----");

                System.out.print("ID    : ");
                int idValue = scanNEW.nextInt();

                System.out.print("Nama  : ");
                String namaValue = scanNEW.next();

                System.out.print("Umur  : ");
                String jklValue = scanNEW.next();

                preparedStatement.setInt(1, idValue);
                preparedStatement.setString(2, namaValue);
                preparedStatement.setString(3, jklValue);
               

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Berhasil menambah data pengunjung baru");
                } else {
                    System.out.println("Tidak dapat menambah data pengunjung baru");
                }

                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
