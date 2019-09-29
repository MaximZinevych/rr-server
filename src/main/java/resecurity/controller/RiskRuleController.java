package resecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import resecurity.entity.*;

import java.util.Arrays;

@RestController
public class RiskRuleController {

    @RequestMapping("/riskrule")
    public RiskRuleEntity getRiskRule(){
        ApplyToEntity applyTo = new ApplyToEntity();
        applyTo.setApplyTo("TESTAPPLYTO");

        ConditionEntity condition = new ConditionEntity();
        condition.setCondition("TESTCONDITION");
        condition.setVariable("TESTVARIABLE");
        condition.setVariable("TESTVALUE");

        ActivateForConditionEntity activateForCondition = new ActivateForConditionEntity();
        activateForCondition.setActivateForCondition("TESTACTICATOFORCONDITION");

        ActionEntity action = new ActionEntity();
        action.setAction("TESTACTION");

        RiskRuleEntity rr = new RiskRuleEntity();
        rr.setApplyTo(applyTo);
        rr.setPrevRuleIds(Arrays.asList(1,2,3,4,5));
        rr.setConditions(Arrays.asList(condition));
        rr.setActivateForCondition(activateForCondition);
        rr.setRiskScore(100);
        rr.setRuleID(100L);
        rr.setActionID(action);



        return rr;
    }

}
