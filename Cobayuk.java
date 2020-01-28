
package cobayuk;

public class Cobayuk {

    public static void main(String[] args) {
       KalkulatorCoba dinda = new KalkulatorCoba();
        dinda.setAngka1(30);
        dinda.setAngka2(6);
        
        
        
        System.out.println("Hasil Dari Penjumlahan : " + dinda.getPenjumlahan());
        
       
        System.out.println("Hasil Dari Pengurangan : " + dinda.getPengurangan());
        
       
        System.out.println("Hasil Dari Perkalian : " + dinda.getPerkalian());
        
        
        System.out.println("Hasil Dari Pembagian : " + dinda.getPembagian());

    }
    
}
