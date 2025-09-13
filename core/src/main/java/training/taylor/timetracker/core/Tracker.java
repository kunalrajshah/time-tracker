package training.taylor.timetracker.core;

import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

@Component
public class Tracker {

    private final List<TimeEntry> entries = new ArrayList<>();

    public void add(TimeEntry entry) {
        if (entry != null) {
            entries.add(entry);
        }
    }

    public void remove(TimeEntry entry) {
        if (entry != null) {
            entries.remove(entry);
        }
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        if (index >= 0 && index < entries.size()) {
            return entries.get(index);
        }
        throw new IndexOutOfBoundsException("Invalid index: " + index);
    }
}
