package io.pivotal;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("rabbit.metrics")
public class RabbitMetricsPollableSourceProperties {
	
    /**
     * The RabbitMQ HTTP URI 
     */
    private String rabbitHttpUri = "https://buck.rmq.cloudamqp.com/api/queues";

    private String rabbitUsername = "buzdzklg";
    
    private String rabbitPassword = "gej1R4Ho0aZdmGL_g77_Fw-eLvolkD-b";

    private String vhostName = "buzdzklg";
    
    private String queueName = "demo-current.enrich-processor.demo-current";
    
	public String getRabbitHttpUri() {
		return rabbitHttpUri;
	}

	public void setRabbitHttpUri(String rabbitHttpUri) {
		this.rabbitHttpUri = rabbitHttpUri;
	}

	public String getRabbitUsername() {
		return rabbitUsername;
	}

	public void setRabbitUsername(String rabbitUsername) {
		this.rabbitUsername = rabbitUsername;
	}

	public String getRabbitPassword() {
		return rabbitPassword;
	}

	public void setRabbitPassword(String rabbitPassword) {
		this.rabbitPassword = rabbitPassword;
	}

	public String getVhostName() {
		return vhostName;
	}

	public void setVhostName(String vhostName) {
		this.vhostName = vhostName;
	}

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	
}
