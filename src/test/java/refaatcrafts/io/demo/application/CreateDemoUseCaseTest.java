package refaatcrafts.io.demo.application;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import refaatcrafts.io.demo.application.models.CreateDemoRequest;

import static org.assertj.core.api.Assertions.*;

class CreateDemoUseCaseTest {

    @Test
    @DisplayName("Create Demo Use Case Should Works")
    void createDemo() {
        // Arrange
        var request = new CreateDemoRequest("name", "description");
        var useCase = new CreateDemoUseCase();

        // Act
        var response = useCase.createDemo(request);

        assertThat(response).isNotNull();
        assertThat(response.name()).isEqualTo("name");
        assertThat(response.description()).isEqualTo("description");
        assertThat(response.createAt()).isAfter(java.time.Instant.now().minusSeconds(1));
    }
}