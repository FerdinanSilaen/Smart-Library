/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import util.DBConnection;
import java.io.*;
import java.sql.*;
import java.time.LocalDate;

public class KembaliServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idBuku = Integer.parseInt(request.getParameter("id_buku"));

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("UPDATE buku SET status='tersedia' WHERE id = ?");
            ps.setInt(1, idBuku);
            ps.executeUpdate();

            PreparedStatement updateKembali = conn.prepareStatement("UPDATE peminjaman SET tanggal_kembali = ? WHERE id_buku = ? AND tanggal_kembali IS NULL");
            updateKembali.setDate(1, Date.valueOf(LocalDate.now()));
            updateKembali.setInt(2, idBuku);
            updateKembali.executeUpdate();

            response.sendRedirect("pengembalian.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}