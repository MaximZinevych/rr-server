package resecurity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RiskRuleDto {

    @JsonProperty("apply_to")
    private String applyTo;

    @JsonProperty("prev_rule_ids")
    private List<Integer> prevRuleIds;

    @JsonProperty("conditions")
    private List<ConditionDto> conditions;

    @JsonProperty("activate_for_condition")
    private String activateForCondition;

    @JsonProperty("risk_score")
    private Integer riskScore;

    @JsonProperty("rule_id")
    private Long ruleID;

    @JsonProperty("action_id")
    private String actionID;

    private String note;
}
