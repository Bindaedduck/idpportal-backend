package com.kstec.idpportal.domain.history.mapper;

import com.kstec.idpportal.domain.history.dto.HistoryResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HistoryMapper {
    HistoryResponse findAll();
}
