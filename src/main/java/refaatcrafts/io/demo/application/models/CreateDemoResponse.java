package refaatcrafts.io.demo.application.models;

import java.time.Instant;

public record CreateDemoResponse(
        String name,
        String description,
        Instant createAt
) {
}


