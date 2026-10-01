package edu.stevens.quack.health;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    private final HealthRepository healthRepository;

    public HealthController(HealthRepository healthRepository) {
        this.healthRepository = healthRepository;
    }

    @GetMapping
    public ResponseEntity<HealthResponse> health() {
        if (healthRepository.isDatabaseUp()) {
            return ResponseEntity.ok(new HealthResponse("up", "up"));
        }
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(new HealthResponse("down", "down"));
    }

    public record HealthResponse(String status, String database) {
    }
}
