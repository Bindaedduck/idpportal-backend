package com.kstec.idp.portal.domain.history.dto;

import com.kstec.idp.portal.domain.history.entity.mongo.HistoryDoc;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HistoryDocRequest {
    private String fileName;
    private String status;
    private String ocrData;

    public HistoryDoc toEntity() {
        return HistoryDoc.builder()
                .fileName(this.fileName)
                .status(this.status)
                .ocrData(this.ocrData)
                .build();
    }
}
