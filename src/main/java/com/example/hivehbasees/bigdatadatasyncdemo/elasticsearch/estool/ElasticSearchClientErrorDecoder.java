///*
// * Copyright (c) Huawei Technologies Co., Ltd. 2012-2019. All rights reserved.
// */
//
//package com.example.hivehbasees.bigdatadatasyncdemo.elasticsearch.estool;
//
//import feign.Response;
//import feign.Util;
//import feign.codec.ErrorDecoder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.util.StringUtils;
//
//import java.io.IOException;
//
//public class ElasticSearchClientErrorDecoder implements ErrorDecoder {
//    private static final Logger LOGGER = LoggerFactory.
//            getLogger(ElasticSearchClientErrorDecoder.class);
//
//    private static final String DEFAULT_ERROR = "query failed.";
//
//    @Override
//    public Exception decode(String s, Response response) {
//        Exception exception = null;
//
//        try {
//            String json = Util.toString(response.body().asReader());
//            if (StringUtils.isEmpty(json)) {
//                return new RuntimeException(DEFAULT_ERROR);
//            }
//            ElasticSearchReponseErrorResult result = JSONObject.parseObject(json,
//                ElasticSearchReponseErrorResult.class);
//            // 业务异常包装成自定义异常类MyException
//            if (result.getStatus() != HttpStatus.OK.value()) {
//                exception = new ElasticSearchException(result.getError().toString(),
//                        result.getStatus());
//            }
//        } catch (IOException ex) {
//            LOGGER.error(ex.getMessage(), ex);
//            exception = new RuntimeException(DEFAULT_ERROR);
//        }
//        return exception;
//    }
//
//}
