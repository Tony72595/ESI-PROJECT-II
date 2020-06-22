package org.esi.scholarship_second.ApplySecond;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SecondRoundDelegate   implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		int comprehensive=(int)execution.getVariable("comprehensive");
		if(comprehensive>=5) {
			execution.setVariable("comprehensive", comprehensive);
        	
        }else {
        	execution.setVariable("Decline", comprehensive);
        }
		

		
		
	}

}
