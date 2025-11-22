package refaatcrafts.io.demo.infrastructure.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import refaatcrafts.io.demo.application.CreateDemoUseCase;
import refaatcrafts.io.demo.application.models.CreateDemoRequest;
import refaatcrafts.io.demo.application.models.CreateDemoResponse;

@RestController
@RequestMapping("/demo")
class DemoController {
    private final CreateDemoUseCase useCase;

    public DemoController(CreateDemoUseCase createDemoUseCase) {
        this.useCase = createDemoUseCase;
    }

    @RequestMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<CreateDemoResponse> createDemo(@RequestBody CreateDemoRequest request) {
        return ResponseEntity.ok(useCase.createDemo(request));
    }
}
