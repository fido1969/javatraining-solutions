package introconstructors;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start() {
        startDateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDateTime=" + startDateTime +
                ", duration=" + duration +
                '}';
    }

    public static void main(String[] args) {

        Task task = new Task("Plan", "Send the FC!");
        System.out.println(task);

        task.start();
        System.out.println(task);

        task.setDuration(2);
        System.out.println(task);
    }
}
