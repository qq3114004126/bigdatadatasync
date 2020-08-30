/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2012-2019. All rights reserved.
 */

package com.example.hivehbasees.bigdatadatasyncdemo.elasticsearch.estool;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class ElasticSearchReponseErrorResult {
    private Error error;

    private Integer status;

    @Data
    static class Error {
        @JSONField(name = "root_cause")
        private List<RootCause> rootCause;
        private String type;
        private String reason;
    }

    @Data
    static class RootCause {
        private String type;
        private String reason;
    }

}
