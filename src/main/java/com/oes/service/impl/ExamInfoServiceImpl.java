package com.oes.service.impl;

import com.oes.dao.ExamInfoDao;
import com.oes.pojo.ExamInfo;
import com.oes.service.ExamInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExamInfoServiceImpl implements ExamInfoService {

    @Autowired
    ExamInfoDao examInfoDao;

    @Override
    public void insertExamInfo(ExamInfo examInfo) {
        examInfoDao.insertExamInfo(examInfo);
    }

    @Override
    public void updateExamInfo(ExamInfo examInfo) {
        examInfoDao.updateExamInfo(examInfo);
    }

    @Override
    public void deleteExamInfo(ExamInfo examInfo) {
        examInfoDao.deleteExamInfo(examInfo);
    }

    @Override
    public List<ExamInfo> selectOneExamInfo(ExamInfo examInfo) {
        return examInfoDao.selectOneExamInfo(examInfo);
    }

    @Override
    public List<ExamInfo> selectAllExamInfo() {
        return examInfoDao.selectAllExamInfo();
    }
}
