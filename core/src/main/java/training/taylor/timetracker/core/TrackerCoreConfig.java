package training.taylor.timetracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "training.taylor.timetracker.core")
public class TrackerCoreConfig {

    @Bean
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
