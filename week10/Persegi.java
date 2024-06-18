package week10;

public class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void luas() {
        System.out.println(sisi*sisi);
    }

    public int getSisi() {
        return this.sisi; 
    }
}