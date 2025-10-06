package com.juniorjvsousa.Coding_Challenge_API_rest.controller;

import com.juniorjvsousa.Coding_Challenge_API_rest.dto.StatistcsResponse;
import com.juniorjvsousa.Coding_Challenge_API_rest.service.TrasactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatistica")
public class StatistcController {
    private TrasactionService trasactionService;

    public StatistcController(TrasactionService trasactionService) {
        this.trasactionService = trasactionService;

    }

    @GetMapping
    public ResponseEntity<StatistcsResponse> getStatics() {
        DoubleSummaryStatistics stats = trasactionService.getStatidtics();
        return ResponseEntity.ok(new StatistcsResponse(stats));
    }

}
