package com.kstec.idpportal.domain.history.mapper;

import com.kstec.idpportal.domain.history.dto.HistoryResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HistoryMapper {
    List<HistoryResponse> findAll();
}
