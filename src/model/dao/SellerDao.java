package model.dao;

import model.entity.Department;
import model.entity.Seller;

import java.sql.SQLException;
import java.util.List;

public interface SellerDao {

    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id) throws SQLException;

    List<Seller> findAll();

    List<Seller> findByDepartment(Department department);
}