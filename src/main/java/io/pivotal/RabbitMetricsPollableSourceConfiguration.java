package io.pivotal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.app.annotation.PollableSource;
import org.springframework.cloud.stream.app.trigger.TriggerConfiguration;
import org.springframework.cloud.stream.app.trigger.TriggerPropertiesMaxMessagesDefaultOne;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Import;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@EnableBinding(Source.class)
@EnableConfigurationProperties(RabbitMetricsPollableSourceProperties.class)
@Import({TriggerConfiguration.class, TriggerPropertiesMaxMessagesDefaultOne.class})
public class RabbitMetricsPollableSourceConfiguration {
	
    @Autowired
    private RabbitMetricsPollableSourceProperties properties;
	
    @PollableSource
    public String getMetrics() throws JsonProcessingException {
    	 final String uri = properties.getRabbitHttpUri() + 
    			 "/" + properties.getVhostName() + "/" + properties.getQueueName();
    	 
         RestTemplate restTemplate = new RestTemplate();
        
         /* Kudos to this guide http://www.baeldung.com/how-to-use-resttemplate-with-basic-authentication-in-spring */
         restTemplate.getInterceptors().add(
        		new BasicAuthorizationInterceptor(properties.getRabbitUsername(), properties.getRabbitPassword()));
        
         restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        
         RabbitQueue metrics = restTemplate.getForObject(uri, io.pivotal.RabbitQueue.class);
         
         ObjectMapper mapper = new ObjectMapper();
         
         String jsonString = mapper.writeValueAsString(metrics);
         
         //System.out.println(jsonString);
         
         return jsonString;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(RabbitMetricsPollableSourceConfiguration.class, args);
	}
}
