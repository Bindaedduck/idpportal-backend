package com.kstec.idp.portal.domain.history.dto;

import com.kstec.idp.portal.domain.history.entity.History;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HistoryRequest {
    private String reqId;
    //...컬럼

    public History toEntity() {
        return History.builder()
                .reqId(this.reqId)
                //...컬럼
                .build();
    }
}
