package com.kstec.idpportal.domain.history.service;

import com.kstec.idpportal.domain.history.dto.HistoryRequest;
import com.kstec.idpportal.domain.history.dto.HistoryResponse;
import com.kstec.idpportal.domain.history.entity.History;
import com.kstec.idpportal.domain.history.mapper.HistoryMapper;
import com.kstec.idpportal.domain.history.repository.HistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoryService {

    private final HistoryRepository historyRepository;
    private final HistoryMapper historyMapper;

    public void saveHistory(HistoryRequest request) {
        History entity = request.toEntity();
        historyRepository.save(entity);
    }

    public List<HistoryResponse> getHistoryList() {
        return historyMapper.findAll();
    }
}
