package com.example.hivehbasees.bigdatadatasyncdemo.elasticsearch.controller;

import com.example.hivehbasees.bigdatadatasyncdemo.commonutil.ResponseResult;
import com.example.hivehbasees.bigdatadatasyncdemo.elasticsearch.service.ElasticSearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class EsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EsController.class);


    @Autowired
    private ElasticSearchService elasticSearchService;

    @PostMapping("/{indexName}/search")
    public ResponseResult searchIndex(@PathVariable String indexName,@RequestBody Map queryParams) {
        return elasticSearchService.searchIndex(indexName,queryParams);
    }


}
