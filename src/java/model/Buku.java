/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Buku {
    private int id;
    private String judul;
    private String genre;
    private String status;

    public Buku(int id, String judul, String genre, String status) {
        this.id = id;
        this.judul = judul;
        this.genre = genre;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

