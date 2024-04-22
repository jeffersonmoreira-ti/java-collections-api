package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Task {
    private String description;

    public Task(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                '}';
    }
}
