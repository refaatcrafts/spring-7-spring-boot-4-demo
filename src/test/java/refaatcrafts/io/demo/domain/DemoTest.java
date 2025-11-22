package refaatcrafts.io.demo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DemoTest {

    @Test
    @DisplayName("Create demo should works")
    void create() {
        // Arrange & Act
        Demo demo = Demo.create("name", "description");
        // Assert
        assertThat(demo)
                .isNotNull()
                .hasFieldOrPropertyWithValue("name", "name")
                .hasFieldOrPropertyWithValue("description", "description");
    }


}