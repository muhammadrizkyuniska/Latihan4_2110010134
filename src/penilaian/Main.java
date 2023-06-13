package penilaian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir rizky = new NilaiAkhir("Muhammad Rizky","2110010134",80,89,70);
        
        
        
        System.out.println("Nama Mahasiswa : "+rizky.getNama());
        System.out.println("Npm Mahasiswa : "+rizky.getNpm());
        System.out.println("Nilai akhir : "+rizky.hitungNilaiAkhir());
    }
    
}
