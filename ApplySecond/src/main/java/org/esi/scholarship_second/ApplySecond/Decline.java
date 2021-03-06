package org.esi.scholarship_second.ApplySecond;




import java.util.logging.Logger;
import org.camunda.bpm.client.ExternalTaskClient;


public class Decline {
	private final static Logger LOGGER = Logger.getLogger(Decline.class.getName());

	  public static void main(String[] args) {
	    ExternalTaskClient client = ExternalTaskClient.create()
	        .baseUrl("http://localhost:8080/engine-rest")
	        .asyncResponseTimeout(10000) // long polling timeout
	        .build();

	    // subscribe to an external task topic as specified in the process
	    client.subscribe("Deny")
	        .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
	        .handler((externalTask, externalTaskService) -> {
	          // Put your business logic here
	    		

	          // Get a process variable
               

	          LOGGER.info("We sorry to inform you that your requirements is not qualified");

	          

	          // Complete the task
	          externalTaskService.complete(externalTask);
	        })
	        .open();  
	  }
	

}
