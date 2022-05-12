class Ayam {
	private static String jenis_unggas = "Ayam";
	private static int jumlah_kaki = 2;
	
	public static String getJenisUnggas(){
		return jenis_unggas;
		}
	public static int getJumlahKaki(){
		return jumlah_kaki;
	}
	private static void berkokok(){
		System.out.println ("Aku Berkokok");
		}
	private static void berlari (){
		System.out.println ("Aku Berlari");
		}
	public static void main(String [] args ){
		System.out.println ( String.format("Jenis Unggas: %s",getJenisUnggas()));
		System.out.println (String.format( "jumlah kaki: %s",getJumlahKaki()));
			
		berkokok();
		berlari();
	}
}
