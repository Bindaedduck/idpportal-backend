package com.kstec.idpportal.domain.history.dto;

import com.kstec.idpportal.domain.history.entity.History;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public class HistoryResponse {
    private Long id;
    private String reqId;
    //...컬럼

    public static HistoryResponse from(History entity) {
        return HistoryResponse.builder()
                .id(entity.getId())
                .reqId(entity.getReqId())
                //...컬럼
                .build();
    }
}
