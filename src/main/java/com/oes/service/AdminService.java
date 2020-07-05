package com.oes.service;

import com.oes.pojo.Admin;
import com.oes.pojo.ChoiceQuestion;

import java.util.List;

public interface AdminService {

    void insertAdmin(Admin admin);

    void updateAdmin(Admin admin);

    void deleteAdmin(Integer adminId);

    List<Admin> selectOneAdmin(Admin admin);

    List<Admin> selectAllAdmin();

}
