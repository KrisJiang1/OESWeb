package com.oes.dao;

import com.oes.pojo.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao {

    void insertAdmin(Admin admin);

    void updateAdmin(Admin admin);

    void deleteAdmin(Integer adminId);

    List<Admin> selectOneAdmin(Admin admin);

    List<Admin> selectAllAdmin();


}
