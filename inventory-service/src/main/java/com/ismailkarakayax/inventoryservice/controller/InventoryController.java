package com.ismailkarakayax.inventoryservice.controller;

import com.ismailkarakayax.inventoryservice.dto.InventoryResponse;
import com.ismailkarakayax.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    // http://localhost:8083/api/inventory/iphone-13,iphone-13-red

    // http://localhost:8083/api/inventory?skuCode=iphone-13&skuCode=iphone-13-red
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@PathVariable List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
