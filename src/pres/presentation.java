package pres;


import metier.MetierImpl;
import ext.DaoImpl2;

public class presentation {
    public static void main(String[] args){
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("resultat"+metier.calcul());





    }
}
