package dao;

public class DaoImplv2 implements IDao{
    @Override
    public double getData(){
        System.out.println("This implementation using the a web service method");
        double data=15;
        return data;
    };

}
