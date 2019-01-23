/**
 * 
 */
package com.cg.configurationwebsite.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ugawari
 *
 */
@RefreshScope
@Controller
public class HelloWorldController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/index")
	public ModelAndView getHelloWorld() {
		//String message = restTemplate.exchange("http://helloworld-service/helloworlds",  HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
		ResponseEntity<String> entity= restTemplate.getForEntity("http://msg-service/messages",  String.class);
		String message = entity.getBody();
		return new ModelAndView("index", "message", message);
	}
}
