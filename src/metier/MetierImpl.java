package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;
    @Override
    public double calcul() {
        double temp=dao.getData();
        double res=temp*540/Math.cos(temp*Math.PI);


        return res;
    }

    public void setDao(IDao dao) {

        this.dao = dao;
    }
}
