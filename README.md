<h1>📚 Library Management System</h1>

<p>
  Proyek ini adalah sistem manajemen perpustakaan berbasis website menggunakan <strong>Java (Servlet)</strong> sebagai backend, <strong>HTML/CSS</strong> sebagai frontend, dan <strong>MySQL</strong> untuk database.
</p>

<h2>🎯 Tujuan Proyek</h2>
<ul>
  <li>Menyediakan sistem peminjaman dan pengembalian buku secara online.</li>
  <li>Memungkinkan user untuk melihat, meminjam, dan mengembalikan buku.</li>
  <li>Memungkinkan admin untuk menambahkan, mengedit, dan menghapus buku.</li>
  <li>Menerapkan sistem autentikasi dan otorisasi berdasarkan <strong>role</strong> (admin/user).</li>
</ul>

<h2>🔐 Autentikasi dan Hak Akses</h2>
<ul>
  <li><strong>User</strong>: Melihat daftar buku, meminjam dan mengembalikan buku.</li>
  <li><strong>Admin</strong>: Memiliki semua hak akses user + dapat menambah, mengedit, dan menghapus buku.</li>
</ul>

<h2>🛠️ Alur Sistem</h2>

<ol>
  <li>
    <strong>Login:</strong>
    <ul>
      <li>User/Admin mengisi <code>username</code> dan <code>password</code> pada <code>Login.jsp</code>.</li>
      <li>Data dikirim ke <code>LoginServlet</code> untuk validasi.</li>
      <li>Jika valid, diarahkan ke halaman <code>daftarBuku.jsp</code> (user) atau dashboard admin.</li>
    </ul>
  </li>

  <li>
    <strong>Daftar Buku (User & Admin):</strong>
    <ul>
      <li><code>DaftarBukuServlet</code> membaca seluruh data buku dari database.</li>
      <li>Menampilkan data buku di halaman dengan detail gambar, judul, pengarang, genre, dan status.</li>
      <li>Menyediakan dropdown untuk filter berdasarkan <code>genre</code>.</li>
    </ul>
  </li>

  <li>
    <strong>Peminjaman Buku (User):</strong>
    <ul>
      <li>User klik tombol <code>Pinjam</code>.</li>
      <li><code>PinjamServlet</code> memeriksa ketersediaan buku.</li>
      <li>Jika tersedia, status buku diubah menjadi <code>dipinjam</code> dan data peminjam disimpan.</li>
    </ul>
  </li>

  <li>
    <strong>Pengembalian Buku (User):</strong>
    <ul>
      <li>Tombol <code>Kembalikan</code> muncul jika buku sedang dipinjam.</li>
      <li>Data dikirim ke <code>KembaliServlet</code>.</li>
      <li>Status buku diubah kembali menjadi <code>tersedia</code>.</li>
    </ul>
  </li>

  <li>
    <strong>Manajemen Buku (Admin):</strong>
    <ul>
      <li><code>TambahBukuServlet</code>: Menambahkan buku baru.</li>
      <li><code>EditBukuServlet</code>: Mengedit informasi buku.</li>
      <li><code>HapusBukuServlet</code>: Menghapus buku dari database.</li>
    </ul>
  </li>
</ol>

<h2>💡 Penerapan OOP</h2>
<ul>
  <li><strong>Encapsulation:</strong> Semua atribut dibuat <code>private</code> dan diakses via <code>getter/setter</code>.</li>
  <li><strong>Inheritance:</strong> Class <code>Admin</code> dan <code>Peminjam</code> dapat mewarisi <code>User</code>.</li>
  <li><strong>Polymorphism:</strong> Metode seperti <code>setNama()</code> dapat digunakan untuk objek dari kelas turunan.</li>
</ul>

<h2>📦 Struktur Direktori</h2>

<pre>
📁 Web Pages
│   └── Login.jsp
│   └── daftarBuku.jsp
│   └── ...
│
📁 Source Packages
│   ├── servlet
│   │   ├── LoginServlet.java
│   │   ├── PinjamServlet.java
│   │   ├── KembaliServlet.java
│   │   ├── TambahBukuServlet.java
│   │   └── ...
│   ├── model
│   │   ├── User.java
│   │   ├── Admin.java
│   │   ├── Peminjam.java
│   │   └── Buku.java
│   └── util
│       └── DBConnection.java
</pre>

</p>
