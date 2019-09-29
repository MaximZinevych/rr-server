package resecurity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConditionDto {
    private String condition;
    private String variable;
    private String value;
}
