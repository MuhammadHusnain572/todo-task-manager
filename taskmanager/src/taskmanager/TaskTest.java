package taskmanager;

import static org.junit.Assert.*;
import org.junit.Test;

public class TaskTest {

    @Test
    public void testToggleCompleted() {
        Task task = new Task("Test Task");
        assertFalse(task.isCompleted());  
        task.toggleCompleted();
        assertTrue(task.isCompleted()); 
    }

    @Test
    public void testSetTitle() {
        Task task = new Task("Old Title");
        task.setTitle("New Title");
        assertEquals("New Title", task.getTitle());
    }
}

