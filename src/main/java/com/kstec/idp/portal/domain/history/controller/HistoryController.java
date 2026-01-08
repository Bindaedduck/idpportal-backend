package com.kstec.idp.portal.domain.history.controller;

import com.kstec.idp.portal.domain.history.dto.HistoryDocRequest;
import com.kstec.idp.portal.domain.history.dto.HistoryRequest;
import com.kstec.idp.portal.domain.history.dto.HistoryResponse;
import com.kstec.idp.portal.domain.history.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/history")
@RequiredArgsConstructor
public class HistoryController {

    private final HistoryService historyService;

    @GetMapping("/getHistoryList")
    public ResponseEntity<List<HistoryResponse>> getHistoryList() {
        List<HistoryResponse> list = historyService.getHistoryList();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/saveHistory")
    public ResponseEntity<String> saveHistory(@RequestBody HistoryRequest request) {
        historyService.saveHistory(request);
        return ResponseEntity.ok("save success!!!");
    }

    @PostMapping("/saveHistoryDoc")
    public ResponseEntity<String> saveHistoryDoc(@RequestBody HistoryDocRequest request){
        historyService.saveHistoryDoc(request);
        return ResponseEntity.ok("save success!!!");
    }
}
