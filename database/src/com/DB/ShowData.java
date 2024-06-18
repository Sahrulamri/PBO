package com.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowData {
    public static void show() {
        try (Connection conn = KoneksiDb.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM barang");
            int i = 1;
            while (rs.next()) {
                System.out.println("Data ke-" + i);
                System.out.println("Kode Barang: " + rs.getString("kd_brg"));
                System.out.println("Nama Barang: " + rs.getString("nm_brg"));
                System.out.println("Satuan: " + rs.getString("satuan"));
                System.out.println("Stok: " + rs.getInt("stok_brg"));
                System.out.println("Stok Minimal: " + rs.getInt("stok_min"));
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

