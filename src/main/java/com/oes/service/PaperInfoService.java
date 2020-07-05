package com.oes.service;

import com.oes.pojo.PaperInfo;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PaperInfoService {

    void insertPaperInfo(PaperInfo paperInfo);

    void updatePaperInfo(PaperInfo paperInfo);

    void deletePaperInfo(Integer paperId);

    List<PaperInfo> selectOnePaperInfo(PaperInfo paperInfo);

    List<PaperInfo> selectAllPaperInfo();
}

