package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de donnees");
        double temp=Math.random()*40;
        return 0;
    }
}
