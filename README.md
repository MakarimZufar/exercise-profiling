# ADVPRO
<h1>
    <b>Nama:</b> Makarim Zufar Prambudyo
    <b>NPM:</b> 2306241751
</h1>

## Hasil pengujian 
### Sebelum Optimize
1. JMeter GUI

    ![all-student_Request_before_optimize](https://github.com/MakarimZufar/exercise-profiling/blob/main/README-image/all-student_Request_before_optimize.jpg)
    ![all-student-name_Request_before_optimize](https://github.com/MakarimZufar/exercise-profiling/blob/main/README-image/all-student-name_Request_before_optimize.jpg)
    ![highest-gpa_Request_before_optimize](https://github.com/MakarimZufar/exercise-profiling/blob/main/README-image/highest-gpa_Request_before_optimize.jpg)
2. JMeter CLI

```
1741839645785,396959,all-student-request,200,,Thread Group 1 1-5,text,true,,7249360,127,10,10,http://localhost:8080/all-student,396866,0,2
1741839645986,396758,all-student-request,200,,Thread Group 1 1-7,text,true,,7249360,127,10,10,http://localhost:8080/all-student,396665,0,2
1741839646086,396882,all-student-request,200,,Thread Group 1 1-8,text,true,,7249360,127,8,8,http://localhost:8080/all-student,396806,0,1
1741839645514,397461,all-student-request,200,,Thread Group 1 1-1,text,true,,7249360,127,7,7,http://localhost:8080/all-student,397394,0,40
1741839645514,397608,all-student-request,200,,Thread Group 1 1-2,text,true,,7249360,127,6,6,http://localhost:8080/all-student,397533,0,40
1741839645884,397405,all-student-request,200,,Thread Group 1 1-6,text,true,,7249360,127,5,5,http://localhost:8080/all-student,397370,0,2
1741839645587,397723,all-student-request,200,,Thread Group 1 1-3,text,true,,7249360,127,4,4,http://localhost:8080/all-student,397682,0,1
1741839646185,397218,all-student-request,200,,Thread Group 1 1-9,text,true,,7249360,127,3,3,http://localhost:8080/all-student,397180,0,2
1741839646284,397132,all-student-request,200,,Thread Group 1 1-10,text,true,,7249360,127,2,2,http://localhost:8080/all-student,397091,0,2
1741839645686,398320,all-student-request,200,,Thread Group 1 1-4,text,true,,7249360,127,1,1,http://localhost:8080/all-student,398284,0,1
```
```
1741945206107,18697,all-student-name Request,200,,Thread Group 2 1-3,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,18658,0,1
1741945206032,18771,all-student-name Request,200,,Thread Group 2 1-1,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,18732,0,27
1741945206705,18099,all-student-name Request,200,,Thread Group 2 1-9,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,18060,0,1
1741945206605,18202,all-student-name Request,200,,Thread Group 2 1-8,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,18200,0,1
1741945206306,18498,all-student-name Request,200,,Thread Group 2 1-5,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,18459,0,2
1741945206033,18771,all-student-name Request,200,,Thread Group 2 1-2,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,18732,0,27
1741945206505,18299,all-student-name Request,200,,Thread Group 2 1-7,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,18260,0,2
1741945206407,18397,all-student-name Request,200,,Thread Group 2 1-6,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,18358,0,1
1741945206207,18597,all-student-name Request,200,,Thread Group 2 1-4,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,18558,0,1
1741945206804,18000,all-student-name Request,200,,Thread Group 2 1-10,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,17984,0,1
```
```
1741945233167,308,highest-gpa Request,200,,thread group 3 1-2,text,true,,273,127,5,5,http://localhost:8080/highest-gpa,304,0,30
1741945233167,308,highest-gpa Request,200,,thread group 3 1-1,text,true,,273,127,5,5,http://localhost:8080/highest-gpa,304,0,30
1741945233246,246,highest-gpa Request,200,,thread group 3 1-3,text,true,,273,127,3,3,http://localhost:8080/highest-gpa,246,0,1
1741945233346,243,highest-gpa Request,200,,thread group 3 1-4,text,true,,273,127,3,3,http://localhost:8080/highest-gpa,243,0,1
1741945233446,255,highest-gpa Request,200,,thread group 3 1-5,text,true,,273,127,3,3,http://localhost:8080/highest-gpa,254,0,1
1741945233546,251,highest-gpa Request,200,,thread group 3 1-6,text,true,,273,127,3,3,http://localhost:8080/highest-gpa,251,0,1
1741945233645,245,highest-gpa Request,200,,thread group 3 1-7,text,true,,273,127,3,3,http://localhost:8080/highest-gpa,245,0,1
1741945233745,232,highest-gpa Request,200,,thread group 3 1-8,text,true,,273,127,3,3,http://localhost:8080/highest-gpa,231,0,1
1741945233843,228,highest-gpa Request,200,,thread group 3 1-9,text,true,,273,127,2,2,http://localhost:8080/highest-gpa,228,0,2
1741945233944,223,highest-gpa Request,200,,thread group 3 1-10,text,true,,273,127,1,1,http://localhost:8080/highest-gpa,223,0,1
```

### Setelah Optimize

1. JMeter GUI

    ![all-student_Request_after_optimize](https://github.com/MakarimZufar/exercise-profiling/blob/main/README-image/all-student_Request_after_optimize.jpg)
    ![all-student-name_Request_after_optimize](https://github.com/MakarimZufar/exercise-profiling/blob/main/README-image/all-student-name_Request_after_optimize.jpg)
    ![highest-gpa_Request_after_optimize](https://github.com/MakarimZufar/exercise-profiling/blob/main/README-image/highest-gpa_Request_after_optimize.jpg)

2. JMeter CLI

```
1741836778764,1765,all-student-request,200,,Thread Group 1 1-3,text,true,,7249360,127,10,10,http://localhost:8080/all-student,1714,0,1
1741836778700,1842,all-student-request,200,,Thread Group 1 1-2,text,true,,7249360,127,10,10,http://localhost:8080/all-student,1787,0,35
1741836778701,1896,all-student-request,200,,Thread Group 1 1-1,text,true,,7249360,127,8,8,http://localhost:8080/all-student,1824,0,35
1741836778863,1828,all-student-request,200,,Thread Group 1 1-4,text,true,,7249360,127,7,7,http://localhost:8080/all-student,1789,0,1
1741836778960,1748,all-student-request,200,,Thread Group 1 1-5,text,true,,7249360,127,6,6,http://localhost:8080/all-student,1710,0,2
1741836779184,1581,all-student-request,200,,Thread Group 1 1-7,text,true,,7249360,127,5,5,http://localhost:8080/all-student,1549,0,4
1741836779060,1717,all-student-request,200,,Thread Group 1 1-6,text,true,,7249360,127,4,4,http://localhost:8080/all-student,1683,0,2
1741836779258,1694,all-student-request,200,,Thread Group 1 1-8,text,true,,7249360,127,3,3,http://localhost:8080/all-student,1673,0,1
1741836779360,1671,all-student-request,200,,Thread Group 1 1-9,text,true,,7249360,127,2,2,http://localhost:8080/all-student,1648,0,2
1741836779459,1643,all-student-request,200,,Thread Group 1 1-10,text,true,,7249360,127,1,1,http://localhost:8080/all-student,1620,0,1
```
```
1741856225408,9676,all-student-name Request,200,,Thread Group 2 1-1,text,true,,601724,132,10,10,http://localhost:8080/all-student-name,9654,0,20
1741856225426,9783,all-student-name Request,200,,Thread Group 2 1-2,text,true,,601724,132,9,9,http://localhost:8080/all-student-name,9778,0,3
1741856225526,10460,all-student-name Request,200,,Thread Group 2 1-3,text,true,,601724,132,8,8,http://localhost:8080/all-student-name,10454,0,2
1741856225626,10757,all-student-name Request,200,,Thread Group 2 1-4,text,true,,601724,132,7,7,http://localhost:8080/all-student-name,10748,0,2
1741856225725,10817,all-student-name Request,200,,Thread Group 2 1-5,text,true,,601724,132,6,6,http://localhost:8080/all-student-name,10812,0,2
1741856225823,10804,all-student-name Request,200,,Thread Group 2 1-6,text,true,,601724,132,5,5,http://localhost:8080/all-student-name,10797,0,1
1741856225926,10857,all-student-name Request,200,,Thread Group 2 1-7,text,true,,601724,132,4,4,http://localhost:8080/all-student-name,10851,0,2
1741856226023,10835,all-student-name Request,200,,Thread Group 2 1-8,text,true,,601724,132,3,3,http://localhost:8080/all-student-name,10831,0,3
1741856226125,10775,all-student-name Request,200,,Thread Group 2 1-9,text,true,,601724,132,2,2,http://localhost:8080/all-student-name,10773,0,2
1741856226223,10712,all-student-name Request,200,,Thread Group 2 1-10,text,true,,601724,132,1,1,http://localhost:8080/all-student-name,10711,0,2
```
```
1741856268518,191,highest-gpa Request,200,,thread group 3 1-2,text,true,,273,127,3,3,http://localhost:8080/highest-gpa,188,0,8
1741856268504,205,highest-gpa Request,200,,thread group 3 1-1,text,true,,273,127,3,3,http://localhost:8080/highest-gpa,202,0,22
1741856268620,149,highest-gpa Request,200,,thread group 3 1-3,text,true,,273,127,2,2,http://localhost:8080/highest-gpa,149,0,2
1741856268717,143,highest-gpa Request,200,,thread group 3 1-4,text,true,,273,127,2,2,http://localhost:8080/highest-gpa,143,0,0
1741856268816,152,highest-gpa Request,200,,thread group 3 1-5,text,true,,273,127,2,2,http://localhost:8080/highest-gpa,152,0,1
1741856268916,143,highest-gpa Request,200,,thread group 3 1-6,text,true,,273,127,2,2,http://localhost:8080/highest-gpa,143,0,0
1741856269016,125,highest-gpa Request,200,,thread group 3 1-7,text,true,,273,127,2,2,http://localhost:8080/highest-gpa,125,0,1
1741856269116,130,highest-gpa Request,200,,thread group 3 1-8,text,true,,273,127,2,2,http://localhost:8080/highest-gpa,130,0,0
1741856269215,136,highest-gpa Request,200,,thread group 3 1-9,text,true,,273,127,2,2,http://localhost:8080/highest-gpa,136,0,1
1741856269315,137,highest-gpa Request,200,,thread group 3 1-10,text,true,,273,127,1,1,http://localhost:8080/highest-gpa,137,0,0
```

## Reflection
1. Perbedaan Pendekatan Pengujian Performa dengan JMeter dan Profiling dengan IntelliJ Profiler

    JMeter (Pengujian Performa):

        - Digunakan untuk mensimulasikan banyak pengguna yang mengakses aplikasi secara bersamaan.

        - Mengukur waktu respons, latensi, dan throughput aplikasi di bawah beban tertentu.

        - Membantu mengidentifikasi masalah performa di tingkat server, API, dan database.
        
        - Cocok untuk load testing, stress testing, dan benchmarking.

    IntelliJ Profiler (Profiling Kode):

        - Menganalisis penggunaan CPU, konsumsi memori, dan waktu eksekusi kode.
        
        - Mengidentifikasi fungsi yang lambat, loop yang tidak efisien, dan kebocoran memori.
        
        - Digunakan untuk memahami performa di tingkat kode dan mengoptimalkan bagian yang bermasalah.

2. Bagaimana Proses Profiling Membantu Mengidentifikasi Titik Lemah dalam Aplikasi?
    
    - Membantu menemukan bagian kode yang paling banyak menghabiskan sumber daya (CPU/memori).
    
    - Mengidentifikasi metode atau fungsi yang menyebabkan eksekusi lambat.
    
    - Menunjukkan alur eksekusi program sehingga bisa memahami bottleneck dalam sistem.
    
    - Mengurangi kemungkinan N+1 Query Problem, loop yang tidak efisien, atau alokasi memori berlebihan.

3. Apakah IntelliJ Profiler Efektif dalam Menganalisis dan Mengidentifikasi Bottleneck?

    Ya, IntelliJ Profiler sangat efektif karena:

    - Memberikan visualisasi yang jelas tentang penggunaan CPU dan memori.
    
    - Memungkinkan real-time profiling untuk melihat performa kode saat aplikasi berjalan.
    
    - Bisa mengidentifikasi garbage collection yang berlebihan, yang bisa memperlambat aplikasi.
    
    - Menunjukkan call tree dan hot spots, membantu developer fokus pada bagian kode yang perlu dioptimalkan.
    
    - Namun, hasilnya harus dibandingkan dengan pengujian nyata menggunakan JMeter untuk melihat dampaknya secara keseluruhan.

4. Tantangan dalam Pengujian Performa dan Profiling, serta Cara Mengatasinya
Tantangan:

    1. Perbedaan antara hasil JMeter dan IntelliJ Profiler
        - JMeter menguji dari sisi pengguna, sedangkan profiler menganalisis dari dalam kode.
        - Bisa jadi hasil di JMeter menunjukkan aplikasi lambat, tetapi profiler menunjukkan kode optimal—mungkin karena faktor eksternal seperti database atau jaringan.
    2. Menentukan bagian kode yang harus dioptimalkan lebih dulu
        - Jika tidak ada prioritas, bisa jadi hanya mengoptimalkan bagian yang kurang berdampak.
    3. Menangani overhead dari profiling
        - Profiling dapat memperlambat aplikasi selama dijalankan, sehingga sulit menganalisis performa dalam skenario nyata.

    Cara Mengatasi:

        ✅ Menggunakan profiling dan pengujian performa secara bersamaan untuk mendapatkan gambaran lengkap.
    
        ✅ Memprioritaskan bagian yang memiliki dampak terbesar, misalnya metode yang sering dipanggil atau query yang paling berat.
    
        ✅ Menjalankan profiling di lingkungan terpisah agar tidak mengganggu aplikasi yang sedang digunakan.

5. Manfaat Utama Menggunakan IntelliJ Profiler

    - Menemukan kode yang lambat dengan cepat, tanpa harus menebak-nebak.
    
    - Memantau penggunaan CPU dan memori secara real-time, membantu menghindari pemborosan sumber daya.

    - Mengoptimalkan penggunaan thread dan proses asynchronous, yang penting untuk meningkatkan performa aplikasi.

    - Menganalisis garbage collection, untuk melihat apakah ada masalah alokasi memori yang berlebihan.

6. Bagaimana Menangani Ketidakkonsistenan Hasil Profiling IntelliJ dengan Pengujian JMeter?

    - Jika hasil JMeter menunjukkan aplikasi lambat, tetapi IntelliJ Profiler tidak menemukan bottleneck di kode, kemungkinan besar masalah ada di database, jaringan, atau infrastruktur.

    - Lakukan profiling tambahan di database, misalnya dengan PostgreSQL EXPLAIN ANALYZE untuk melihat apakah ada query yang lambat.

    - Periksa log aplikasi dan metrik sistem (CPU, RAM, disk I/O) untuk melihat apakah ada faktor eksternal yang mempengaruhi performa.

7. Strategi Optimasi Setelah Menganalisis Hasil Pengujian Performa dan Profiling

    Langkah-langkah yang diterapkan setelah analisis performa:
    1. Optimasi Query Database:

        - Menggunakan JOIN FETCH untuk menghindari N+1 Query Problem.
        - Menambahkan index pada kolom yang sering dicari untuk mempercepat pencarian.
        - Mengoptimalkan Kode Aplikasi:

    2. Menggunakan caching jika ada data yang sering diakses tetapi jarang berubah.
        - Menghindari loop berulang yang tidak efisien dengan menggunakan struktur data yang lebih optimal.

    3. Meningkatkan Efisiensi Thread dan Proses Asynchronous:

        - Menggunakan ExecutorService atau CompletableFuture untuk menghindari blocking yang tidak perlu.

        - Memanfaatkan parallel stream jika memungkinkan untuk mempercepat eksekusi.

    4. Melakukan Pengujian Ulang (Regression Testing):
        - Setiap perubahan harus diuji ulang menggunakan JMeter dan IntelliJ Profiler untuk memastikan tidak ada dampak negatif pada fungsionalitas aplikasi.
