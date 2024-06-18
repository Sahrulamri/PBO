package com.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
    public static void insert(Scanner scanner) {
        System.out.print("Enter Kode Barang: ");
        String kode_brg = scanner.nextLine();
        System.out.print("Enter Nama Barang: ");
        String nama_brg = scanner.nextLine();
        System.out.print("Enter Satuan: ");
        String satuan = scanner.nextLine();
        System.out.print("Enter Stok: ");
        int stok = scanner.nextInt();
        System.out.print("Enter Stok Minimal: ");
        int stok_min = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        try (Connection conn = KoneksiDb.getConnection()) {
            String sql = "INSERT INTO barang (kd_brg, nm_brg, satuan, stok_brg, stok_min) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, kode_brg);
            ps.setString(2, nama_brg);
            ps.setString(3, satuan);
            ps.setInt(4, stok);
            ps.setInt(5, stok_min);
            ps.execute();

            System.out.println("Data inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

