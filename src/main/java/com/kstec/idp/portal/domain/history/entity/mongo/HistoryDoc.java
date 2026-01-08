package com.kstec.idp.portal.domain.history.entity.mongo;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Document(collection = "history_doc")
public class HistoryDoc {
    @Id
    private String id;
    private String fileName;
    private String status;
    private Object ocrData;
}
