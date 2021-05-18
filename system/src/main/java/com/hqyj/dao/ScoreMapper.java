package com.hqyj.dao;

import com.hqyj.entity.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(String studentNumber);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(String studentNumber);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}