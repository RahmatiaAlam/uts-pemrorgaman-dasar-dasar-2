UTS-PEMROGRAMAN DASAR DASAR 2

Nama : Rahmatia Alam

NIM : 05202425040

Kelas : B S1-Teknik Komputer

Program ini saya menggunakan dua library Java, yaitu Scanner yang fungsinya menerimaa input dari pengguna dan HashMap untuk menyimpan data dalam bentuk pasangan key dan value.

Program ini terdapat empat struktu file di dalamnya yaitu indeksPrestasiMain, Mahasiswa, Matakuliah, akademikEntity yang menggunakan konsep 4 pilar pmerograman OOP dari masing-masing struktur file kecuali indeksPrestasiMain sebagai Program Utamanya dan menggunakan method atau fungsi konversi yang berisi objek HashMap yang menyimpan pasangan nilai huruf sebagai key.

Di dalam main, program menggunakan try-catch untuk mengantisipasi jika terjadi kesalahan saat input data. Selanjutnya terdapat perulangan for dengan auto increment yang dimulai dari indeks 1 dan akan berjalan selama nilai i masih kurang dari atau sama dengan jumlah mata kuliah yang dimasukkan oleh pengguna. 

Di setiap perulangan, program akan meminta input berupa nama mata kuliah, nilai huruf, dan jumlah SKS. Jika nilai huruf yang dimasukkan sesuai dengan key yang ada di HashMap, maka program akan mengambil bobot nilai dari HashMap tersebut.

Kemudian program menghitung nilai mutu, yaitu hasil perkalian antara bobot nilai dan jumlah SKS, yang disimpan dalam tipe data double. Nilai mutu ini akan terus dijumlahkan ke dalam variabel total nilai mutu setiap kali perulangan berjalan. Hal yang sama juga terjadi pada total SKS, yang akan terus bertambah sesuai dengan jumlah SKS dari setiap mata kuliah yang diinput.
