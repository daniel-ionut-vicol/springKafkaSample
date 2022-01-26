package ro.develbox.sampleSpringkafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FooDto {
    private long id;
    private String name;
}
