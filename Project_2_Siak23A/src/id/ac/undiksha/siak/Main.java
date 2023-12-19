package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;

public class Main {

	
	public static void main(String[] args) {
		
		System.out.println("Biodata Mahasiswa: ");
		Mahasiswa mhs3 = new Mahasiswa(
				"2215101036",
				"I Ketut Andi Suantara",
				"01-01-2000",
				false,
				"Jln.Rinjani No.123",
				"Ilmu Komputer"
				);
		mhs3.printAll();
		
		System.out.println("\n");
		
		System.out.println("Biodata Dosen: ");
		Dosen dsn3 = new Dosen(
				"123456789",
				"Suparman",
				"03 April 2003",
				false,
				"Jln.Rinjani No.456"
				);
		
		dsn3.printAll();
		
			 
	}

}
