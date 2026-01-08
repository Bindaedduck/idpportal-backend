package com.kstec.idp.portal.domain.history.dto;

import com.kstec.idp.portal.domain.history.entity.jpa.History;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
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
