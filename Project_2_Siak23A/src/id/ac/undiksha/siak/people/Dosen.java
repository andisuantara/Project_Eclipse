
package id.ac.undiksha.siak.people;


public class Dosen extends Manusia{
	private String nip;
//	private String nama;
//	private String tglLahir;
//	private String alamat;
//	private String jk;
	
	

	public String getNip() {
		return nip;
	}
	
	public Dosen(String nip, String nama, String tglLahir,  boolean jk, String alamat) {
	super(nama, tglLahir, jk, alamat);
	this.nip = nip;
	}
	

	public Dosen(String nama, String tglLahir, boolean jk, String alamat) {
		super(nama, tglLahir, jk, alamat);
	}

	public void setNip(String nip) {
		this.nip = nip;
	}
	
//	public String getNama() {
//		return nama;
//	}
//	
//	public void setNama(String nama) {
//		this.nama = nama;
//	}
//	
//	public String getTglLahir() {
//		return tglLahir;
//	}
//	
//	public void setTglLahir(String tglLahir) {
//		this.tglLahir = tglLahir;
//	}
//	
//	public String getAlamat() {
//		return alamat;
//	}
//	
//	public void setAlamat(String alamat) {
//		this.alamat = alamat;
//	}
//	
//	public String getJk() {
//		return jk;
//	}
//	
//	public void setJk(String jk) {
//		this.jk = jk;
//	}
	
	public void printAll() {
		System.out.println(this.nip);
		super.printAll();

	}
}
