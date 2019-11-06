package com.xxl.job.executor.common.utils.http;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * @program: xxl-job
 * @description:
 * @author: Irving
 * @create: 2019-11-06
 **/
@Data
public class Response {

    /**
     * code : 200
     * msg : OK
     * data : {"path":"https://pakbos.silot.ai/TC-v1.0.html"}
     */
    private int code;
    private String msg;
    private JSON data;

}
