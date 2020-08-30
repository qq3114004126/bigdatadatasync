package com.example.hivehbasees.bigdatadatasyncdemo.elasticsearch.service;

import com.example.hivehbasees.bigdatadatasyncdemo.commonutil.ResponseResult;
import com.example.hivehbasees.bigdatadatasyncdemo.elasticsearch.estool.EsFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ElasticSearchService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ElasticSearchService.class);

    @Autowired
    private EsFeignClient esFeignClient;

    public ResponseResult searchIndex(String indexName, Map queryParams) {
        Map search = esFeignClient.search(indexName, queryParams);
        return ResponseResult.success("success",search);
    }
}
