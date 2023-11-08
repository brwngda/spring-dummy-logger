package pl.exercise.sda.exercise7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NamedPairs implements Serializable {
    private String name;
    Map<String, String> pairs;
}