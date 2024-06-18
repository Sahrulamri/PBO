package com.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
    public static void delete(Scanner scanner) {
        System.out.print("Enter Kode Barang to delete: ");
        String kode_brg = scanner.nextLine();

        try (Connection conn = KoneksiDb.getConnection()) {
            String sql = "DELETE FROM barang WHERE kd_brg = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, kode_brg);
            ps.execute();

            System.out.println("Data deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

