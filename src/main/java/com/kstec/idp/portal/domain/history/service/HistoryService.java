package com.kstec.idp.portal.domain.history.service;

import com.kstec.idp.portal.domain.history.dto.HistoryDocRequest;
import com.kstec.idp.portal.domain.history.dto.HistoryRequest;
import com.kstec.idp.portal.domain.history.dto.HistoryResponse;
import com.kstec.idp.portal.domain.history.entity.jpa.History;
import com.kstec.idp.portal.domain.history.entity.mongo.HistoryDoc;
import com.kstec.idp.portal.domain.history.mapper.HistoryMapper;
import com.kstec.idp.portal.domain.history.repository.HistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoryService {

    private final HistoryRepository historyRepository;
    private final HistoryMapper historyMapper;
    private final MongoTemplate mongoTemplate;

    public void saveHistory(HistoryRequest request) {
        History entity = request.toEntity();
        historyRepository.save(entity);
    }

    public List<HistoryResponse> getHistoryList() {
        return historyMapper.findAll();
    }

    public void saveHistoryDoc(HistoryDocRequest request) {
        HistoryDoc entity = request.toEntity();
        mongoTemplate.save(entity);
    }
}
