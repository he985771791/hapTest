package com.hand.hap.companys.mapper;

import com.hand.hap.companys.dto.Companys;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;

public interface CompanysMapper extends Mapper<Companys>{
    List<Companys> selectIdName(Companys companys);
}