
package cobayuk;

public class KalkulatorCoba {
    int angka1;
    int angka2;
    int penjumlahan;
    int pengurangan;
    int perkalian;
    int pembagian;

    public int getAngka1(int angka1) {
        return angka1;
    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    public int getPenjumlahan(){
        penjumlahan = angka1 + angka2;
        return penjumlahan;
    }
    public void setPenjumlahan(){
        this.penjumlahan = penjumlahan;
    }
    
    public int getPengurangan(){
        pengurangan = angka1 - angka2;
        return pengurangan;
    }
    public void setPengurangan(){
        this.pengurangan=pengurangan;
    }
    public int getPerkalian(){
        perkalian = angka1 * angka2;
        return perkalian;
    }

    public void setPerkalian(int perkalian) {
        this.perkalian = perkalian;
    }

    public int getPembagian() {
        pembagian = angka1 / angka2;
        return pembagian;
    }

    public void setPembagian(int pembagian) {
        this.pembagian = pembagian;
    }

   

   

   
}
