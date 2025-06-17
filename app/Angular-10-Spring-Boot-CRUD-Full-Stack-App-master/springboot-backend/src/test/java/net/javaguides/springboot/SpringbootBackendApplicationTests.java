package net.javaguides.springboot;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Deaktiviert, weil keine H2-Testdatenbank vorhanden ist")
class SpringbootBackendApplicationTests {

    @Test
    void contextLoads() {
        // absichtlich leer
    }

}
