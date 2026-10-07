package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData(){
        System.out.println("This implementation using the Database");
        double data=45;
        return data;
    };

}
