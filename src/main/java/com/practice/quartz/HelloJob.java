package com.practice.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author Luo Bao Ding
 * @since 2019/5/21
 */
public class HelloJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("*************hello job");
    }
}
