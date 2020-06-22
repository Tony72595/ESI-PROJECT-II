package org.esi.scholarship_second.ApplySecond;
import java.util.List;
import java.util.logging.Logger;
import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;

public class Congrats {
	private final static Logger LOGGER = Logger.getLogger(Congrats.class.getName());

	  public static void main(String[] args) {
	    ExternalTaskClient client = ExternalTaskClient.create()
	        .baseUrl("http://localhost:8080/engine-rest")
	        .asyncResponseTimeout(10000) // long polling timeout
	        .build();

	    // subscribe to an external task topic as specified in the process
	    client.subscribe("Congrats")
	        .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
	        .handler((externalTask, externalTaskService) -> {
	          

				// Put your business logic here
     
               
	          // Get a process variable

	          LOGGER.info("Congratulations!");

	          

	          // Complete the task
	          externalTaskService.complete(externalTask);
	        })
	        .open();    
	  }
	

}
