package com.oes.service;

import com.oes.pojo.ScoreInfo;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ScoreInfoService {

    void insertScoreInfo(ScoreInfo scoreInfo);

    void updateScoreInfo(ScoreInfo scoreInfo);

    void deleteScoreInfo(Integer scoreId);

    List<ScoreInfo> selectOneScoreInfo(ScoreInfo scoreInfo);

    List<ScoreInfo> selectAllScoreInfo();
}

