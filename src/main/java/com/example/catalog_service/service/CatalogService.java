package com.example.catalog_service.service;

import com.example.catalog_service.dto.CatalogDto;
import com.example.catalog_service.entity.CatalogEntity;

public interface CatalogService {

    Iterable<CatalogEntity> getAllCatalogs();

    void saveItem(CatalogEntity item);
}
