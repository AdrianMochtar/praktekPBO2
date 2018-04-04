package praktekpbo2;
public class HerotankMobilelegendAction {
    public static void main(String[] args) {
        HerotankMobilelegend Hylos = new HerotankMobilelegend();
        
        Hylos.nama="Hylos";
        Hylos.atk=105;
        Hylos.hp=3309;
        Hylos.mana=430;
        Hylos.deff=14;
        
        Hylos.SupportTeam();
        System.out.println("Nama        : "+Hylos.methodHylos());
        System.out.println("Attack      : "+Hylos.methodHylos2());
        System.out.println("Health Poin : "+Hylos.methodHylos3());
        System.out.println("Mana        : "+Hylos.methodHylos4());
        System.out.println("Deffend     : "+Hylos.methodHylos5());
        
        Hylos.supportteam1();
        
        HerotankMobilelegend Akai = new HerotankMobilelegend();
        Akai.SupportTeam();
        
        HerotankMobilelegend Jhonson = new HerotankMobilelegend("Jhonson",112,
                2809,0,19);
        Jhonson.SupportTeam();
    }
    
}
