package com.oes.dao;

import com.oes.pojo.ChoiceQuestion;
import com.oes.pojo.PaperInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaperInfoDao {

    void insertPaperInfo(PaperInfo paperInfo);

    void updatePaperInfo(PaperInfo paperInfo);

    void deletePaperInfo(Integer paperId);

    List<PaperInfo> selectOnePaperInfo(PaperInfo paperInfo);

    List<PaperInfo> selectAllPaperInfo();
}

