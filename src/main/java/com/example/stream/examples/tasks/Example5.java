package com.example.stream.examples.tasks;

import com.example.domain.Task;

import javax.swing.*;
import java.util.List;
import java.util.Set;

import static com.example.utils.DataUtils.getTasks;

/**
 * Find all unique tags from all tasks
 */
public class Example5 {

    public static void main(String[] args) {
        List<Task> tasks = getTasks();
        System.out.println(tasks);
       Set<String> x=  tasks.get(0).getTags();
        List<String> stringtasks = allDistinctTags(tasks);
        System.out.println(stringtasks);
    }

    private static List<String> allDistinctTags(List<Task> tasks) {
        return tasks.stream().flatMap(task -> task.getTags().stream()).distinct().toList();
    }
}
