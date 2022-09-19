package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entity.Department;
import model.entity.Seller;

import java.sql.SQLException;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws SQLException {
        Department obj = new Department(1,"Books");


        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println("teste do seller");
        seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
