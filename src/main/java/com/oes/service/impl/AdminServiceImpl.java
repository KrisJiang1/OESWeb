package com.oes.service.impl;

import com.oes.dao.AdminDao;
import com.oes.pojo.Admin;
import com.oes.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDao adminDao;

    @Override
    public void insertAdmin(Admin admin) {
        adminDao.insertAdmin(admin);
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminDao.updateAdmin(admin);
    }

    @Override
    public void deleteAdmin(Integer adminId) {
        adminDao.deleteAdmin(adminId);
    }

    @Override
    public List<Admin> selectOneAdmin(Admin admin) {
        return adminDao.selectOneAdmin(admin);
    }

    @Override
    public List<Admin> selectAllAdmin() {
        return adminDao.selectAllAdmin();
    }
}
