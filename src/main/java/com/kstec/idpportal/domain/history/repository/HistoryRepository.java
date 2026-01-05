package com.kstec.idpportal.domain.history.repository;

import com.kstec.idpportal.domain.history.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
