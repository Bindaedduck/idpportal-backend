package com.kstec.idp.portal.domain.history.repository.mongo;

import com.kstec.idp.portal.domain.history.entity.mongo.HistoryDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HistoryDocRepository extends MongoRepository<HistoryDoc, String> {
}
