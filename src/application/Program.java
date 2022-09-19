package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entity.Department;
import model.entity.Seller;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) throws SQLException {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println("teste do seller");
        seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("----------------");
        System.out.println("teste do findByDepartment");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("----------------");
        System.out.println("teste do findAll");
        list = sellerDao.findAll();

        for(Seller obj : list){
            System.out.println(obj);
        }
    }
}
