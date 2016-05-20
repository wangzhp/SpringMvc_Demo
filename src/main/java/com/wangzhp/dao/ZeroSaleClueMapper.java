package com.wangzhp.dao;

import com.wangzhp.model.ZeroSaleClue;

public interface ZeroSaleClueMapper {
    int deleteByPrimaryKey(String userId);

    int insert(ZeroSaleClue record);

    int insertSelective(ZeroSaleClue record);

    ZeroSaleClue selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(ZeroSaleClue record);

    int updateByPrimaryKey(ZeroSaleClue record);
}