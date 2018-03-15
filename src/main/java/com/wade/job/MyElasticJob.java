package com.wade.job;

import com.dangdang.ddframe.job.api.JobExecutionMultipleShardingContext;
import com.dangdang.ddframe.job.plugin.job.type.simple.AbstractSimpleElasticJob;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tingyun on 2018/3/15.
 * 实现自己的任务调度
 */
public class MyElasticJob extends AbstractSimpleElasticJob {

    public void process(JobExecutionMultipleShardingContext jobExecutionMultipleShardingContext) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("date : " + sdf.format(new Date()) +
                " , 第" + jobExecutionMultipleShardingContext.getShardingItems() + "个分片 "
                + jobExecutionMultipleShardingContext.getJobParameter() + "  +");
    }
}
