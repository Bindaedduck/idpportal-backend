package com.kstec.idp.portal.domain.history.entity.mongo;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
@Document(collection = "history_doc")
public class HistoryDoc {
    @Id
    private String id;
    private String fileName;
    private String status;
    private Object ocrData;
}
