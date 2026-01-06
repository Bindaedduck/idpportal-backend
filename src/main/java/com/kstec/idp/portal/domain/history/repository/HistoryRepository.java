package com.kstec.idp.portal.domain.history.repository;

import com.kstec.idp.portal.domain.history.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
