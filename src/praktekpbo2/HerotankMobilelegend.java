package praktekpbo2;
public class HerotankMobilelegend {
    String nama;
    Integer atk;
    Integer hp;
    Integer mana;
    Integer deff;

    public HerotankMobilelegend() {
        System.out.println();
        nama="Akai";
        atk=115;
        hp=2769;
        mana=422;
        deff=17;
    }

    public HerotankMobilelegend(String nama, Integer atk, Integer hp, 
            Integer mana, Integer deff) {
        this.nama = nama;
        this.atk = atk;
        this.hp = hp;
        this.mana = mana;
        this.deff = deff;
    }
    
    
    
    void SupportTeam(){
        System.out.println("Nama        : "+nama);
        System.out.println("Attack      : "+atk);
        System.out.println("Health Poin : "+hp);
        System.out.println("Mana        : "+mana);
        System.out.println("Deffend     : "+deff);
        System.out.println();
        
}
        String methodHylos(){
            String sihylos;
            sihylos =("Hylos");
            return sihylos;
        }
        
        int methodHylos2(){
            int sihylos;
            sihylos =105;
            return sihylos;
        }
        
        int methodHylos3(){
            int sihylos;
            sihylos =3309;
            return sihylos;
        }
        
        int methodHylos4(){
            int sihylos;
            sihylos =430;
            return sihylos;
        }
        
        int methodHylos5(){
            int sihylos;
            sihylos =14;
            return sihylos;
        }
        
        void supportteam1(){
            System.out.println();
            System.out.println("Nama        : "+methodHylos());
            System.out.println("Attack      : "+methodHylos2());
            System.out.println("Health Poin : "+methodHylos3());
            System.out.println("Mana        : "+methodHylos4());
            System.out.println("Deffend     : "+methodHylos5());
        }
        
    
}
