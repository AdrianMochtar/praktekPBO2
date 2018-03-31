package praktekpbo2;

public class Rectangle {
    double panjang;
    double lebar;

    public Rectangle() {
        panjang=5;
        lebar=2;
    }

    public Rectangle(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    void cetakinfo (){
        System.out.println("panjang = "+panjang);
        System.out.println("lebar   = "+lebar);
    }
    
    double hitungLuas(){
        double Luas;
        Luas=panjang*lebar;
        return Luas;
    }
    
    void cetakLuas(){
        System.out.println("Luas Rectangle = "+hitungLuas());
        
    }
}
