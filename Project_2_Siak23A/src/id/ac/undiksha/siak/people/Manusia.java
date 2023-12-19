package id.ac.undiksha.siak.people;

public class Manusia {
	
	private String nama;
	private String tglLahir;
	private boolean jk;
	private String alamat;

	
	public Manusia() {
		
		this.nama 		= "<masukan Nama>";
		this.tglLahir 	= "<masukan Tanggal Lahir>";
		this.alamat 	= "<masukan Alamat>";
		
	}

	public Manusia(String nama, String tglLahir,  boolean jk,  String alamat) {
		super();
		this.nama 		= nama;
		this.tglLahir 	= tglLahir;
		this.jk 		= jk;
		this.alamat 	= alamat;
		
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(String tglLahir) {
		this.tglLahir = tglLahir;
	}

	public boolean isJk() {
		return jk;
	}
	
	public String getJk() {
		if(this.isJk())
			return "Perempuan";
		else 
			return "Laki-laki";
	}

	public void setJk(boolean jk) {
		this.jk = jk;
	}
	
	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	
	public void printAll() {
		System.out.println(this.nama);
		System.out.println(this.tglLahir);
		System.out.println(this.getJk());
		System.out.println(this.alamat);
	}
	
}
