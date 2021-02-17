package com.example.demo.bean;

import lombok.Data;

import java.util.List;

/**
 * @author ：Timber
 * @date ：Created in 2021/2/17 14:18
 * @modified By：
 */
@Data
public class JobsYml {
    private String jobName;
    private String triggerTime;
    private List<JobYml> jobs;

}
