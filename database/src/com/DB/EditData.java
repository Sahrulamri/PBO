package com.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EditData {
    public static void edit(Scanner scanner) {
        System.out.print("Enter Kode Barang to edit: ");
        String kode_brg = scanner.nextLine();

        System.out.print("Enter new Nama Barang: ");
        String nama_brg = scanner.nextLine();
        System.out.print("Enter new Satuan: ");
        String satuan = scanner.nextLine();
        System.out.print("Enter new Stok: ");
        int stok = scanner.nextInt();
        System.out.print("Enter new Stok Minimal: ");
        int stok_min = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        try (Connection conn = KoneksiDb.getConnection()) {
            String sql = "UPDATE barang SET nm_brg = ?, satuan = ?, stok_brg = ?, stok_min = ? WHERE kd_brg = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nama_brg);
            ps.setString(2, satuan);
            ps.setInt(3, stok);
            ps.setInt(4, stok_min);
            ps.setString(5, kode_brg);
            ps.execute();

            System.out.println("Data updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

