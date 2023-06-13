package penilaian;

public class NilaiAkhir extends Mahasiswa {
    int uts, uas, tugas;

    public NilaiAkhir(String nama, String npm,int uts, int uas, int tugas) {
        super.nama = nama;
        super.npm = npm;
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
        
    }

    @Override
    public void setNpm(String npm) {
        super.setNpm(npm); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNpm() {
        return super.getNpm(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }

    public NilaiAkhir() {
    }

    public int hitungNilaiAkhir(){
        return (int)(0.3*uts + 0.3*uas +0.4*tugas);
    }
    
    
    
    
}
