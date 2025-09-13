package training.taylor.timetracker.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import training.taylor.timetracker.core.dao.TimeEntry;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackerCoreConfig.class)
public class TrackerTest {

    @Autowired
    private Tracker tracker;

    @Before
    public void setUp() {
        // Ensure tracker starts clean before each test
        while (tracker.size() > 0) {
            tracker.remove(tracker.get(0));
        }
    }

    @Test
    public void testTrackerBeanInjection() {
        assertNotNull("Tracker bean should be injected by Spring", tracker);
    }

    @Test
    public void testAddEntry() {
        TimeEntry entry = new TimeEntry("Entry Test", 80.0f, 3);
        tracker.add(entry);
        assertEquals("Tracker should contain exactly 1 entry", 1, tracker.size());
        assertEquals("Stored entry should match the added entry", entry, tracker.get(0));
    }
}
