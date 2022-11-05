package com.omricode.inventoryservice.controller;

import com.omricode.inventoryservice.dto.InventoryResponse;
import com.omricode.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @SneakyThrows
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        log.info("inventorydsadsa");
        return inventoryService.isInStock(skuCode);
    }
}
