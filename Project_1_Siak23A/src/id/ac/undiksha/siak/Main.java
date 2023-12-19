// File: Main.java
package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;

public class Main {
    public static void main(String[] args) {
 
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.setNim("2215101036");
        mahasiswa.setNama("I Ketut Andi Suantara");
        mahasiswa.setTglLahir("01-01-2000");
        mahasiswa.setAlamat("Jl.Rinjani No.123");
        mahasiswa.setProdi("Ilmu Komputer");
        mahasiswa.setJurusan("Teknik Informatika");
        mahasiswa.setFakultas("Teknik Dan Kejuruan");
        mahasiswa.setJk(true);

        System.out.println("Data Mahasiswa:");
        System.out.println("NIM\t\t: " 				+ mahasiswa.getNim());
        System.out.println("Nama\t\t: "				+ mahasiswa.getNama());
        System.out.println("Tanggal Lahir\t: "		+ mahasiswa.getTglLahir());
        System.out.println("Alamat\t\t: " 			+ mahasiswa.getAlamat());       
        System.out.println("Jenis Kelamin\t: ");
        
        if (mahasiswa.getJk()) {
            System.out.println("Laki-laki");
        } else {
            System.out.println("Perempuan");
        }
        
        System.out.println("Prodi\t\t: " 	+ mahasiswa.getProdi());	
        System.out.println("Jurusan\t\t: " 	+ mahasiswa.getJurusan());
        System.out.println("Fakultas\t: " 	+ mahasiswa.getFakultas());
        
        
        System.out.println("\n");
        Dosen dosen = new Dosen();
        
        dosen.setNip("0988");
        dosen.setNama("Suparman");
        dosen.setTglLahir("03-03-2003");
        dosen.setAlamat("Jl.Tanggkuban Perahu No.456");
        dosen.setJk(false);
        
        System.out.println("Data Dosen:");
        System.out.println("NIP\t\t: " 				+ dosen.getNip());
        System.out.println("Nama\t\t: " 			+ dosen.getNama());
        System.out.println("Tanggal Lahir\t: " 		+ dosen.getTglLahir());
        System.out.println("Alamat\t\t: " 			+ dosen.getAlamat());
       
        System.out.println("Jenis Kelamin: ");
        if (dosen.getJk()) {
        	System.out.println("Laki-laki");
        } else {
        	System.out.println("Perempuan");
        }
        
        
        
    }
}
