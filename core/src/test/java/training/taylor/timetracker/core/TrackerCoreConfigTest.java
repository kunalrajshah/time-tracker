package training.taylor.timetracker.core;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackerCoreConfig.class)
public class TrackerCoreConfigTest {

    @Autowired
    private List<TimeEntry> entries;

    @Test
    public void testBeanInjection() {
        assertNotNull("Entries list should not be null", entries);
        assertTrue("Entries list should be initially empty", entries.isEmpty());
    }
}
