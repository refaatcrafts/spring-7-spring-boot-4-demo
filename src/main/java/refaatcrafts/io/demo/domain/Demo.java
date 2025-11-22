package refaatcrafts.io.demo.domain;

import java.time.Instant;

public class Demo {
    private String name;
    private String description;
    private Instant createdAt;

    private Demo(String name, String description) {
        this.name = name;
        this.description = description;
        this.createdAt = Instant.now();
    }

    public static Demo create(String name, String description) {
        return new Demo(name, description);
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
