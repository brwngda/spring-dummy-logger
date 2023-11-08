package pl.exercise.sda.exercise7;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/pairs")
@RequiredArgsConstructor
class PairsController {

    private final NamedPairs namedPairs;

    @GetMapping("/{name}")
    public NamedPairs getNamedEmptyPairs(@PathVariable final String name) {
        return NamedPairs.builder()
                .name(name)
                .pairs(Map.of())
                .build();
    }
}
