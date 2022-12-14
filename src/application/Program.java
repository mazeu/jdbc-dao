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

//        System.out.println("teste do seller");
//        seller = sellerDao.findById(3);
//        System.out.println(seller);
//
//        System.out.println("----------------");
//        System.out.println("teste do findByDepartment");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }
//
//        System.out.println("----------------");
//        System.out.println("teste do findAll");
//        list = sellerDao.findAll();
//
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }
//
//        System.out.println("----------------");
//        System.out.println("teste do insert");
//        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
//        sellerDao.insert(newSeller);
//
//
//        System.out.println("Inserted! New id = " + newSeller.getId());
//
//
//        System.out.println("----------------");
//        System.out.println("teste do findAll");
//        list = sellerDao.findAll();
//
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }
//
//        System.out.println("----------------");
//        System.out.println("teste do update");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Waine");
//        sellerDao.update(seller);
//
//
//        System.out.println("update Completed!");

        System.out.println("----------------");
        System.out.println("teste do update");
        int id = 10;
        sellerDao.deleteById(id);
        System.out.println("Delete completed!");
    }
}
