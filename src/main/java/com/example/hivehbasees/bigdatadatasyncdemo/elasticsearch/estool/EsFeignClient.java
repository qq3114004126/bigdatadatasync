package com.example.hivehbasees.bigdatadatasyncdemo.elasticsearch.estool;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name = "${feign.name}",url = "${feign.url}")
public interface EsFeignClient {

    /**
     * 单个搜索
     * @param indexName indexName
     * @param queryParams queryParams
     * @return Map
     */
    @RequestMapping(method = RequestMethod.POST, value = "/{indexName}/_search",
            consumes = "application/json")
    Map search(@PathVariable(name = "indexName", required = false) String indexName, @RequestBody Map queryParams);

}
