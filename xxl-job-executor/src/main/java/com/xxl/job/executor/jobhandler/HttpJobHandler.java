package com.xxl.job.executor.jobhandler;

import com.google.common.collect.Maps;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.executor.common.utils.HttpUtil;
import com.xxl.job.executor.common.utils.http.Response;
import org.springframework.stereotype.Component;

/**
 * 跨平台Http任务
 *
 * @author xuxueli 2018-09-16 03:48:34
 */
@JobHandler(value = "httpJobHandler")
@Component
public class HttpJobHandler extends IJobHandler {

    @Override
    public ReturnT<String> execute(String param) {

        String url = "http://localhost:14005/api/v1/common/tc/get";
        Response response = HttpUtil.sendGet(url, Maps.<String, Object>newHashMap());
        System.out.println(response.toString());
       return SUCCESS;
    }

}
