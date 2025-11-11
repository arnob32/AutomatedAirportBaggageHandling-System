package test;


import org.junit.jupiter.api.*;

import  SmartAirport.src.main.java.ResourceManager;

import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

public class ResourceManagerTest {
    private ResourceManager rm;

    @BeforeEach
    void setup() {
        rm = new ResourceManager();
    }

    @Test
    void testClearOldLogs() {
        File dir = new File("logs");
        if (!dir.exists()) dir.mkdirs();
        rm.clearOldLogs();
        assertFalse(dir.exists(), "Logs folder should be deleted after clearOldLogs()");
    }
}
