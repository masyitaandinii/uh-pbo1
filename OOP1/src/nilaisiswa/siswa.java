/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

import java.util.Scanner;

/**
 *
 * @author MASTER 10
 */
public class siswa {

    void Cover() {
        System.out.println("Berikut ini adalah laporan hasil belajar siswa SMK Telkom Malang");
        System.out.println("============");
    }

    void Data() {
        String nama, kelas;
        int absen, nilaiBahasa, nilaiFisika, nilaiMatematika, nilaiProduktif;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama siswa : ");
        nama = input.next();

        System.out.print("Masukkan asal kelas siswa : ");
        kelas = input.next();

        System.out.print("Masukkan nomer absen siswa : ");
        absen = input.nextInt();

        System.out.print("Masukkan nilai bahasa : ");
        nilaiBahasa = input.nextInt();

        System.out.print("Masukkan nilai fisika : ");
        nilaiFisika = input.nextInt();

        System.out.print("Masukkan nilai matematika : ");
        nilaiMatematika = input.nextInt();

        System.out.print("Masukkan nilai produktif : ");
        nilaiProduktif = input.nextInt();

        System.out.println("\t");
        System.out.println("Hasil Kelulusan Siswa SMK Telkom Malang");
        System.out.println("========================================");
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("No Absen : " + absen);
        System.out.println("Nilai Bahasa : " + nilaiBahasa);
        System.out.println("Nilai Matematika : " + nilaiMatematika);
        System.out.println("Nilai Fisika : " + nilaiFisika);
        System.out.println("Nilai Produktif : " + nilaiProduktif);

        if ((nilaiBahasa >= 80) && (nilaiFisika >= 80) && (nilaiMatematika >= 70) && (nilaiProduktif >= 85)) {
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Mohon maaf anda belum lulus, mohon belajar lebih giat lagi");

        }

    }

}
