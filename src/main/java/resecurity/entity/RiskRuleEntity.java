package resecurity.entity;

import lombok.Data;

import java.util.List;

@Data
public class RiskRuleEntity {

    private ApplyToEntity applyTo;
    private List<Integer> prevRuleIds;
    private List<ConditionEntity> conditions;
    private ActivateForConditionEntity activateForCondition;
    private Integer riskScore;
    private Long ruleID;
    private ActionEntity actionID;

}
