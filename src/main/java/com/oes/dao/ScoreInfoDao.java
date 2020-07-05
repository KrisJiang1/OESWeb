package com.oes.dao;

import com.oes.pojo.ChoiceQuestion;
import com.oes.pojo.ScoreInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreInfoDao {

    void insertScoreInfo(ScoreInfo scoreInfo);

    void updateScoreInfo(ScoreInfo scoreInfo);

    void deleteScoreInfo(Integer scoreId);

    List<ScoreInfo> selectOneScoreInfo(ScoreInfo scoreInfo);

    List<ScoreInfo> selectAllScoreInfo();
}

