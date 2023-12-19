package id.ac.undiksha.siak.people;

public class Mahasiswa extends Manusia{
	
	
	private String nim;
//	private String nama;
//	private String tglLahir;
//	private String alamat;
	private String prodi;
//	private boolean jk;
	
	public Mahasiswa() {
		this.nim   		= "<masukan Nim>";
//		this.nama     	= "<masukan Nama>";
//		this.tglLahir 	= "<masukan Tanggal Lahir>";
//		this.alamat 	= "<masukan Alamat>";
		this.prodi 		= "<masukan Prodi>";
	
	}
		public Mahasiswa( String nim, String nama, String tglLahir, boolean jk, String alamat,  String prodi) {
		super(nama, tglLahir, jk, alamat);
		this.nim 	= nim;
		this.prodi 	= prodi;
	}
		
	public String getNim() {
		return nim;
	}
	
	
//	public Mahasiswa(
//			String nim, 
//			String nama, 
//			String tglLahir, 
//			String alamat, 
//			String prodi, 
//			boolean jk
//		) {
//		super();
//		this.nim 		= nim;
//		this.nama 		= nama;
//		this.tglLahir 	= tglLahir;
//		this.alamat 	= alamat;
//		this.prodi 		= prodi;
//		this.jk 		= jk;
//	}

	
	public Mahasiswa(String nama, String tglLahir, boolean jk, String alamat) {
		super(nama, tglLahir, jk, alamat);

	}

	public void setNim(String nim) {
		this.nim = nim;
	}
//	public String getNama() {
//		return nama;
//	}
//	public void setNama(String nama) {
//		this.nama = nama;
//	}
//	public String getTglLahir() {
//		return tglLahir;
//	}
//	public void setTglLahir(String tglLahir) {
//		this.tglLahir = tglLahir;
//	}
//	public String getAlamat() {
//		return alamat;
//	}
//	public void setAlamat(String alamat) {
//		this.alamat = alamat;
//	}
	public String getProdi() {
		return prodi;
	}
	public void setProdi(String prodi) {
		this.prodi = prodi;
	}
//	public boolean isJk() {
//		return jk;
//	}
//	public void setJk(boolean jk) {
//		this.jk = jk;
//	}
//	
	public void printAll() {
		System.out.println(this.nim);
		super.printAll();
		System.out.println(this.prodi);
	}
}
