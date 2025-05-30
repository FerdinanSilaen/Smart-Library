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

public class TambahBukuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String judul = request.getParameter("judul");
        String genre = request.getParameter("genre");
        String status = "tersedia";

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO buku (judul, genre, status) VALUES (?, ?, ?)");
            ps.setString(1, judul);
            ps.setString(2, genre);
            ps.setString(3, status);
            ps.executeUpdate();
            response.sendRedirect("daftarBuku.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
