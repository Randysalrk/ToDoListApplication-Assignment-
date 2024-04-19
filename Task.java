public class Task {
private String description;
private boolean completed;

public Task(String description) {
        this.description = description;
        this.completed = false;
    }

public String getDescription() {
        return description;
    }

public boolean isCompleted() {
        return completed;
    }

public void markAsCompleted() {
        completed = true;
    }
  /*   class Goals extends Task {
        private String targetedDays;
        public String targetedDays();
    } */
}
