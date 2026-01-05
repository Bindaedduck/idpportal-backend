package com.kstec.idpportal.domain.history.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor //Builder를 사용하려면 내부적으로 필요
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "req_id", nullable = false)
    private String reqId;

    //... 컬럼
}
