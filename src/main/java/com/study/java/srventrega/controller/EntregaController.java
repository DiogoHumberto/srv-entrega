package com.study.java.srventrega.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class EntregaController {

    @GetMapping
    public ResponseEntity<?> gerarLog(@RequestParam String id) {

        log.info("Iniciando process ID -->> {}", id);

        log.info("in process ID ->>- {}", id);
        log.info("in process ID ->>- {}", id);

        log.info("finsh process ID <<-->> {}", id);

        return ResponseEntity.ok("");
    }
}
