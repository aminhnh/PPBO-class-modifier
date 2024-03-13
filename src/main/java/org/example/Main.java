package org.example;

import school.Mahasiswa;

public class Main {
    public static void main(String[] args) {

        Mahasiswa nawal = new Mahasiswa("Nawal Rizky", "23/505050/SV/50050", 20);
//        nawal.nama = "Nawal";
//        System.out.println(nawal.nama);
        nawal.jumlahBolos = 10;
        nawal.setPassword("apalah");
//        nawal.bolehUjian();
        System.out.println(nawal);

    }
}