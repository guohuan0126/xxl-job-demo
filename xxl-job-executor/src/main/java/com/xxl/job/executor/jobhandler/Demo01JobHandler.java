package com.xxl.job.executor.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: xxl-job
 * @description:
 * @author: Irving
 * @create: 2019-11-05
 **/
@JobHandler(value = "demo01JobHandler")
@Component
public class Demo01JobHandler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param){

        System.out.println("demo01执行，执行时间：" + new Date());
        System.out.println("param:"+param);
        if ("5".equals(param)) {
            throw new NullPointerException();
        }

        return SUCCESS;
    }
}
