package com.xxl.job.executor.common.utils;

import com.alibaba.fastjson.JSON;
import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.exception.HttpProcessException;
import com.xxl.job.core.log.XxlJobLogger;
import com.xxl.job.executor.common.utils.http.Response;

import java.util.Map;

/**
 * @program: xxl-job
 * @description:
 * @author: Irving
 * @create: 2019-11-06
 **/
public class HttpUtil extends HttpClientUtil {

    public static Response sendGet(String url, Map<String, Object> param) {
        HttpConfig httpConfig = HttpConfig.custom().url(url).map(param);
        String response = null;
        try {
            response = get(httpConfig);
        } catch (HttpProcessException e) {
            XxlJobLogger.log("http error url:{}, param:{}, error:{}", url, param, e);
        }
        return JSON.parseObject(response, Response.class);
    }
}
