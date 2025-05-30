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

public class PinjamServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idUser = Integer.parseInt(request.getParameter("id_user"));
        int idBuku = Integer.parseInt(request.getParameter("id_buku"));

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO peminjaman (id_user, id_buku, tanggal_pinjam) VALUES (?, ?, ?)");
            ps.setInt(1, idUser);
            ps.setInt(2, idBuku);
            ps.setDate(3, Date.valueOf(LocalDate.now()));
            ps.executeUpdate();

            PreparedStatement updateStatus = conn.prepareStatement("UPDATE buku SET status='dipinjam' WHERE id = ?");
            updateStatus.setInt(1, idBuku);
            updateStatus.executeUpdate();

            response.sendRedirect("daftarBuku.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
