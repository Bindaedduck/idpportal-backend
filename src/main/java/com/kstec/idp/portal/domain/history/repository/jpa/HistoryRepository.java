package com.kstec.idp.portal.domain.history.repository.jpa;

import com.kstec.idp.portal.domain.history.entity.jpa.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}