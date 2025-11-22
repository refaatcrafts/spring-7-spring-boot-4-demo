package refaatcrafts.io.demo.application;

import org.springframework.stereotype.Service;
import refaatcrafts.io.demo.application.models.CreateDemoRequest;
import refaatcrafts.io.demo.application.models.CreateDemoResponse;
import refaatcrafts.io.demo.domain.Demo;

@Service
public class CreateDemoUseCase {

    public CreateDemoResponse createDemo(CreateDemoRequest request) {
        var demo = Demo.create(request.name(), request.description());
        return new CreateDemoResponse(demo.getName(), demo.getDescription(), demo.getCreatedAt());
    }
}
