package dong.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private String addr;
}
