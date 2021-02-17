package com.example.demo.parseyml;

import com.example.demo.bean.TasksYml;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;

/**
 * @author ：Timber
 * @date ：Created in 2021/2/17 14:22
 * @modified By：
 */
public class ParseYmlToJob {
    public static void main(String[] args) {
        Yaml yaml = new Yaml(new Constructor(TasksYml.class));
        InputStream inputStream = ParseYmlToJob.class
                .getClassLoader()
                .getResourceAsStream("Tasks.yml");
        TasksYml tasksYml = yaml.load(inputStream);
        System.out.println(tasksYml);
    }
}
