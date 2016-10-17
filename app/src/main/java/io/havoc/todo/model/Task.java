package io.havoc.todo.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

/**
 * POJO Task
 */
public class Task {

    /**
     * Name of the Task
     */
    public String name;

    /**
     * Unique identifier for the Task
     */
    @SerializedName("t_id")
    public String taskId;

    /**
     * The unique identifier of the User which this Task belongs to
     */
    @SerializedName("user")
    public String userId;

    /**
     * Category of Task (School, Work, etc.)
     */
    public String category;

    /**
     * Current position of the Task in its parent list
     */
    public int indexInList;

    /**
     * Additional notes about the Task
     */
    public String description;

    /**
     * Due date of the Task
     */
    public Date dateDue;

    /**
     * Priority of the Task
     * 1 = LOW, 2 = MEDIUM, 3 = HIGH
     */
    public TaskPriorityEnum priority;

    /**
     * Status of the Task
     * DONE = "Done", INCOMPLETE = "Incomplete"
     */
    public TaskStatusEnum status;

    /**
     * Subtasks of the Task
     * Just a basic List of Strings
     */
    public List<Subtask> subtasks;

    public Task(String name, /*String taskId,*/ String description,
                String category, Date dateDue, String userId,
                int indexInList, TaskPriorityEnum priority, TaskStatusEnum status,
                List<Subtask> subtasks) {
        this.name = name;
//        this.taskId = taskId;
        this.description = description;
        this.category = category;
        this.dateDue = dateDue;
        this.userId = userId;
        this.indexInList = indexInList;
        this.priority = priority;
        this.status = status;
        this.subtasks = subtasks;
    }
}
